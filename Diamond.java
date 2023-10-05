import java.util.Scanner;

public class Diamond {
  public static void main(String[] args) {

    int size = 0;
    int sizeHalf = size/2;
    int numSpaces;
    int numStars;

    Scanner scan = new Scanner(System.in);
    System.out.print("Enter a number: ");
    size = scan.nextInt();
    scan.close();

    // Calculates number of spaces and stars
    for(int i = 0; i < size; i++){
      numSpaces = Math.abs(sizeHalf - i);
      numStars = 2 * (sizeHalf - numSpaces) + 1;
      }

    // Prints spaces before star
    for(int a = 0; a < numSpaces; a++){
      System.out.println(" ");
    }

    // Prints star on each row
    for(int b = 0; b < numStars; b++){
      System.out.println("*");
    }

    // Moves to next line
    System.out.println();
    }
  }
