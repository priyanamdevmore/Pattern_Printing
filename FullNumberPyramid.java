package Pattern_Printing;

public class FullNumberPyramid {
    public static void main(String[] args) {
        int rows = 5;
        for (int i = 1; i <= rows; i++) {
            // Print spaces for centering
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            // Print ascending numbers
            for (int k = 1; k <= i; k++) {
                System.out.print(k);
            }
            // Print descending numbers
            for (int k = i - 1; k >= 1; k--) {
                System.out.print(k);
            }
            System.out.println();
        }
    }
}