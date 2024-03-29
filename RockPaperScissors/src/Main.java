
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Let's play Rock Paper Scissors.");
        System.out.println("When I say 'shoot', Choose: rock, paper, or scissors.\n");
        System.out.println("Are you ready? Write 'Yes' if you are.");

        // Task 1: See if the user wants to play.
        String answer = scan.nextLine();

        /*
         * Task 2: Set up the game
         *
         *
         * • if the answer is yes: – print: Great! – print: rock – paper –
         * scissors, shoot! – pick up user's choice. – get the computer choice (can
         * only be done after task 3). – get the result (can only be done after task
         * 4) – print everything (can only be done after task 5). • else: – print:
         * Darn, some other time...!
         */
        if (answer.toLowerCase().equals("yes")) {
            System.out.println("\nGreat!");
            System.out.println("Rock, Paper, Scissors, SHOOT!");
            String userChoice = scan.nextLine();
            String computerChoice = computerChoice();
            String result = result(userChoice, computerChoice);
            printResult(userChoice, computerChoice, result);
        } else {
            System.out.println("Darn, we will play another time...");
        }

        scan.close();
    }

    // Task 3 – Write a function where the computer picks a random choice.
    public static String computerChoice() {
        double randomNumber = Math.random() * 3;
        int number = (int) randomNumber;

        switch (number) {
            case 0:
                return "rock";
            case 1:
                return "paper";
            case 2:
                return "scissors";
            default:
                return "";
        }
    }

    /**
     * Function name: computerChoice - picks randomly between rock paper and
     * scissors
     *
     * @return a choice (String).
     *
     *         Inside the function: 1. Picks a random number between 0 and 2. 2. if
     *         0: returns the choice 'rock' if 1: returns the choice 'paper' if 2:
     *         returns the choice 'scissors'
     */

    // Task 4 – Write a function that compares the choices and returns the result.
    public static String result(String yourChoice, String computerChoice) {
        String result = "";

        if (yourChoice.toLowerCase().equals("rock") && computerChoice.toLowerCase().equals("scissors")) {
            result = "You win!";
        } else if (yourChoice.toLowerCase().equals("paper") && computerChoice.toLowerCase().equals("rock")) {
            result = "You win!";
        } else if (yourChoice.toLowerCase().equals("scissors") && computerChoice.toLowerCase().equals("paper")) {
            result = "You win!";
        } else if (yourChoice.toLowerCase().equals("scissor") && computerChoice.toLowerCase().equals("rock")) {
            result = "You loose.";
        } else if (yourChoice.toLowerCase().equals("rock") && computerChoice.toLowerCase().equals("paper")) {
            result = "You loose.";
        } else if (yourChoice.toLowerCase().equals("paper") && computerChoice.toLowerCase().equals("scissors")) {
            result = "You loose.";
        } else if (yourChoice.toLowerCase().equals(computerChoice)) {
            result = "It's a tie!";
        }

        return result;
    }

    /**
     * Function name: result - It returns the result of the game.
     *
     * @param yourChoice     (String)
     * @param computerChoice (String)
     * @return result (String)
     *
     *         Inside the function: 1. result is "You win" if:
     *
     *         You: "rock" Computer: "scissors" You: "paper" Computer: "rock" You:
     *         "scissors" Computer: "paper"
     *
     *         2. result is "You lose" if:
     *
     *         Computer: "rock" You: "scissors" Computer: "paper" You: "rock"
     *         Computer: "scissors" You: "paper"
     *
     *         3. result is "It's a tie" if:
     *
     *         your choice equals computer choice.
     *
     */

    // Task 5 – Write a function that prints your choice, the computer's, and the
    // result.
    public static void printResult(String yourChoice, String computerChoice, String result) {
        System.out.println("\nYou chose: " + yourChoice);
        System.out.println("Computer chose : " + computerChoice);
        System.out.println(result);
    }

    /**
     * Name: printResult - It prints everything (your choice, computer choice,
     * result)
     *
     * @param yourChoice     (String)
     * @param computerChoice (String)
     * @param result         (String)
     *
     *                       Inside the function:
     *
     *                       1. prints everything: – prints: You chose: <your
     *                       choice> – prints: The computer chose: <computer
     *                       choice> – prints: <result>
     */

}
