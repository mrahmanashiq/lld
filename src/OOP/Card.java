package OOP;

public class Card {
    String id;
    String cardType;
    String expirationDate;
    String cardHolderName;
    String bankName;
    String cardNetwork;
    String cardStatus;
    int cvv;
    int cardLimit;
    long cardBalance;
    int cardPin;

    // All-args constructor to initialize all fields
    public Card(String id, String cardType, String expirationDate, String cardHolderName, String bankName, String cardNetwork, String cardStatus, int cvv, int cardLimit, long cardBalance, int cardPin) {
        this.id = id;
        this.cardType = cardType;
        this.expirationDate = expirationDate;
        this.cardHolderName = cardHolderName;
        this.bankName = bankName;
        this.cardNetwork = cardNetwork;
        this.cardStatus = cardStatus;
        this.cvv = cvv;
        this.cardLimit = cardLimit;
        this.cardBalance = cardBalance;
        this.cardPin = cardPin;
    }

    // Default constructor
    public Card() {
        this.id = "";
        this.cardType = "";
        this.expirationDate = "";
        this.cardHolderName = "";
        this.bankName = "";
        this.cardNetwork = "";
        this.cardStatus = "";
        this.cvv = 0;
        this.cardLimit = 0;
        this.cardBalance = 0;
        this.cardPin = 0;
    }

    // No-args constructor
    public Card(String id) {
        this.id = id;
        this.cardType = "";
        this.expirationDate = "";
        this.cardHolderName = "";
        this.bankName = "";
        this.cardNetwork = "";
        this.cardStatus = "";
        this.cvv = 0;
        this.cardLimit = 0;
        this.cardBalance = 0;
        this.cardPin = 0;
    }

    @Override
    public String toString() {
        return "Card{" +
                "id='" + id + '\'' +
                ", cardType='" + cardType + '\'' +
                ", expirationDate='" + expirationDate + '\'' +
                ", cardHolderName='" + cardHolderName + '\'' +
                ", bankName='" + bankName + '\'' +
                ", cardNetwork='" + cardNetwork + '\'' +
                ", cardStatus='" + cardStatus + '\'' +
                ", cvv=" + cvv +
                ", cardLimit=" + cardLimit +
                ", cardBalance=" + cardBalance +
                ", cardPin=" + cardPin +
                '}';
    }
}
