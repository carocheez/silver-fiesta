import java.util.*;
class Main {
  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);

    System.out.println("To choose Rock, type 0. To choose Paper, type 1. To choose Scissors, type 2.");

    int user_action = in.nextInt();
    String computer_action = playGame();
    
    if ((user_action == 0) && (computer_action.equals("paper"))){
      System.out.println("You lose!");
    }
    
    if ((user_action == 0) && (computer_action.equals("scissors"))) {
      System.out.println("You win!");
    }

    if ((user_action == 0) && (computer_action.equals("rock"))) {
      System.out.println("Draw!");
    }

    if ((user_action == 1) && (computer_action.equals("rock"))) {
      System.out.println("You win!");
    }

    if ((user_action == 1) && (computer_action.equals("paper"))) {
      System.out.println("Draw!");
    }

    if ((user_action == 1) && (computer_action.equals("scissors"))) {
      System.out.println("You lose!");
    }

    if ((user_action == 2) && (computer_action.equals("rock"))) {
      System.out.println("You lose!");
    }

    if ((user_action == 2) && (computer_action.equals("paper"))) {
      System.out.println("You win!");
    }

    if ((user_action == 2) && (computer_action.equals("scissors"))) {
      System.out.println("Draw!");
    }

  }

  //a method
  public static String playGame () {
    int computer_action = (int)(Math.random() * 2);
    String [] actions = {"rock", "paper", "scissors"};
    return actions[computer_action];
  }
}

/**
1. Ask the user for a number (0,1,2) for rock, paper, scissors
2. The computer generates a random number that
represents R, P, S
3. P beats R, R beats S, S beats P
- if the user's action defeats the computer's action, then print "You win!". else, print "You lose!"
**/
