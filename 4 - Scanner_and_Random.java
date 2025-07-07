import java.util.Random;
import java.util.Scanner;

public class Challenge_4 {
    public static void main(String[] args) {
        Random days = new Random();
        int daysUntilParty = days.nextInt(30); 
        Scanner in = new Scanner(System.in);

        System.out.println("How many tickets would you like?");
        int ticketCount = in.nextInt();

        if (daysUntilParty < 0) {
            System.out.println("Too late to purchase a ticket, must buy at the event gate");
        } else if (daysUntilParty > 1 && daysUntilParty < 10) {
            System.out.println("Tickets will cost Ksh 1500 each ");
        } else if (daysUntilParty >= 10 && daysUntilParty < 20) {
            System.out.println("Tickets are Ksh 1000 each");
        } else if (daysUntilParty >= 20 && daysUntilParty < 30) {
            System.out.println("Early bird tickets are Ksh 750 each!");
        }

        if (ticketCount == 0) {
            System.out.println("Error: cannot buy 0 tickets");
        } else if (ticketCount == 1) {
            System.out.println("You do not qualify for a discount");
        } 
        else if(ticketCount >=2){
            System.out.println("You qualify for a 5% discount");
        }
        else if (ticketCount >= 5) {
            System.out.println("You qualify for a 10% discount");
        }
    }
}
