import java.util.ArrayList;

public class BookStore {
    private ArrayList<PrintEdition> printEditions = new ArrayList<>();

    public BookStore() {
    }

    public BookStore(ArrayList<PrintEdition> printEditions) {
        this.printEditions = printEditions;
    }

    public void addPrintEdition(PrintEdition printEdition) { //метод для добавления печатных изданий
        printEditions.add(printEdition);
    }

    public Boolean findPrintEdition(PrintEdition printEdition) {
        return printEditions.contains(printEdition);
    }

    public void removePrintEdition(PrintEdition printEdition) {
        printEditions.remove(printEdition);
    }

    public int getBooksCount() {
        int count = 0;
        for (PrintEdition printEdition : printEditions) {
            if (printEdition instanceof Book) {
                count++;
            }
        }
        return count;
    }

    public int getMagazinesCount() {
        int count = 0;
        for (PrintEdition printEdition : printEditions) {
            if (printEdition instanceof Magazine) {
                count++;
            }
        }
        return count;
    }

    public void printBookStore() { //для вывода на экран списка печатных изданий в книжном магазине
        System.out.println("В книжном магазине: ");
        for (PrintEdition printEdition : printEditions) {
            System.out.println("\t" + printEdition.toString());
        }
    }
}
