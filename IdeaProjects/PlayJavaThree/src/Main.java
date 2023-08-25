
public class Main {
    public static void main(String[] args) {
    Residents [] life = new Residents[4];
    life[0]= new Residents("Riccardo","Human","male", 34);
    life[1]= new Residents("Eleonora", "Human", "female", 31);
    life [2]= new Residents("Zelda", "Dog", "female", 1);
    life[3]= new Residents("Malù", "Cat", "female", 1);
    printFemale(life);
    }


    public static void printFemale(Residents [] residentsArray){
        for (Residents residents : residentsArray){
            if ("female".equals(residents.getSex())){
                System.out.println(residents.getName() + "-" + residents.getSex());
            }
        }

    }
}