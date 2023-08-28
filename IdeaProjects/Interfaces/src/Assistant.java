class Assistant extends CollegePerson implements LearningPerson,TeachingPerson {
    boolean isGoingToBeAPhD;
    public Assistant(String name, String surName, int collegeId, boolean isGoingToBeAPhD){
        super(name,surName,collegeId);
        this.isGoingToBeAPhD=isGoingToBeAPhD;
    }
    @Override
    public void studyAtHome(){
        System.out.println(name + " " + surName + " the assistant study at home ");
    }
    @Override
    public void teachToOtherPeople(){
        System.out.println(name + " " + surName + "the assistant teaching the student");
    }
}
