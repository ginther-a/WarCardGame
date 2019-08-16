/**
 *
 * @author ginthera
 */
public class Game
{
   /**
    * @param args the command line arguments
    */
   public static void main (String[] args)
   {
      Deck gameDeck = new Deck();

      Player player1 = new Player("Player 1");
      Player player2 = new Player("Player 2");

      Play p = new Play();

      p.splitDeck(player1, player2, gameDeck);

      p.compareCards(player1, player2);





   }
}
