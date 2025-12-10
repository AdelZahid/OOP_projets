
package playerdemo;

public class PlayerDemo {

    public static void main(String[] args) {
        Player player = new Player("new",60.00,80.05);
        System.out.println("Player Type: " + player.playerType);
        System.out.println("Total Score: " + player.totalScore);
        System.out.println("Total Matches: " + player.totalMatches);

        System.out.println("Final Score: " + player.calculateFinalScore());
    
    }
    
}
