import java.util.Scanner;

class Timestamps {
    public static void main(String[] args) {

        //Creates a new scanner for user input
        Scanner scanner = new Scanner(System.in);

        //Reads ints from user
        int hours1 = scanner.nextInt();
        int minutes1 = scanner.nextInt();
        int seconds1 = scanner.nextInt();
        int hours2 = scanner.nextInt();
        int minutes2 = scanner.nextInt();
        int seconds2 = scanner.nextInt();


        /*
         *  your code goes here
         */

        int newHour = hours1 * 3600; //converts hours1 to sec
        int newHour2 = hours2 * 3600; //converts hours2 to sec
        int newMinute1 = minutes1 * 60; //converts minutes2 to sec
        int newMinute2 = minutes2 * 60; //converts minutes 2 to sec
        

        int finalHours = newHour2 - newHour; 
        int finalMinutes = newMinute2 - newMinute1;
        int finalSeconds = seconds2 - seconds1;

        int total = finalHours + finalMinutes + finalSeconds; //combines everything

        System.out.print(total); //prints final result
        //Closing the scanner object
        scanner.close();
    }
}