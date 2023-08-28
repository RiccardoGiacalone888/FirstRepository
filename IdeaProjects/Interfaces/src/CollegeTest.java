public class CollegeTest {
    public static void main(String[] args) {
        Student student = new Student("Riccardo", "Giacalone", 1, 991);
        Professor professor = new Professor("Oak", "Pokemon", 332, "Pokemon Science");
        Assistant assistant = new Assistant("Eleonora", "Melodia", 444, true);
        student.goToCollege();
        student.studyAtHome();
        professor.goToCollege();
        professor.teachToOtherPeople();
        assistant.goToCollege();
        assistant.studyAtHome();
        assistant.teachToOtherPeople();


    }
}
