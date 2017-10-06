import java.util.Scanner;

class Calculator {
    static void add() {
        Scanner in = new Scanner(System.in);
        System.out.println("Give me first number");
        double a = in.nextDouble();
        System.out.println("Give me second number");
        double b = in.nextDouble();
        System.out.println("Resulf of adding: " + (a + b));
    }

    static void sub() {
        Scanner in = new Scanner(System.in);
        System.out.println("Give me first number");
        double a = in.nextDouble();
        System.out.println("Give me second number");
        double b = in.nextDouble();
        System.out.println("Result of substract: " + (a - b));
    }

    static void div() {
        Scanner in = new Scanner(System.in);
        System.out.println("Give me first number");
        double a = in.nextDouble();
        System.out.println("Give me second number");
        double b = in.nextDouble();
        System.out.println("Result of divide: " + (a / b));
    }

    static void mul() {
        Scanner in = new Scanner(System.in);
        System.out.println("Give me first number");
        double a = in.nextDouble();
        System.out.println("Give me second number");
        double b = in.nextDouble();
        System.out.println("Result of multiply: " + (a * b));
    }

    static void exp() {
        Scanner in = new Scanner(System.in);
        System.out.println("Give me first number");
        double a = in.nextDouble();
        System.out.println("Give me second number");
        double b = in.nextDouble();
        System.out.println("Result of multiply: " + Math.pow(a, b));
    }

    static void sqrt() {
        Scanner in = new Scanner(System.in);
        System.out.println("Give me number");
        double a = in.nextDouble();
        System.out.println("Result of square root: " + Math.sqrt(a));
    }

    static void abs() {
        Scanner in = new Scanner(System.in);
        System.out.println("Give me number");
        int a = in.nextInt();
        System.out.println("Result of absolute value: " + Math.abs(a));
    }

    static void toBin() {
        Scanner in = new Scanner(System.in);
        System.out.println("Give me decimal number");
        int a = in.nextInt();
        int exp2 = 0;
        while (a > Math.pow(2, exp2)) {
            exp2++;
        }
        int tab[] = new int[exp2];
        System.out.print("Binary number: ");
        for (int i = 0; i < tab.length; i++) {
            if (a % 2 == 0) {
                tab[i] = 0;
            } else {
                tab[i] = 1;
            }
            System.out.print(tab[i]);
            a = a / 2;
        }
    }
    static void and() {
        Scanner in = new Scanner(System.in);
        System.out.println("Give me first number");
        int a = in.nextInt();
        System.out.println("Give me second number");
        int b = in.nextInt();
        int c=a&b;
        System.out.println("Result of absolute value: " + c);
    }

    static void run() {
        Scanner in = new Scanner(System.in);
        int wybor = 110;
        while (wybor != 10) {
            System.out.println("Choose wat you want to do: \n" +
                    "0: Adding \n" +
                    "1: Substract \n" +
                    "2: Divide \n" +
                    "3: Multiply\n" +
                    "4: Exponentation\n" +
                    "5: Square root\n" +
                    "6: Absolute value\n" +
                    "7: Binary number\n" +
                    "8: Binary AND\n" +
                    "10: Finish program");
            wybor = in.nextInt();

            switch (wybor) {
                case 0:
                    add();
                    break;
                case 1:
                    sub();
                    break;
                case 2:
                    div();
                    break;
                case 3:
                    mul();
                    break;
                case 4:
                    exp();
                    break;
                case 5:
                    sqrt();
                    break;
                case 6:
                    abs();
                    break;
                case 7:
                    toBin();
                    break;
                case 8:
                    and();
                    break;
                default:
                    System.out.println("Give me right number!");
            }
        }
    }

    public static void main(String[] args) {
        run();
    }
}
