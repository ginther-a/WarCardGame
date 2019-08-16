import java.util.ArrayList;
/**
 * @author ginthera
 */
public class Player
{
   private String name;
   private ArrayList<Card> hand;

   public Player (String name)
   {
      this.name = name;
      this.hand = new ArrayList<Card>();
   }

   public String getName ()
   {
      return name;
   }

   public void setName (String name)
   {
      this.name = name;
   }

   public ArrayList<Card> getHand ()
   {
      return hand;
   }

   public void setHand (ArrayList<Card> hand)
   {
      this.hand = hand;
   }





}
