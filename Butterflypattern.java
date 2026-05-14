package Pattern_Printing;


public class Butterflypattern {
    
    public static void printButterfly(int n) {
        // Upper part
        for(int i = 1; i <= n; i++) {
            // left stars
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // spaces
            for(int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }
            // right stars
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // Lower part
        for(int i = n - 1; i >= 1; i--) {
            // left stars
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // spaces
            for(int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }
            // right stars
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printButterfly(5);
    }
    
}
