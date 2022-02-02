import java.util.Scanner;

class Sarcasm {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        while (true) {
            String out = ""; 
            System.out.print("Enter a message: ");
            String in = s.nextLine();

            for (int i = 0; i < in.length(); i++) {
                if (i % 2 == 0) {
                    out += in.charAt(i);
                }
                else {
                    out += Character.toUpperCase(in.charAt(i));
                }
            }
            System.out.println("Sarcasmified: " + out);
        }
    }
}