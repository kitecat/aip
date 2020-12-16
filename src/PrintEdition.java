public class PrintEdition {
    private String name;
    private int edition;

    public PrintEdition() {
        name = "";
        edition = 0;
    }

    public PrintEdition(String name, int edition) {
        this.name = name;
        this.edition = edition;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEdition() {
        return edition;
    }

    public void setEdition(int edition) {
        this.edition = edition;
    }
}