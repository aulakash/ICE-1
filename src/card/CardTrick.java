package card;

import java.util.Random;
import java.util.Scanner;

/*
 * Modified by: Ashvir Aulakh
 * Student Number: 991716285
 */
public class CardTrick {

    public static void main(String[] args) {

        Card[] magicHand = new Card[7];

        for (int i = 0; i < magicHand.length; i++) {
            Card c = new Card();
            c.setValue(generateRandomValue());
            c.setSuit(Card.SUITS[generateRandomNumber(0, 3)]);
            magicHand[i] = c;
        }

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter card value (1-13): ");
        int userValue = scanner.nextInt();

        System.out.print("Enter card suit (0-3): ");
        int userSuit = scanner.nextInt();

        Card userCard = new Card();
        userCard.setValue(userValue);
        userCard.setSuit(Card.SUITS[userSuit]);

        boolean found = false;
        for (Card card : magicHand) {
            if (card.equals(userCard)) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Congratulations! Your card is in the magic hand.");
        } else {
            System.out.println("Sorry, your card is not in the magic hand.");
        }

       
        Card luckyCard = new Card();
        luckyCard.setValue(7);  
        luckyCard.setSuit(Card.SUITS[2]);  

      
        System.out.println("Lucky Card: " + luckyCard);
    }

    private static int generateRandomNumber(int min, int max) {
        Random rand = new Random();
        return rand.nextInt(max - min) + min;
    }

    private static int generateRandomValue() {
        return generateRandomNumber(1, 14);
    }
}
