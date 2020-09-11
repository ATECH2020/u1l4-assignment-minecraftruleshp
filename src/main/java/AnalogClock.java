import java.util.Scanner;

class AnalogClock {
    public static void main(String[] args) {

        //Creates a new scanner for user input
        Scanner scanner = new Scanner(System.in);
        int degree = scanner.nextInt();
        //Reads ints from user
      

        /*
         *  your code goes here
         */
        int hourPass = degree / 30; //finds hours passed
      
        int degreePass = hourPass * 30; //finds degrees passed

        int minutePass = degree - degreePass; //finds minutes passed

        int degreeMin = (minutePass * 2) * 6; //conv min to degrees

        System.out.print(degreeMin); //prints final result
        // closing the scanner object
        scanner.close();
    }
}