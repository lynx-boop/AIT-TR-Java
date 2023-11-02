package homework.student.model;

public class Student {
    private int id;
    private String firstName;
    private String lastName;
    private int year;
    private String profession;

    public void setId(int id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getYear() {
        return year;
    }

    public String getProfession() {
        return profession;
    }

    public Student(int id, String firstName, String lastName, int year, String profession) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.year = year;
        this.profession = profession;
    }

    public static void learn() {
        System.out.println(" is learning");
    }
    public static void vacation() {
        System.out.println(" is at vacation");
    }
    public static void exams() {
        System.out.println(" is passing exams");
    }
}
