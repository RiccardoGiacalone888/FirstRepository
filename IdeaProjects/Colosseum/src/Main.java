import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Gladiator[] guys = new Gladiator[17];
        guys[0] = new Gladiator("Riccardo", "TAPPO 3X3!");
        guys[1] = new Gladiator("Vicio Fede", "Passa Isole");
        guys[2] = new Gladiator("Antonio Crivello", "Centurion e Mortadella");
        guys[3] = new Gladiator("Manfredi Orlando", "Amore VenezuelAno");
        guys[4] = new Gladiator("Manfredi Re", "Piacere Milanese...");
        guys[5] = new Gladiator("Lucio Marino", "Tik tok 5 turni da adesso");
        guys[6] = new Gladiator("Nazarano Parlato Rovella", "Ambizione del Re degli Ospedali");
        guys[7] = new Gladiator("Michele Biddeci", "EHHH COMBAAAA ");
        guys[8] = new Gladiator("Francesco Zanna", "Semplicemente Nutella");
        guys[9] = new Gladiator("Cix", "Giochiamo a OnePiece");
        guys[10] = new Gladiator("Antonio Ferro", "Vota Partito Democristiano");
        guys[11] = new Gladiator("Benny", "Ha ricominciato da poco ");
        guys[12] = new Gladiator("Giorgio Guardo", "Top in loop");
        guys[13] = new Gladiator("Peco", "NazaKiller");
        guys[14] = new Gladiator("Il Greco", "Preferisco la salumeria");
        guys[15] = new Gladiator("Luchino", "Mi presti un mazzo?");
        guys[16] = new Gladiator("Matteo Strazzera", "Milanese adorato");
        String[] namesArray = new String[17];
        for (int i = 0; i < 17; i++) {
            namesArray[i] = guys[i].getName();
        }
        String[] ultimateArray = new String[17];
        for (int i = 0; i < 17; i++) {
            ultimateArray[i] = guys[i].getUltimate();
        }
        for (int i = 0; i < 17; i++) {
            System.out.println("Diventa Gladiatore inserisci il tuo nome :" + (i + 1) + " : ");
            String name = scanner.nextLine();
            System.out.println("Adesso la tua ultimate :" + (i + 1) + " : ");
            String ultimate = scanner.nextLine();
            String input = scanner.nextLine();
            guys[i] = new Gladiator(name, ultimate);
            if (input.equalsIgnoreCase("exit")) {
                System.out.println("Grazie.");

                break;
            }

        }
        scanner.close();
        printName(guys);
        printUltimate(guys);
    }

    public static void printName(Gladiator[] gladiators) {
        for (Gladiator gladiator : gladiators) {
            System.out.println(gladiator.getName());

        }
    }

    public static void printUltimate(Gladiator[] gladiators) {
        for (Gladiator gladiator : gladiators) {
            System.out.println(gladiator.getUltimate());
        }
    }
}