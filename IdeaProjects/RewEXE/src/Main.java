public class Main {
    public static void main(String[] args) {
        Student student1 = new Student(1234, "Riccardo", "Giacalone", "22/09/1988");
        Student student2= new Student(1235, "Eleonora", "Melodia", "18/03/1992");
        Student student3 = new Student(1236, "Zelda", "Melodia", "16/05/2023");
        Student student4 = new Student(1237, "Malù", "Melodia", "14/03/2023");

        Professor professor1= new Professor(2233, "Professor", "X-MAN", "Science");
        Professor professor2= new Professor(3344, "Oak", "Pokemon", "Math");

        professor1.assignGrade(student1,30);
        professor1.assignGrade(student2, 17);
        professor1.assignGrade(student3, 29);
        professor1.assignGrade(student4,20);

        professor2.assignGrade(student1,30);
        professor2.assignGrade(student2, 16);
        professor2.assignGrade(student3, 30);
        professor2.assignGrade(student4, 19);

        Student[] students = {student1,student2,student3,student4};
        Professor[] professors ={professor1,professor2};

        double threshold = 18.0;

        System.out.println("Excellent students :");
        for (Student student : students){
            if (student.isExcellent(threshold)){
                System.out.println(student.getName() + " - " + student.getSurname());
            }
        }
        Student topStudent = students[0];
        for (Student student : students){
            if (student.calculateAverage()>topStudent.calculateAverage()){
                topStudent=student;
            }
        }
        System.out.println("The top student is : " + topStudent.getName() + " - " + topStudent.getSurname());
    }
}