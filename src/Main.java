import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        bonus();
    }

    public static void task41() {
        System.out.print("Enter number: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if (number % 2 == 1) {
            System.out.println("Odd");
        } else {
            System.out.println("Even");
        }
    }

    public static void task42() {
        System.out.print("Enter number: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        for (int i = 0; i < number; i++) {
            System.out.print(i);
        }
    }

    public static void task43() {
        int[] numbers = {12, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int max = numbers[0];
        int min = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }

            if (numbers[i] < min) {
                min = numbers[i];
            }
        }

        System.out.println("Max " + max);
        System.out.println("Min " + min);
    }

    public static void task44() {
        System.out.print("Enter number: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        // number/==0

    }

    public static void task45(int number) {
        int factorial = 1;

        if (number == 1) {
            System.out.println(1);
        }

        for (int i = 1; i <= number; i++) {
            factorial = factorial * i;
        }

        System.out.println(factorial);
    }

    public static void task46(String text) {
        //First Solution
        StringBuilder result = new StringBuilder(text);
        System.out.println(result.reverse());

        //Second solution
        String reversed = "";

        for (int i = text.length() - 1; i >= 0; i--) {
            char c = text.charAt(i);
            reversed += c;
        }
        System.out.println(reversed);
    }

    public static void task47() {
        String text = "level";
        boolean polindrom = false;
        for (int i = 0; i < text.length() / 2; i++) {
            if (!(text.charAt(i) == text.charAt(text.length() - 1))) {
                break;
            } else {
                polindrom = true;
            }
        }
        System.out.println(polindrom);
    }

    public static void task48() {
        int[] numbers = {2, 4, 6, 8, 10};
        int sum = 0;
        int count = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
            count++;
        }

        System.out.println("Sum: " + sum);
        System.out.println("Average: " + (double) sum / count);

    }

    public static void task49() {
        for (int i = 1; i < 50; i++) {
            if (i % 3 == 0) {
                System.out.println(i + " - Fizz");
            } else if (i % 5 == 0) {
                System.out.println(i + "- Buzz");
            } else if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i + " - FizzBuzz");
            }
        }
    }

    public static void task50() {
        int[] numbers = {4, 3, 2, 5, 12, 3, 1};

        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = 0; j < numbers.length - 1 - i; j++) {

                if (numbers[j] > numbers[j + 1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(numbers));
    }

    public static void bonus() {
        String a = "Salam";
        String b = "Sagol";

        //SalamSagol
        a=(a+b).substring(a.length(),(a+b).length());
        System.out.println(a);

        //Nese bele bisey ama b alinmadi

        b=(a+b).substring(0,(a).length());
        System.out.println(b);

    }

}