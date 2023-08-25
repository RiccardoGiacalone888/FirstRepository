import java.util.Scanner;

public class ChatBot {
    public static void main(String[] args) {
        //Avvio chat.
        System.out.println("Welcome to the chat ! Write 'exit' to exit  ");
        //Creazione di scanner per input utente.
        Scanner scanner = new Scanner(System.in);
        String input;
        do {
            System.out.println("Tu : ");
            input= scanner.nextLine();
        if (input.equalsIgnoreCase("exit"));{
        System.out.println("Chat finish !  Goodbye....");
        break;

        }

        String response = getAIResponse(input);
        System.out.println("IA: " + response);

    } while (true);
    scanner.close();

            
}

    private static String getAIResponse(String input) {
    }
