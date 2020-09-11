import java.util.Scanner;

class SecondsPastMidnight {
    public static void main(String[] args) {

        //Creates a new scanner for user input
        Scanner scanner = new Scanner(System.in);

        //Reads int from user
    int number = scanner.nextInt();
    int minutes = number / 60;
    int hours = number / 3600;

  
    System.out.print(hours + " " + minutes);
    


        // closing the scanner object
        scanner.close();
    }
}