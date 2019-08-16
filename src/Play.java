/**
 * @author ginthera
 */
public class Play
{
   public void splitDeck (Player player1, Player player2, Deck gameDeck)
   {
      System.out.println("Player 1:");
      for (int i = 0; i < 26; i++) {
         player1.getHand().add(i, gameDeck.getDeck().get(i));
         System.out.println(player1.getHand().get(i).getCardValue() + " of " + player1.getHand().get(i).getSuit());
      }
      System.out.println("Player two:");
      for (int i = 26; i < 52; i++) {
         int j = 0;
         player2.getHand().add(j, gameDeck.getDeck().get(i));
         System.out.println(player2.getHand().get(j).getCardValue() + " of " + player2.getHand().get(j).getSuit());
         j++;
      }
   }


   public void compareCards (Player player1, Player player2)
   {
      int warIndex = 2;
      Player warWinner = player1;
      Player warLoser = player2;
      while (player1.getHand().size() > 0 && player2.getHand().size() > 0) {
         Card p1Card = player1.getHand().get(0);
         Card p2Card = player2.getHand().get(0);
         if (p1Card.getCardValue().getCardValue() > p2Card.getCardValue().getCardValue()) {
            player1.getHand().add(p1Card);
            player1.getHand().add(p2Card);
            player1.getHand().remove(0);
            player2.getHand().remove(0);
         }
         else if (p1Card.getCardValue().getCardValue() < p2Card.getCardValue().getCardValue()) {
            player2.getHand().add(p1Card);
            player2.getHand().add(p2Card);
            player1.getHand().remove(0);
            player2.getHand().remove(0);

         }
         else {
            System.out.println("It's a tie!");
            if (player1.getHand().size() < 3 || player2.getHand().size() < 3) {
               player1.getHand().remove(0);
               player2.getHand().remove(0);
               break;
            }

            Card p1NextWarCard = player1.getHand().get(2);
            Card p2NextWarCard = player2.getHand().get(2);
            while (p1NextWarCard.getCardValue().getCardValue() == p2NextWarCard.getCardValue().getCardValue()) {
               if (player1.getHand().size() > warIndex + 1 || player2.getHand().size() > warIndex + 1) {
                  player1.getHand().remove(0);
                  player2.getHand().remove(0);

                  warIndex += 2;
                  p1NextWarCard = player1.getHand().get(warIndex);
                  p2NextWarCard = player2.getHand().get(warIndex);
               }
               else {
                  if (player1.getHand().size() < warIndex + 1) {
                     player1.getHand().clear();
                  }
                  else {
                     player2.getHand().clear();
                  }
                  break;
               }
               if (p1NextWarCard.getCardValue().getCardValue() > p2NextWarCard.getCardValue().getCardValue()) {
                  warWinner = player1;
                  warLoser = player2;
               }

               else if (p1NextWarCard.getCardValue().getCardValue() < p2NextWarCard.getCardValue().getCardValue()) {
                  warWinner = player2;
                  warLoser = player1;
               }
            }
            for (int i = 0; i <= warIndex; i++) {
               if (warLoser.getHand().size() > i + 1) {
                  warWinner.getHand().add(warLoser.getHand().get(i));
                  warWinner.getHand().add(warWinner.getHand().get(i));
                  warLoser.getHand().remove(i);
                  warWinner.getHand().remove(i);
               }
               else {
                  break;
               }
            }
            warIndex = 2;

         }
      }
      if (player1.getHand().isEmpty()) {
         System.out.println("Player 2 wins!");
      }
      else {
         System.out.println("Player 1 wins!");
      }
   }



}
