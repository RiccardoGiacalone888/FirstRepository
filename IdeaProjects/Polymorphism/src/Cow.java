class Cow extends Animals {
    public Cow (String animalNames){
        super(animalNames);
    }
    @Override
    public void animalsSound(){
        System.out.println(animalName + " muuuuuuu");
    }
}
