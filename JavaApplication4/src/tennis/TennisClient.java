/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tennis;

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
            TennisGame game = new TennisGame(s);

            //System.out.println(s);
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }


    }
}
