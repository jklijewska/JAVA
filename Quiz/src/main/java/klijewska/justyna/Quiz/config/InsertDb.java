package klijewska.justyna.Quiz.config;

import java.util.ArrayList;
import java.util.List;

public class InsertDb {
    private ConnectDb connect = new ConnectDb();

    public void addInsert() {

        List<String> inserts = new ArrayList<>();

        inserts.add("INSERT INTO test VALUES('1', 'Pojęcie procesu sterowania obejmuje zestaw:', " +
                "'wskaznika jakości procesu i sterowania', 'trajetorii stanu i sterowania','" +
                "normę euklidesową i wartości chwilowe','2')");

        inserts.add("INSERT INTO test VALUES('2', 'Warunkiem koniecznym słabego lokalnego ekstremum funcjonału " +
                "na zbiorze krzywych jest:', " +
                "'spełnienie równania Eulera-Lagrangea', 'istnienie punktu przegięcia','" +
                "nie istnieją warunki optymalności wyższych rzędów','1')");

        inserts.add("INSERT INTO test VALUES('3', 'Nieprawdą jest, że zasada maksimum Pontriagina:', " +
                "'jest to warunke konieczny optymalności procesu sterowania', 'zakłada istnienie zmiennej kostanu " +
                "spełniającej równanie kostanu','" +
                "jest warunkiem wystarczającym oprymalności pracesu sterowania','3')");

        inserts.add("INSERT INTO test VALUES('4', 'Jedną z zasad optymalności Bellmana jest:', " +
                "'Strategia optymalna zależy od historii procesu.', 'Każdy końcowy odcinek trajektorii optymalnej jest " +
                "sam dla sebie trajektorią optymlaną','" +
                "Strategia optymalna ma tę własnąść, iż decyzje nie muszą tworzyć strategii optymalnej, ważny jest stan " +
                "początkowy i decyzja początkowa','2')");

        inserts.add("INSERT INTO test VALUES('5', 'Sterowanie optymalne stanowi rozwinięcie:', " +
                "'statystyki', 'zasady maksimum Pontriagina','" +
                "rachunku wariacyjnego','3')");

        for (int i = 0; i < inserts.size(); i++) {
            connect.dbInsert(inserts.get(i));
        }

    }
}