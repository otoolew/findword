package findword;

import java.util.Scanner;

/**
 * @author Bill O'Toole
 */
public class Assig3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        boolean again=true;
        while (again){
            FindWord a = new FindWord();
            System.out.println("Press any key to continue or 'q' to QUIT");
            Scanner choose = new Scanner(System.in);
            String res = choose.next().toUpperCase();
            if(res.equalsIgnoreCase("Q")){
                again = false;
            }else{
                again = true;
                
            }
        }
    }   
}