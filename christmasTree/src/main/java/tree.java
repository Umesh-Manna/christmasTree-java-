import java.util.Scanner;

public class tree {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
                //WAP: where we print a chrismas tree
        
        System.out.println("Give a number:");
        int iInput = Integer.valueOf(scan.nextLine());
        
        //Prints the top part of the tree
        int nth = 1;
        int iInp2 = iInput;
        for (int i = 1; i <= iInput; i++ ) {
            printSpace(iInp2);
            printStars(nth);
            System.out.println("");
            
            
            nth++;
            iInp2--;
        }
        
        //Prints the base of the tree
        for (int i = 1; i <= 2; i++) {
            //prints the space
            for(int j = 1; j<= (iInput-2); j++) {
                System.out.print(" ");
            }
            
            //print the stars
            for (int j = 1; j<= 3; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
      
    }
    
    public static void printSpace(int iInput) {
        
        for(int i = (iInput-1); i>=1; i--) {
            System.out.print(" ");
        }  
    }
     
    public static void printStars(int nth) {
        
        //Finds the nth odd number, starting from 1 as the first odd number
        int iOdd = -1;
        for (int i = 1; i <= nth; i++){
            iOdd += 2;
        }
        
        //prints the starts, odd number of times
        for(int i = 1; i <= iOdd; i++) {
            System.out.print("*");
        }
    }
}

