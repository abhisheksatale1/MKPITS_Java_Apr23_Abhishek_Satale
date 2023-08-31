package Genericclass;

public class Studentclass implements Comparable<Studentclass> {
    private String name;
    private int marks;


    public Studentclass(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public int getMarks() {
        return marks;
    }

    @Override
    public String toString() {
        return "Studentclass{" +
                "name='" + name + '\'' +
                ", marks=" + marks +
                '}';
    }

    @Override
    public int compareTo(Studentclass o) {
        if(marks==o.marks)
            return 0;
        else if (marks<o.marks) {
            return -1;
        }
            else
                return 1;


        }
    }

