package Activity1;

/**
 * Created by Teacher on 1/7/2019.
 */
public class CardTester
{
    public static void main(String[] args)
    {
        Card card1 = new Card("6", "heart", 6);
        Card card2 = new Card("2", "clover", 2);
        Card card3 = new Card("King", "spade", 10);

        System.out.println(card1.toString());
        System.out.println(card2.toString());
        System.out.println(card3.toString());
        //
    }
}

