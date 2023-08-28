class Lion extends Animals {
    public Lion(String animalName){
        super(animalName);

    }
    @Override
    public void animalsSound (){
        System.out.println(animalName + " Roarrrr");
    }
}
