package MultipleChoice_StudentsInformation;

public class Studentclass {
    private String name;
    private int marks;

    public Studentclass(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Studentclass{" +
                "name='" + name + '\'' +
                ", marks=" + marks +
                '}';
    }

    public Studentclass() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }
}
