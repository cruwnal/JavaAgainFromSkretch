public class PatternAdvanceOne {
    public static void main(String[] args) {
        pattern1();
        pattern2();
        pattern3();
        pattern4();
        pattern4_1();
         pattern5();
       pattern6();
    }

    static void pattern1() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 5; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern2() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("$");
            }

            System.out.println();
        }


    }

    static void pattern3() {
        for (int i = 1; i <= 5; i++) {

            for (int j = 1; j <= 5; j++) {
                System.out.print("*");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("$");
            }


            System.out.println();
        }

    }

    static void pattern4() {
        for (int i = 5; i >= 1; i--) {
            {
                for (int j = 1; j < i; j++) {
                    System.out.print('*');
                }
            }
            System.out.println('*');
        }
    }

    static void pattern4_1() {
        for (int i = 1; i <= 5; i++) {
            {
                for (int j = 5; j >= i; j--) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }

    }

    static void pattern5() {
        for (int i = 1; i <= 5; i++) {
            {
                for (int j = 1; j <= i; j++) {
                    System.out.print("_");
                }
                for (int k = 1; k <= 5; k++) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }

    static void pattern6() {
        for (int i = 1; i <= 5; i++) {

                for (int j = 5; j >= i; j--) {
                    System.out.print("-");}

                    for (int k = 1; k<=5; k++) {
                        System.out.print("$");
                    }

                System.out.println();
            }
        }

    }

