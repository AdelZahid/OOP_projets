import java.util.Scanner;

class Cadexception extends Exception {
    String s;

    public Cadexception(String s) {
        this.s = s;
    }

    public String getMessage() {
        return s;
    }
}

class Date {
    int year;
    int month;
    int day;

    public Date(int y, int m, int d) {
        this.year = y;
        this.month = m;
        this.day = d;
    }
}

class Card {
    int cardnum;
    String carType;
    int Monetarylimit;
    Date d;

    public Card(int cn, String caT, int Monl, Date d) {
        this.cardnum = cn;
        this.carType = caT;
        this.Monetarylimit = Monl;
        this.d = d;
    }

    public void MatchCard(Card cdd, Date dt) throws Cadexception {
        if (cdd.d.month < dt.month) {
            throw new Cadexception("Cant complete error");
        } else {
            if (cdd.carType.equals("Bronze")) {
                if ((cdd.Monetarylimit) >= 2000) {
                    throw new Cadexception("Cant copmlete error");
                } else {
                    System.out.println("You are welcome to Shopping........");
                }
            } else if (cdd.carType.equals("Gold")) {
                if ((cdd.Monetarylimit) >= 10000) {
                    throw new Cadexception("Cant complete error");
                } else {
                    System.out.println("You are welcome to Shopping........");
                }
            }
        }
    }
}

public class CardPurchase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        int m = sc.nextInt();
        int y = sc.nextInt();
        Date dt = new Date(y, m, d);
        Card cd = new Card(12345, "Bronze", 300, dt);
        try {
            cd.MatchCard(cd, dt);
        } catch (Cadexception e) {
            System.out.println(e.getMessage());
        }
    }
}
