
package playerdemo;

 public class Player {
     public String playerType;
    public double totalScore;
    public double totalMatches;
    public Player() {
    }
    public Player(String playerType, double totalScore, double totalMatches) {
        this.playerType = playerType;
        this.totalScore = totalScore;
        this.totalMatches = totalMatches;
    }
    public double calculateFinalScore() {
        if ("new"==(playerType)) {
            return totalScore / totalMatches;
        } else {
            return (2 * totalScore * totalMatches) / (totalScore + totalMatches);
        }
    }
}
