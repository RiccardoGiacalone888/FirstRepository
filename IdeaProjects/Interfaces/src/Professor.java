class Professor extends CollegePerson implements TeachingPerson {
    String teachingSubject;
    public Professor(String name, String surName, int collegeId, String teachingSubject){
        super(name, surName, collegeId);
        this.teachingSubject=teachingSubject;
    }
    @Override
    public void teachToOtherPeople(){
        System.out.println(name + " " + surName + " is teaching " + teachingSubject + " the student"  );
    }
}
