public class testBookStore {
    public static void main(String[] args) {
        BookStore bookStore = new BookStore(); //создаем новый книжный магазин
        Book myBook1 = new Book("Гарри Поттер и Орден Феникса", 10000, "Дж. К. Роулинг", 2003);
        bookStore.addPrintEdition(myBook1);
        bookStore.addPrintEdition(new Book("Гарри Поттер и Принц-полукровка", 10000, "Дж. К. Роулинг", 2005));
        Magazine myMagazine = new Magazine("Игромания", 555, "Видеоигры", 101);
        bookStore.addPrintEdition(myMagazine);
        bookStore.printBookStore();
        System.out.println("Количество книг в магазине: " + bookStore.getBooksCount());
        System.out.println("Количество журналов в магазине: " + bookStore.getMagazinesCount());
        if (bookStore.findPrintEdition(myBook1)) { //ищем книгу
            System.out.println("Да");
        } else {
            System.out.println("Нет");
        }
        bookStore.removePrintEdition(myBook1);
        bookStore.printBookStore();
        if (bookStore.findPrintEdition(myBook1)) { //ищем книгу
            System.out.println("Да");
        } else {
            System.out.println("Нет");
        }
    }
}
