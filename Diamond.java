import java.util.Scanner;

public class Diamond {
  public static void main(String[] args) {

    int size;

    Scanner scan = new Scanner(System.in);
    System.out.print("Enter a number: ");
    size = scan.nextInt();
    scan.close();

    int midpoint = size/2;

    // Even size diamond
    if(size % 2 == 0){

      for(int row = 0; row <= size; row++){

        // Calculates number of spaces and stars for each row
        int numSpaces = Math.abs(midpoint - row);
        int numStars = 2 * (midpoint - numSpaces) + 1;

        // Always prints first star with spaces before the star
        if(row == 0){
          numSpaces = size - 1;
          for(int firstRowSpaces = 0; firstRowSpaces < numSpaces; firstRowSpaces++){
            System.out.print(" ");
          }
          System.out.print("*");
        }

        // Always prints last star with spaces before the star
        else
          if(row == size) {
            numSpaces = size - 1;
            for(int lastRowSpaces = 0; lastRowSpaces < numSpaces; lastRowSpaces++){
              System.out.print(" ");
            }
            System.out.print("*");
        }

        for(int middleRowSpaces = 0; middleRowSpaces < numSpaces; middleRowSpaces++){
          System.out.print("  ");
        }

        for(int middleRowStars = 0; middleRowStars < numStars - 1; middleRowStars++){
          System.out.print("* ");
        }

        // Moves to next row
        System.out.println();
      }
    }

    // Odd size diamond
    else{

      for(int row = 0; row < size; row++){

        // Calculates number of spaces and stars for each row
        int numSpaces = Math.abs(midpoint - row);
        int numStars = 2 * (midpoint - numSpaces) + 1;

        for(int spaces = 0; spaces < numSpaces; spaces++){
          System.out.print(" ");
        }

        for(int stars = 0; stars < numStars; stars++){
          System.out.print("*");
        }

        // Moves to next row
        System.out.println();
      }
    }
  }
}
