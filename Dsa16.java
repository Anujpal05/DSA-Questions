// Input 4
//    1
//   212
//  32123
// 4321234
//  32123
//   212
//    1

public class Dsa16 {
    public static void rhombus(int n) {
        for (int i = 0; i < n; i++) {
            int l = i + 2;
            for (int j = n; j > i + 1; j--) {
                System.out.print(" ");
            }

            for (int k = (i + 1) * 2 - 1; k > 0; k--) {
                if (k >= ((i + 1) * 2 - 1) / 2 + 1) {
                    System.out.print(--l);
                } else {
                    System.out.print(++l);
                }
            }
            System.out.println();
        }

        for (int i = n - 1; i > 0; i--) {
            int l = i + 1;
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = (2 * i) - 1; k > 0; k--) {
                if (k >= ((2 * i) - 1) / 2 + 1) {
                    System.out.print(--l);
                } else {
                    System.out.print(++l);

                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        rhombus(4);
    }
}
