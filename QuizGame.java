
// I tried TextIO for accepting user input but I found it cumbersome and so I imported Scanner instead.
import java.util.Scanner;

// Intialising the class QuizGame
public class QuizGame {
  // Declaring the main method to run the program.
  public static void main(String[] args) {
    // Creating a new Scanner object to read user input
    Scanner scanner = new Scanner(System.in);
    // Quiz questions and correct answers stored in arrays
    String[] questions = {
        "What was the Game of the year in 2022?",
        "Who wrote Steve Jobs' biography?",
        "What is the colour of Pikachu?",
        "Who directed the movie 'Interstellar'?",
        "Who painted the Mona Lisa?"
    };

    String[] options = {
        "A. BloodBorne\nB. God of War\nC. Elden Ring\nD. Super Mario",
        "A. Dan Brown\nB. Walter Isaacson\nC. Charles Dickens\nD. Mark Twain",
        "A. Blue\nB. Yellow\nC. Green\nD. Purple",
        "A. Christopher Nolan\nB. Zack Snyder\nC. Guy Ritchie\nD. George Lucas",
        "A. Donatello\nB. Raphael\nC. Leonardo da Vinci\nD. Michelangelo"
    };
    // Correct answers for each question stored in an array
    char[] answers = { 'C', 'B', 'B', 'A', 'C' };

    // Declaring an integer variable to store the user's score and initialising it
    // to 0
    int score = 0;

    // Display questions and get user input for each question using a for loop
    for (int i = 0; i < questions.length; i++) {
      System.out.println(questions[i]);
      System.out.println(options[i]);
      System.out.println("Your answer (A, B, C, or D): ");
      // Convert user input to uppercase and get the first character
      char userAnswer = scanner.next().toUpperCase().charAt(0);

      // Compare user answer with correct answer using a switch statement
      switch (userAnswer) {
        case 'A':
        case 'B':
        case 'C':
        case 'D':
          // Increment score if the answer is correct
          if (userAnswer == answers[i]) {
            score++;
          }
          break;
        default:
          System.out.println("Invalid input. Please enter A, B, C, or D.\n");
          // Decrement to repeat the current question
          i--;
      }
    }

    // Calculate and display the final score
    // Convert score to a double to prevent integer division
    double percentage = (double) score / questions.length * 100;
    System.out.println("Questions passed: " + score + " out of " + questions.length);
    System.out.println("Score: " + percentage + "%");
    // Close the scanner
    scanner.close();
  }
}
