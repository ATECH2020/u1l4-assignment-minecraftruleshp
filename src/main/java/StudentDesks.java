import java.util.Scanner;

class StudentDesks {
    public static void main(String[] args) {

        //Creates a new scanner for user input
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt(); 
        //Reads ints from user
        int desk1 = 0;
        int desk2 = 0;
        int desk3 = 0;
      
        /*
         *  your code goes here
         */
        
        if (a % 2 == 0)
        {
          desk1 = a / 2;
        } else if (a % 2 == 1){
           desk1 = (a / 2) + 1;
          
        }
        
        if (b % 2 == 0)
        {
         desk2 = b / 2;
        } else if (b % 2 == 1){

          desk2 = (b / 2) + 1;
        }
        
        if (c % 2 == 0)
        {
         desk3 = c / 2;
        } else if (c % 2 == 1){

          desk3 = (c / 2) + 1;
        }
        System.out.print(desk1 + desk2 + desk3);
        
        

        // closing the scanner object
        scanner.close();
    }
}