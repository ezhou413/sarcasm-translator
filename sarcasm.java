import java.util.Scanner;

/**
 * This is a program that takes in a String using Java's Scanner, 
 * and returns a new String with every other letter turned into 
 * an uppercase character. 
 */
class Sarcasm {
    public static void main(String[] args) {
        //create a new Scanner object
        Scanner s = new Scanner(System.in);

        /**
         * in is the String we are taking in from the user
         * out is the sarcasmified String we are returning to the user
         */
        String in, out;
        
        //runs until the user exits the program
        //currently can only exit using Ctrl + C
        while (true) {
            //initializing the string we are returning to an empty String
            out = ""; 
            System.out.println("If you would like to exit the program, please enter 'exit'");

            //get user input
            System.out.print("Enter a message: ");
            in = s.nextLine();

            //clean up the String, removing leading and trailing spaces
            in.trim();

            //check if the user has entered the exit phrase
            if (in.equals("exit")) {
                s.close();
                break;
            }

            //for loop, running in.length number of times
            for (int i = 0; i < in.length(); i++) {
                //if the character is at an even index, append it to out
                if (i % 2 == 0) {
                    out += in.charAt(i);
                }
                //if the character is at an odd index, make it uppercase 
                //and append it to out
                else {
                    out += Character.toUpperCase(in.charAt(i));
                }
            }

            //pring the sarcasmified String to the user
            System.out.println("Sarcasmified: " + out + "\n");
        }
    }
}