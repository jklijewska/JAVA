import klijewska.justyna.model.Task;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello me!");
        Task zacharie = new Task("f", "g", "b", "aa");
        zacharie.setDateOfTask("bddffd");
        System.out.println(zacharie.getLabelOfTask());
        System.out.println(zacharie);
    }
}
