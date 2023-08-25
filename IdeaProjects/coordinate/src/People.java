public class People {
    public static void main(String[] args) {
        Person person1;
        person1 = new Person();
        person1.name = "Riccardo";
        person1.surname = "Giacalone";
        person1.age = 34;
        System.out.println("Persona 1" + person1.dettagli());
        Person person2 = new Person();
        person2.name = "Eleonora";
        person2.surname = "Melodia";
        person2.age = 31;
        System.out.println("Persona 2 " + person2.dettagli());
        Person person3 = new Person();
        person3 = person2;
        System.out.println("Persona 3" + person3.dettagli());

    }

}
