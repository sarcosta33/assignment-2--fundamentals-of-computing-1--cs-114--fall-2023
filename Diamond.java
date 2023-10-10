import java.util.Scanner;

public class Diamond {
  public static void main(String[] args) {

    int size;

    Scanner scan = new Scanner(System.in);
    System.out.print("Enter a number: ");
    size = scan.nextInt();
    scan.close();

    int sizeHalf = size/2;

    // if size enetered is even
    if(size % 2 == 0){

      // Calculates number of spaces and stars
      for(int i = 0; i <= size - 1; i++){
        int numSpaces = Math.abs(sizeHalf - i); //CHANGE FOR EVEN
        int numStars = 2 * (sizeHalf - numSpaces) + 1;

        // Prints spaces before star
        for(int a = 0; a < numSpaces; a++){
          System.out.print(" ");
        }

        // Prints star on each row
        for(int b = 0; b < numStars - 1; b++){
          System.out.print("* ");
        }

        // Moves to next line
        System.out.println();
      }
    }

    // if size entered is odd
    else{

      // Calculates number of spaces and stars
      for(int i = 0; i < size; i++){
        int numSpaces = Math.abs(sizeHalf - i);
        int numStars = 2 * (sizeHalf - numSpaces) + 1;

        // Prints spaces before star
        for(int a = 0; a < numSpaces; a++){
          System.out.print(" ");
        }

        // Prints star on each row
        for(int b = 0; b < numStars; b++){
          System.out.print("*");
        }

        // Moves to next line
        System.out.println();
        }
      }
  }
}
