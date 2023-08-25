import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Scrivi il tuo nome, grazie ! ");
        String yourName = scanner.nextLine();
        if (yourName.equals("Eleonora")) {
            System.out.println("UHHHH ti conosco e sei proprio bona!");
        } else {
            System.out.println("una persona come altre....");

        }
        System.out.println("Dimmi il nome della persona che ti piace !");
        String love = scanner.nextLine();
        if (love.equals("Riccardo")) {
            System.out.println("Come darti torto lui è proprio uno gnocco!");
        } else {
            System.out.println("Cerca di fare la persona seria e scrivi esattamente Riccardo!!!!");
        }
        System.out.println("A riccardo quali tra questi cibi piaccino ? Pizza, Caramelle, Torte, Cacca ??");
        String cibo = scanner.nextLine();
        switch (cibo) {
            case "Pizza":
                System.out.println("Si è vero la pizza gli piace tanto!");
                break;
            case "Caramelle":
                System.out.println("Molto gustose soprattutto se succose");
                break;
            case "Torte":
                System.out.println("Se al cioccolato alla frutta no!");
                break;
            case "Cacca":
                System.out.println("TEEEEEEEEEEEEEEEEEEEE");
                break;
            default:
                System.out.println("Non sai una minchia eleonò, i nomi e i case devi scriverli con l'iniziale in maiuscolo!!!E");
        }
        String[] animals = {"Zelda", "Malu", "Eleonora"};
        System.out.println(animals.length);
        for (int i = 0; i < animals.length; i++) {
            if (i == 0) {
                System.out.println("Il primo animale è :" + animals[i]);
            } else {
                System.out.println("L'animale nella posizione è : " + i + " : " + animals[i]);
            }
        }
    }
}

