class Student extends CollegePerson implements LearningPerson {
    int academicYear;
    public Student(String name, String surName, int academicYear, int collegeId){
        super(name,surName,collegeId);
        this.academicYear=academicYear;
    }
    @Override
    public void studyAtHome(){
        System.out.println(name + " " + surName + " study at home as a :" + academicYear + " year student");
    }

}
