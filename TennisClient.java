
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

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
              //  scoreboard.displayScore();
            }
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }
}

	


