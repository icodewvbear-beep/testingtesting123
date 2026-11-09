import java.util.Random;

public class WAR_starter {
    public static void main(String[] args){

        // Generation of 2 random cards (1-52)
        Random rand = new Random();
        int computerCARD = rand.nextInt(52);
        int userCARD = rand.nextInt(52); 

        System.out.println(computerCARD);
        System.out.println(userCARD);
        
        if(computerCARD == 0){
            computerCARD += 1;
        }
        if(userCARD == 0){
            userCARD += 1;
        }

        

        //YOUR CODE GOES HERE

        //

        // Final send of 2 cards value (suit + value) to be outputted as ASCII cards

        printAsciiEval(returnCard(computerCARD), returnCard(userCARD));

    }

    public static String returnCard(int card) {
        String suit = "none";
        int value = 0;
        if(card >= 39) {
            suit = "H";
            value = card - 39;
        }
        else if(card >= 27){
            suit = "S";
            value = card - 26;
        }
        else if(card >= 14){
            suit = "D";
            value = card - 13;
        }
        else {
            suit = "C";
            value = card;
        }

        return (suit + value);
    }


    public static void printAsciiEval(String computerCard, String userCard) {


        if(computerCard.length() == 2){
            printAscii_2Char_card(computerCard);
        }else {
            printAscii_3Char_card(computerCard);
        }

        System.out.println("────────────");
        System.out.println("─~COMPUTER~─");
        System.out.println("");
        System.out.println("────~VS~────");
        System.out.println("");
        System.out.println("───~USER~───");
        System.out.println("────────────");

        if(userCard.length() == 2){
            printAscii_2Char_card(userCard);
        }else {
            printAscii_3Char_card(userCard);
        }
    }

    public static void printAscii_2Char_card(String card){
        // Top of the computer card
        System.out.println("┌─────────┐");
        // Upper part of the card with the character
        System.out.println("│" + card + "       │"); // top-left corner of the card
        System.out.println("│         │");
        System.out.println("│         │");
        System.out.println("│    " + card + "   │"); // middle of the card
        System.out.println("│         │");
        System.out.println("│         │");
        // Bottom part of the card with the character mirrored
        System.out.println("│       " + card + "│"); // bottom-right corner of the card
        // Bottom of the card
        System.out.println("└─────────┘");
    }

    public static void printAscii_3Char_card(String card){
        // Top of the computer card
        System.out.println("┌──────────┐");
        // Upper part of the card with the character
        System.out.println("│" + card + "       │"); // top-left corner of the card
        System.out.println("│          │");
        System.out.println("│          │");
        System.out.println("│    " + card + "   │"); // middle of the card
        System.out.println("│          │");
        System.out.println("│          │");
        // Bottom part of the card with the character mirrored
        System.out.println("│       " + card + "│"); // bottom-right corner of the card
        // Bottom of the card
        System.out.println("└──────────┘");
    }
}
