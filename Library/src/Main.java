import model.Book;

public class Main {
    public static void main(String[] args) {
        Book it = new Book(1L,"Cos", "1555", 1L);

        it.setTitle("Miecz przeznaczenia");
        System.out.println(it.getTitle());
  //  it.getTitle();

    }
}
