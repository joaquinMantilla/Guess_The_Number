import java.util.InputMismatchException;
import java.util.Scanner ;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        int menuchoice = 0;
        int upperLimit = 0;
        int maxattempts = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Shark guessing the Number Game");

        // Loop until the user chooses to exit
        while (menuchoice < 1 || menuchoice > 5) {


            // Display the menu options
            System.out.println("==== Pick your different level ====");
            System.out.println("1. Option 1: Easy");
            System.out.println("2. Option 2: Medium");
            System.out.println("3. Option 3: Difficult");
            System.out.println("4. Option 4: Impossible");
            System.out.println("5. Exit");
            System.out.println("Enter your choice: ");

            // Get user input
            menuchoice = scanner.nextInt();

            // Perform actions based on the user's choice
            switch (menuchoice) {

                case 1: // easy
                    System.out.println("You picked: Easy! The shark is coming for you");
                    upperLimit = 25;
                    maxattempts = 20;
                    break;
                case 2: // medium (also default)
                    System.out.println("You picked: medium! The bigger shark is coming for you");
                    upperLimit = 50;
                    maxattempts = 15;
                    break;
                case 3: // Difficult (also default)
                    System.out.println("You picked: Difficult! The even bigger shark is coming for you");
                    upperLimit = 100;
                    maxattempts = 10;
                    break;
                case 4: // impossible (also default)
                    System.out.println("You picked: Impossible! The biggest shark is coming for you");
                    upperLimit = 500;
                    maxattempts = 5;
                    break;
                case 5: // break
                    System.out.println("You: exited! The shark swam away");
                    break;
                default:
                    System.out.println("No way jose! Pick again for the shark to bite you");
            } //end switch
        } //end while

        //when we get here, we know that we have chosen a number between 1 and 5

        // Random number between 1 and 100
        Random r = new Random();
        int number_To_Guess = r.nextInt(upperLimit) + 1;
        //System.out.printf(" The random number generated was %d. The upperLimit is %d\n", number_To_Guess, upperLimit);
        boolean win = false;
        int attemptnumber = 0;

        while( !win && attemptnumber < maxattempts) {
            attemptnumber = attemptnumber +1;

            if (attemptnumber == maxattempts){
                System.out.println("LAST CHANCE BRO! THE SHARK IS NEAR!!!");
            }
            System.out.printf("(Attempt %d of %d) Enter your guess: ", attemptnumber , maxattempts);
            int guess = scanner.nextInt();

            if (guess == number_To_Guess) {
                System.out.printf("Winner Winner chicken dinner, the shark is dead. The random number generated was %d and the number was %d\n ", guess, number_To_Guess);
                win = true;
            }
            else if (guess < number_To_Guess ) {
                System.out.println("Your number wasn't correct, to low, try a new number");
            }
            else {
                System.out.println("Your number wasn't correct, to high, try a new number");
            } //end if


        } //end while
        if (attemtnumber > maxattempts)
            System.out.println (" Damn bro The Shark ate you, see you later my guy");
    } //end program
} //end class