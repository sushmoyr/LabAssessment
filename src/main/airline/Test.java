package main.airline;

import java.util.Scanner;

public class Test {
    private static final String[] seatTypeName = {"First Class", "Economy"};
    public static void main(String[] args) {
        Flight flight = new Flight();
        int seatType;
        int assignedSeat = -1;

        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("\n-------------------------------------------------------------------");
            System.out.print("Please type 1 for First Class and Please type 2 for Economy: ");
            seatType = scanner.nextInt();
            scanner.nextLine();
            System.out.println("You choose " + seatTypeName[seatType-1]);

            if(flight.isSeatAvailable(seatType)){
                assignedSeat = flight.assignSeat(seatType);
                showBoardingPass(assignedSeat, seatType);
            }
            else{
                System.out.println("Sorry!! No Seat Available in " + seatTypeName[seatType-1]);
                int newSeatType = seatType==2 ? 1 : 2;
                if(flight.isSeatAvailable(newSeatType)){
                    System.out.println("Would like to get a seat on " + seatTypeName[newSeatType-1] + "?");
                    System.out.println("1. Yes \n2. No");
                    int choice = scanner.nextInt();
                    scanner.nextLine();
                    if(choice==1)
                    {
                        assignedSeat = flight.assignSeat(newSeatType);
                        showBoardingPass(assignedSeat, newSeatType);
                    }
                    else{
                        System.out.println("Next flight leaves in 3 hours");
                    }
                }
                else{
                    System.out.println("Next flight leaves in 3 hours");
                }
            }

            System.out.println("-------------------------------------------------------------------\n");
        }


    }

    private static void showBoardingPass(int seatNo, int seatType){
        System.out.println("=============  Boarding Pass  =============\n");
        System.out.println("Seat no: " + seatNo);
        System.out.println("Seat Type: " + seatTypeName[seatType-1]);
        System.out.println("\n===========================================");

    }
}
