import java.util.Scanner;

public class Magazine extends PrintEdition {
    private String topic;
    private int issue;

    public Magazine() {
        super();
        topic = "";
        issue = 0;
    }

    public Magazine(String name, int edition, String topic, int issue) {
        super(name, edition);
        this.topic = topic;
        this.issue = issue;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public int getIssue() {
        return issue;
    }

    public void setIssue(int issue) {
        this.issue = issue;
    }

    public void setAllInfo() {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите название журнала: ");
        String name = in.next(); //метод next() позволяет вводить строки, но без пробелов
        setName(name);
        System.out.print("Введите тираж журнала: ");
        int edition = in.nextInt();
        setEdition(edition);
        System.out.print("Введите тематику журнала: ");
        topic = in.next();
        System.out.print("Введите номер журнала: ");
        issue = in.nextInt();
    }

    @Override
    public String toString() {
        return "Журнал " +
                "название = '" + getName() + '\'' +
                ", тираж = '" + getEdition() + '\'' +
                ", тематика = '" + topic + '\'' +
                ", номер = " + issue;
    }
}