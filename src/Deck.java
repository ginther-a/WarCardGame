import java.util.ArrayList;
import java.util.Collections;


public class Deck
{
   private ArrayList<Card> deck;

   public Deck ()
   {
      this.deck = new ArrayList<Card>();

      for (int j = 0; j < 4; j++) {
         for (int i = 0; i < 13; i++) {
            Card card = new Card(CardValue.values()[i], Suit.values()[j]);
            this.deck.add(card);

         }
      }
      Collections.shuffle(deck);
//      for (int i = 0; i < 52; i++) {
//         System.out.println(deck.get(i).getCardValue() + " of " + deck.get(i).getSuit());
//      }
   }

   public ArrayList<Card> getDeck ()
   {
      return deck;
   }


}
