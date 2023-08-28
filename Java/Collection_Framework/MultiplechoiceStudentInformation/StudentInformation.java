package MultiplechoiceStudentInformation;

public class StudentInformation {
    private int Mark;
    private String Name;

    public StudentInformation(String Name, int mark) {
        this.Name=Name;
        this.Mark=Mark;
    }
    public StudentInformation(){

    }

    public int getMark() {
        return Mark;
    }

    public void setMark(int mark) {
        Mark = mark;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }
}
