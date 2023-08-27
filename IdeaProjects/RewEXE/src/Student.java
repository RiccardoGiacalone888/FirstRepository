import java.util.ArrayList;
import java.util.List;

public class Student {
    private int studentID;
    private String name;
    private String surname;
    private String dateOfBirth;
    private List<Integer> grades;

    public Student(int studentID, String name, String surname, String dateOfBirth) {
        this.studentID = studentID;
        this.name = name;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;
        this.grades = new ArrayList<>(); // inizializzo lista voti.
    }

    public Student(int studentID, String name, String surname, String dateOfBirth, List<Integer> grades) {
        this.studentID = studentID;
        this.name = name;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;
        this.grades = grades;

    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public List<Integer> getGrades() {
        return grades;
    }

    public void setGrades(List<Integer> grades) {
        this.grades = grades;
    }
    //metodo per calcolare la media.
    public double calculateAverage (){
        int sum = 0;
        for (int grade : grades){
            sum += grade;
    }
        return (double) sum /grades.size();
    }
    //metodo per verificare se eccellente
    public boolean isExcellent (double threshold){
        return calculateAverage()>=threshold;

    }
}




