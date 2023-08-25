import java.util.Scanner;

public class Programm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Scrivi il tuo nome : ");
        String yourName = scanner.nextLine();
        System.out.println("scegli tra mela e banana");
        String fruit = scanner.nextLine();
        switch (fruit) {
            case "banana":
                System.out.println("a te ti piace la banana nel culo");
                break;
            case "mela":
                System.out.println("una mela al giorno toglie il medico di torno");
                break;
            default:
                System.out.println("fango non mangi frutta !");
        }
        System.out.println("Write a number between 1,2,3,4 : ");
        int numbers = scanner.nextInt();
        switch (numbers) {
            case 1:
                System.out.println("Ti piace Nazareno, sei un gay dai gusti forti.");
                break;
            case 2:
                System.out.println("Ti piace Vicio Fede, il salmone ti piace succhiarlo.");
                break;
            case 3:
                System.out.println("Ti piace Marcellino, la tenerezza delle palle in bocca ti affascina");
                break;
            case 4:
                System.out.println("Ti piace il Giacalone, gloria a te e prosperita alla tua famiglia per generazioni");
                break;
            default:
                System.out.println("Sei gay!");
        }


    }
}
