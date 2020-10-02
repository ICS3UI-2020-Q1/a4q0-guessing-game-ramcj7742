import java.util.Scanner;
import java.util.Random;
/**
 * A number guessing game
 * @author Jaden Ramcharan
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // creates scanner for user input
    Scanner input = new Scanner(System.in);
    //creating random number generator
    Random rand = new Random();



    //creates a random number
    int randNum = rand.nextInt(100) + 1;

    //declare guess variable
    int guess;
    //game loop
    do{
      //Ask th user for their guess
      System.out.println("Please enter a number between 1 and 100");
      guess = input.nextInt();
      // is it too high or too low
      if(guess > randNum){
        System.out.println("too high");
      }else if(guess < randNum){
        System.out.println("too low");
      }
    }while(guess != randNum);
    System.out.println("Congratulations! You win!");
    
  }
}
