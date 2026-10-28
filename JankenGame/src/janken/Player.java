package janken;

public abstract class Player {

    private String hand;

    public String getHand() {
        return hand;
    }

    protected void setHand(String hand) {
        this.hand = hand;
    }

    public abstract void selectHand();
}