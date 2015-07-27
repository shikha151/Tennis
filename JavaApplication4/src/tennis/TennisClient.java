/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tennis;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author test
 */
public class TennisClient {
    
    public static void main(String[] args) {
        System.out.println("Give the input string");
        try{
            BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));
            String s = bufferRead.readLine();
            ScoreBoard scoreboard = new ScoreBoard();


            
            for( int i=0;i<s.length();i++){
                if ( scoreboard.updateScore(s.charAt(i)) ){
                    break;
                }
                scoreboard.displayScore();
            }
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }
}
class ScoreBoard {
    private String p1;
    private String p2;
    String [] scores = {"0" , "15", "30", "40", "A", "W" };
    int p1Index;
    int p2Index;
    
    
    public ScoreBoard( ) {
        this.p1 = "0";
        this.p2  = "0";
    }

    public void setP1Score( String p1) {
        this.p1 = p1;
    }
    public void setP2Score( String p2) {
        this.p2 = p2;
    }

    public boolean updateScore( char player ) {
        boolean gameDone = false;
        System.out.print(player + "   " +this.p1Index + "    " + this.p2Index + "    ");
        if ( player == 'D' ) {
            
            if ( bothAtAdvantage() ) {
                this.p1Index = 3;
                this.p2Index = 3;
                
            }
            else if ( this.p1Index == 5 && this.p1Index - this.p2Index == 2 || scores[this.p1Index] == "40" && this.p2Index < this.p1Index ) {
                System.out.println("D wins");
                gameDone = true;
            }
            else {
                p1Index++;
                if ( this.p1Index == 5 && this.p1Index - this.p2Index == 2 ) {
                    gameDone = true;
                    System.out.println(" D Wins");
                }
            }
        }
        else if ( player == 'F' ) {
            
            if ( bothAtAdvantage() ) {
                this.p1Index = 3;
                this.p2Index = 3;

            }
            else if ( this.p2Index == 5 && this.p2Index - this.p1Index == 2 || scores[this.p2Index] == "40" && this.p1Index < this.p2Index ) {
                System.out.println("F wins");
                gameDone = true;
            }
            else {
                p2Index++;
                if ( this.p2Index == 5 && this.p2Index - this.p1Index == 2 ) {
                    gameDone = true;
                    System.out.println("F Wins");
                }
            }
        }
        
        setP1Score(scores[p1Index]);
        setP2Score(scores[p2Index]);
        return gameDone;
    }
    private boolean bothAtAdvantage() {
        return this.p1Index == 4 && this.p2Index == 4;   
    }
    public void displayScore() {
        System.out.println(this.p1 + "   " + this.p2);
    }
}