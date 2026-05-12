package Pattern_Printing;

public class HollowRohmbus {
    public static void main(String[] args) {
        int size = 5;
        // if (args.length > 0) {
        //     try {
        //         size = Integer.parseInt(args[0]);
        //     } catch (NumberFormatException e) {
        //         System.out.println("Invalid size argument, using default size 5.");
        //     }
        // }

        for (int row = 1; row <= size; row++) {
            for (int space = 1; space <= size - row; space++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= size; col++) {
                if (row == 1 || row == size || col == 1 || col == size) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
