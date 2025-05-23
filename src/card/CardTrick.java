/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package card;
import java.util.Random;
import java.util.Scanner;
/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author Abhishek
 * @modifier Abhishek Abhishek
 * Student ID: 991760197
 * Date Modified: May 23, 2025
 */
public class CardTrick {
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        Random rand = new Random();
        for (int i=0; i<magicHand.length; i++){
            Card c = new Card();
            
            //c.setValue(insert call to random number generator here)
            c.setValue(rand.nextInt(13) + 1);
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            c.setSuit(Card.SUITS[rand.nextInt(4)]);
            magicHand[i] = c;
            System.out.println(c.getSuit() + " " + c.getValue());
        }
        Card luckyCard = new Card();
        luckyCard.setValue(2);
        luckyCard.setSuit("Clubs");

        boolean luckyFound = false;
        for (Card c : magicHand) {
            if (c.getValue() == luckyCard.getValue() && c.getSuit().equals(luckyCard.getSuit())) {
                luckyFound = true;
                break;
            }
        }

        if (luckyFound) {
            System.out.println("Congratulations! The lucky card (2 of Clubs) is in the magic hand!");
        } else {
            System.out.println("Sorry, the lucky card (2 of Clubs) is not in the magic hand.");
        }
        //insert code to ask the user for Card value and suit, create their card 
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a card value (1–13): ");
        int userValue = sc.nextInt();

        System.out.print("Enter a suit (0=Hearts, 1=Diamonds, 2=Clubs, 3=Spades): ");
        int userSuitIndex = sc.nextInt();
        String userSuit = Card.SUITS[userSuitIndex];

//        and search magicHand here
        boolean found = false;
        for (Card c : magicHand) {
            if (c.getValue() == userValue && c.getSuit().equals(userSuit)) {
                found = true;
                break;
            }
        }
        //Then report the result here
        // add one luckcard hard code 2,clubs
        if (found) {
            System.out.println("Congratulations! Your card is in the magic hand!");
        } else {
            System.out.println("Sorry, your card is not in the magic hand.");
        }
    }
    
}
