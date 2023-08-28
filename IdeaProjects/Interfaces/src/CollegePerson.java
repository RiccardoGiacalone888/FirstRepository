

class CollegePerson {
    protected String name;
    protected String surName;
    protected int collegeId;
    public CollegePerson(String name, String surName, int collegeId){
        this.name=name;
        this.surName=surName;
        this.collegeId=collegeId;
    }
    void goToCollege(){
        System.out.println(name + "  " + surName + " student Id : " + collegeId);
    }

}
