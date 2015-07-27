
package tennis;
class TennisGame {

    /**
     * @param args the command line arguments
     */
    ScoreBoard scoreboard;
    public TennisGame() {
        scoreboard = new ScoreBoard();
    }
    public void displayScores() {
        
    }
    public void computeScores( String scoreInp ) {
        
    }
    
}
class ScoreBoard {
    private String p1;
    private String p2;
    
    public ScoreBoard( ) {
        this.p1 = "0";
        this.p2  = "0";
    }
    public void setP1Score( String p1) {
        this.p1 = p1;
    }
    public String getP1Score() {
        return this.p1;
    }
    public void setP2Score( String p2) {
        this.p2 = p2;
    }
    public String getP2Score() {
        return this.p2;
    }
    
}
