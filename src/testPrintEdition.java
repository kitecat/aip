import java.util.Scanner;

public class testPrintEdition {
    public static void main(String[] args) {
        PrintEdition printEdition = new PrintEdition();
        Scanner in = new Scanner(System.in);
        System.out.print("Введите название: ");
        String name = in.next();
        printEdition.setName(name);
        System.out.print("Введите тираж: ");
        int edition = in.nextInt();
        printEdition.setEdition(edition);
        System.out.println("Печатное издание: " + printEdition.getName() + " " + printEdition.getEdition());
        System.out.println();
        Book myBook1 = new Book("Гарри Поттер и Орден Феникса", 10000, "Дж. К. Роулинг", 2003);
        Book myBook2 = new Book();
        System.out.print("Введите название книги: ");
        name = in.next();
        myBook2.setName(name);
        System.out.print("Введите тираж книги: ");
        edition = in.nextInt();
        myBook2.setEdition(edition);
        System.out.print("Введите автора книги: ");
        String author = in.next();
        myBook2.setAuthor(author);
        System.out.print("Введите год выпуска книги: ");
        int year = in.nextInt();
        myBook2.setYear(year);
        System.out.println();
        System.out.println("Первая книга: " + myBook1.toString());
        System.out.println("Вторая книга: " + myBook2.toString());
        Magazine magazine = new Magazine();
        magazine.setAllInfo();
        System.out.println(magazine.toString());
    }
}
