public class Student {
    private Integer rollNo;
    private String name;
    private String email;
    private String course;
    private Double marks;

    public Student(Integer rollNo, String name, String email, String course, Double marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.email = email;
        this.course = course;
        this.marks = marks;
    }

    public Integer getRollNo() { return rollNo; }
    public String getName() { return name; }
    public String getEmail() { return email; }
    public String getCourse() { return course; }
    public Double getMarks() { return marks; }

    public String getGrade() {
        if (marks >= 90) return "A+";
        if (marks >= 80) return "A";
        if (marks >= 70) return "B";
        if (marks >= 60) return "C";
        return "D";
    }

    @Override
    public String toString() {
        return "Roll No: " + rollNo +
                "\nName: " + name +
                "\nEmail: " + email +
                "\nCourse: " + course +
                "\nMarks: " + marks +
                "\nGrade: " + getGrade();
    }
}
