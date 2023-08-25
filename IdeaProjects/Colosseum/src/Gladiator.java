public class Gladiator {
    private String name;
    private String ultimate;

    public Gladiator(String name, String ultimate){
        this.name=name;
        this.ultimate=ultimate;

    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getUltimate(){
        return ultimate;
    }

    public void setUltimate(String ultimate) {
        this.ultimate = ultimate;
    }


}
