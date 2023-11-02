package practice.student;

public class Student {
    // поля класса
   private int id;
   private String firstName;
   private String lastName;
   int[] marks;
    public Student(int id, String firstName, String lastName, int[] marks) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.marks = marks;
    }

    //гетеры
    public Student() {
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
    public int[] getMarks() {
        return marks;
    }

    //сеттеры
    public void setId(int id) {
        this.id = id;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setMarks(int[] marks) {
        this.marks = marks;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id;
    }

    @Override
    public int hashCode() {
        return id;
    }

    // метод, который считает средний балл студента
    public double averageMark(int[] marks) {
        //сложить все оценки
        int sum = 0;
        for (int i = 0; i < marks.length; i++) {
            sum += marks[i]; // накапливаем сумму оценок
        }
        //разделить на их кол-во
        return sum/(double)marks.length;
    }
}
