package cinema;

import java.util.Scanner;

public class Cinema {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of rows:");

        int rows = scanner.nextInt();

        System.out.println("Enter the number of seats in each row:");

        int seatsInRow = scanner.nextInt();

        String[][] seatArray = new String[rows][seatsInRow];
        for (int i = 0; i < seatArray.length; i++) {
            for (int j = 0; j < seatArray[i].length; j++) {
                seatArray[i][j] = "S";
            }
        }

        int userInput;
        int purchasedTickets = 0;
        double purchasedTicketsPercentage = 0.0;
        int currentIncome = 0;
        int totalSeats = rows * seatsInRow;
        int totalIncome;

        if (totalSeats <= 60) {
            totalIncome = totalSeats * 10;
        } else {
            int frontRows = rows / 2;
            int backRows = rows / 2 + rows % 2;
            totalIncome = frontRows * seatsInRow * 10 + backRows * seatsInRow * 8;
        }

        while (true) {
            userInput = mainMenu(scanner);
            if (userInput == 1) {
                showSeats(seatArray);
            } else if (userInput == 2) {
                currentIncome += buyATicket(scanner, seatArray);
                purchasedTickets++;
                purchasedTicketsPercentage = (double) purchasedTickets / totalSeats;
            } else if (userInput == 3) {
                statistics(purchasedTickets, purchasedTicketsPercentage, currentIncome, totalIncome);
            } else if (userInput == 0) {
                break;
            }
        }
    }

    public static void showSeats(String[][] seatArray) {
        System.out.println();
        System.out.println("Cinema:");
        System.out.print(" ");
        for (int i = 1; i <= seatArray[0].length; i++) {
            System.out.print(" " + i);
        }
        System.out.println();
        for (int i = 1; i <= seatArray.length; i++) {
            System.out.print(i);
            for (int j = 0; j < seatArray[0].length; j++) {
                System.out.print(" " + seatArray[i - 1][j]);
            }
            System.out.println();
        }
    }

    public static int buyATicket(Scanner scanner, String[][] seatArray) {
        boolean purchased = false;
        int seatPrice = 0;

        while (!purchased) {
            System.out.println();
            System.out.println("Enter a row number:");

            int row = scanner.nextInt();

            System.out.println("Enter a seat number in that row:");

            int seat = scanner.nextInt();

            if ((row - 1) < 0 || (row - 1) >= seatArray.length || (seat - 1) < 0 || (seat - 1) >= seatArray[0].length) {
                System.out.println();
                System.out.println("Wrong input!");
                continue;
            } else if (seatArray[row - 1][seat - 1].equals("B")) {
                System.out.println();
                System.out.println("That ticket has already been purchased!");
                continue;
            }

            int totalSeats = seatArray.length * seatArray[0].length;

            if (totalSeats <= 60 || row <= seatArray.length / 2) {
                seatPrice = 10;
            } else {
                seatPrice = 8;
            }

            System.out.println();
            System.out.println("Ticket price: $" + seatPrice);

            seatArray[row - 1][seat - 1] = "B";

            purchased = true;
        }

        return seatPrice;
    }

    public static int mainMenu(Scanner scanner) {
        System.out.println();
        System.out.println("1. Show the seats");
        System.out.println("2. Buy a ticket");
        System.out.println("3. Statistics");
        System.out.println("0. Exit");

        int response = scanner.nextInt();

        return response;
    }

    public static void statistics(int purchasedTickets,
                                  double purchasedTicketsPercentage,
                                  int currentIncome,
                                  int totalIncome) {
        System.out.println();
        System.out.printf("Number of purchased tickets: %d%n", purchasedTickets);
        System.out.printf("Percentage: %.2f%%%n", purchasedTicketsPercentage * 100);
        System.out.printf("Current income: $%d%n", currentIncome);
        System.out.printf("Total income: $%d%n", totalIncome);
    }
}