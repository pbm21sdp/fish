package loose.oose.fis.lab.student.manager.model;

import java.util.Objects;

public class Student {
    private String firstName;
    private String lastName;
    private int age;
    private double meanGrade;
    private int an_studiu;
    private String facultate;
    private String universitate;

    public Student(String firstName, String lastName, int age, double meanGrade, int an_studiu, String facultate, String universitate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.meanGrade = meanGrade;
        this.an_studiu = an_studiu;
        this.facultate = facultate;
        this.universitate = universitate;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", meanGrade=" + meanGrade +
                ", an_studiu=" + an_studiu +
                ", facultate=" + facultate +
                ", universitate=" + universitate +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age &&
                Double.compare(student.meanGrade, meanGrade) == 0 &&
                Objects.equals(firstName, student.firstName) &&
                Objects.equals(lastName, student.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, age, meanGrade);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getMeanGrade() {
        return meanGrade;
    }

    public void setMeanGrade(double meanGrade) {
        this.meanGrade = meanGrade;
    }

    public int getAnStudiu() {
        return an_studiu;
    }

    public void setAnStudiu(int an_studiu) {
        this.an_studiu = an_studiu;
    }

    public String getFacultate() {
        return facultate;
    }

    public void setFacultate(String facultate) {
        this.facultate = facultate;
    }

    public String getUniversitate(){
        return universitate;
    }

    public void setUniversitate(String universitate) {
        this.universitate = universitate;
    }
}
