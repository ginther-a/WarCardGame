/**
 * @author ginthera
 */
public class War
{

   public void War (Player player1, Player player2)
   {
      Card p1c1 = player1.getHand().get(0);
      Card p1c2 = player1.getHand().get(1);

      Card p2c1 = player2.getHand().get(0);
      Card p2c2 = player2.getHand().get(1);

      if (p1c1.getCardValue().getCardValue() < p2c1.getCardValue().getCardValue()) {
         player2.getHand().add(p1c1);
         player2.getHand().add(p1c2);
         player2.getHand().add(p2c1);
         player2.getHand().add(p2c2);
         player1.getHand().remove(0);
         player1.getHand().remove(1);
         player2.getHand().remove(0);
         player2.getHand().remove(1);

      }
      else if (p1c1.getCardValue().getCardValue() > p2c1.getCardValue().getCardValue()) {
         player1.getHand().add(p1c1);
         player1.getHand().add(p1c2);
         player1.getHand().add(p2c1);
         player1.getHand().add(p2c2);
         player1.getHand().remove(0);
         player1.getHand().remove(1);
         player2.getHand().remove(0);
         player2.getHand().remove(1);

      }
//      else if (p1c1.getCardValue().getCardValue() == p2c1.getCardValue().getCardValue()) {
//         War(player1, player2);
//      }


   }

}
