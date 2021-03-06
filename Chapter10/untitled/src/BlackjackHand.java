public class BlackjackHand extends Deck {
    int aceCount = 0;

    public int getValue() {
        int sum = 0;
        for (Card c : getCards()) {
            BlackjackCard card = (BlackjackCard) c;

            sum += card.getValue();

            if (card.isAce()) {
                aceCount++;
            }
        }

        // ace의 값 처리
        while (aceCount > 0 && sum > 21) {
            aceCount--;
            sum -= 10;
        }

        return sum;
    }

    public boolean isBusted() {
        return getValue() > 21;
    }

    public boolean isBlackjack () {
        if (getCards().size() == 2 && getValue() == 21) {
            return true;
        }
        return false;
    }
}

