package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        // Insert any number (greater than 5) here
        // And the program will draw you a diagonal star!
        printSquareStar(88);

    }

    public static void printSquareStar(int number) {
        if (number < 5) {
            System.out.println("Invalid Value");
        } else {

            // Patterns: if row or column equals 1
            // if row or column equals the inserted number
            // if row == column (diagonal: from top to bottom)
            // if column number equals (number - row + 1)
            for (int row = 1; row <= number; row++) {
                for (int column = 1; column <= number; column++) {
                    if (row == 1 || column == 1
                            || row == column
                            || column == number - row + 1
                            || column == number
                            || row == number) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }

        }


    }
}
