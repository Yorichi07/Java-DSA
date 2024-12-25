package com.aditya.Patterns;

public class Pattern {
    public static void main(String[] args) {
        pattern10(4);
    }

    //    *
//    * *
//    * * *
//    * * * *
//    * * * * *
    public static void pattern1(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    //    * * * * *
//    * * * * *
//    * * * * *
//    * * * * *
//    * * * * *
    public static void pattern2(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    //    * * * * *
//    * * * *
//    * * *
//    * *
//    *
    public static void pattern3(int n) {
        for (int row = n; row > 0; row--) {
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    //    1
//    1 2
//    1 2 3
//    1 2 3 4
//    1 2 3 4 5
    public static void pattern4(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    //    *
//    * *
//    * * *
//    * * * *
//    * * * * *
//    * * * *
//    * * *
//    * *
//    *
    public static void pattern5(int n) {
        for (int row = 1; row <= 2 * n - 1; row++) {
            int totalCol;
            if (row > n) {
                totalCol = 2 * n - row;
            } else {
                totalCol = row;
            }
            for (int col = 1; col <= totalCol; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    //        *
//       * *
//      * * *
//     * * * *
//    * * * * *
//     * * * *
//      * * *
//       * *
//        *
    public static void pattern6(int n) {
        for (int row = 1; row <= 2 * n - 1; row++) {
            int totalStar = row > n ? 2 * n - row : row;
            int totalSpace = n - totalStar;
            for (int col = 1; col <= totalSpace; col++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= totalStar; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    //        1
//       212
//      32123
//     4321234
//    543212345
    public static void pattern7(int n) {
        for (int row = 1; row <= n; row++) {
            int totalSpace = n - row;
            for (int col = 1; col <= totalSpace; col++) {
                System.out.print(" ");
            }
            for (int col = row; col > 0; col--) {
                System.out.print(col);
            }
            for (int col = 2; col <= row; col++) {
                System.out.print(col);
            }
            System.out.println();
        }
    }

    //        1
//       212
//      32123
//     4321234
//    543212345
//     4321234
//      32123
//       212
//        1
    public static void pattern8(int n) {
        for (int row = 1; row <= 2 * n - 1; row++) {
            int totalCol = row > n ? 2 * n - row : row;
            int totalSpace = n - totalCol;
            for (int col = 1; col <= totalSpace; col++) {
                System.out.print(" ");
            }
            for (int col = totalCol; col > 0; col--) {
                System.out.print(col);
            }
            for (int col = 2; col <= totalCol; col++) {
                System.out.print(col);
            }
            System.out.println();
        }
    }

    //    0 0 0 0 0 0 0 0 0
//    0 1 1 1 1 1 1 1 0
//    0 1 2 2 2 2 2 1 0
//    0 1 2 3 3 3 2 1 0
//    0 1 2 3 4 3 2 1 0
//    0 1 2 3 3 3 2 1 0
//    0 1 2 2 2 2 2 1 0
//    0 1 1 1 1 1 1 1 0
//    0 0 0 0 0 0 0 0 0
    public static void pattern9(int n) {
        for (int row = 0; row <= 2 * n; row++) {
            for (int col = 0; col <= 2 * n; col++) {
                int elementAtEveryIndex = Math.min(Math.min(row, col), Math.min(2 * n - row, 2 * n - col));
                System.out.print(elementAtEveryIndex + " ");
            }
            System.out.println();
        }
    }

    //    4 4 4 4 4 4 4 4 4
//    4 3 3 3 3 3 3 3 4
//    4 3 2 2 2 2 2 3 4
//    4 3 2 1 1 1 2 3 4
//    4 3 2 1 0 1 2 3 4
//    4 3 2 1 1 1 2 3 4
//    4 3 2 2 2 2 2 3 4
//    4 3 3 3 3 3 3 3 4
//    4 4 4 4 4 4 4 4 4
    public static void pattern10(int n) {
        for (int row = 0; row <= 2 * n; row++) {
            for (int col = 0; col <= 2 * n; col++) {
                int elementAtEveryIndex = n - Math.min(Math.min(row, col), Math.min(2 * n - row, 2 * n - col));
                System.out.print(elementAtEveryIndex + " ");
            }
            System.out.println();
        }
    }
}
