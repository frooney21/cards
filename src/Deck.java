public class Deck
{
    private Card[] cards;
    private Rank rankValue;
    private Suit suitValue;

    public void deckOfCards()
    {
        cards = new Card[52];

        for(int i = 0; i <= 51; i++)
        {
            cards[i] = new Card(rankValue, suitValue);
        }
    }

    //My attempt at being able to print what cards are created
    public String toString()
    {
        String fullDeck = "";
        int a = 0;

        for ( int i = 0; i < 4; i++ ) //A loop around for each suit
        {
            for ( int j = 1; j <= 13; j++ )//A loop around for each card number
            {
                fullDeck = fullDeck + (cards[a++] + " ");
            }
        }
        return (fullDeck);
    }

}
