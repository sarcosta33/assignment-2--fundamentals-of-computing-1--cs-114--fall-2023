import java.util.Scanner;

public class Diamond {
  public static void main(String[] args) {

    int size;

    Scanner scan = new Scanner(System.in);
    System.out.print("Enter a number: ");
    size = scan.nextInt();
    scan.close();

    int sizeHalf = size/2;

    if(size % 2 == 0){

      for(int counter = 0; counter <= size - 1; counter++){
        // divides enetered size in half and subtracts from ...
        int numSpaces = Math.abs(sizeHalf - counter);
        int numStars = 2 * (sizeHalf - numSpaces) + 1; //explain

        for(int spaces = 0; spaces < numSpaces; spaces++){
          System.out.print(" ");
        }

        for(int stars = 0; stars < numStars - 1; stars++){
          System.out.print("* ");
        }

        // Moves to next line
        System.out.println();
      }
    }

    else{

      for(int counter = 0; counter < size; counter++){
        int numSpaces = Math.abs(sizeHalf - counter);
        int numStars = 2 * (sizeHalf - numSpaces) + 1; //comment here explaining

        for(int spaces = 0; spaces < numSpaces; spaces++){
          System.out.print(" ");
        }

        for(int stars = 0; stars < numStars; stars++){
          System.out.print("*");
        }

        // Moves to next line
        System.out.println();

        }
      }
  }
}
