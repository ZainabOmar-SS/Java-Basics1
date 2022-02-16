//Write a Java program that prints out the following patterns using loops:
public class Patterns {
    public static void main(String[] args) {
        int rows1 = 4;
//        int rows2 = 7;
        int k = 0;

        for (int i = 1; i <= rows1; ++i) {
            for (int j = 1; j <= i; ++j) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println(".........\n");
        System.out.println(".........");
        for(int i = rows1; i>=1; --i){
            for(int j = 1; j <=i; ++j){
                System.out.print("* ");
            }
            System.out.println();
        }

        for(int i = 1; i <= rows1; ++i, k = 0) {
            for (int space = 1; space <= rows1 - i; ++space) {
                System.out.print("  ");
            }

            while (k != 2 * i - 1) {
                System.out.print("* ");
                ++k;
            }

            System.out.println();
        }
        System.out.println("..............\n");
        System.out.println("..............");

        for(int i = rows1; i >= 1; --i) {
            for(int space = 1; space <= rows1 - i; ++space) {
                System.out.print("  ");
            }

            for(int j=i; j <= 2 * i - 1; ++j) {
                System.out.print("* ");
            }

            for(int j = 0; j < i - 1; ++j) {
                System.out.print("* ");
            }

            System.out.println();
        }


    }
}
