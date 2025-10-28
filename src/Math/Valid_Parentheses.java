package Math;

import java.util.Random;

public class Valid_Parentheses {
	public static void main(String[] args) throws InterruptedException {
        String heart = 
            "  ***     ***  \n" +
            "*     * *     *\n" +
            "*      *      *\n" +
            " *            *\n" +
            "  *          *\n" +
            "   *        *\n" +
            "    *      *\n" +
            "     *    *\n" +
            "      *  *\n" +
            "        *\n";
        
        int screenWidth = 80;
        int screenHeight = 24;
        
        Random random = new Random();
        
        while (true) {
            clearScreen();
            
            int x = random.nextInt(screenWidth - 10);  // Random x position
            int y = random.nextInt(screenHeight - 10); // Random y position
            
            // Print newline characters to move the heart to the random position
            for (int i = 0; i < y; i++) {
                System.out.println();
            }
            
            // Print spaces to move the heart to the random x position
            for (int i = 0; i < x; i++) {
                System.out.print(" ");
            }
            
            System.out.print(heart);
            
            Thread.sleep(1000);
        }
    }
    
    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
