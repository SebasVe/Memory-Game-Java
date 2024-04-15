/**
 * Project 3.6.5
 *
 * The Memory Game shows a random sequence of "memory strings" in a variety of buttons.
 * After wathcing the memory strings appear in the buttons one at a time, the
 * player recreates the sequence from memory.
 */
public class MemoryGame
{
  public static void main(String[] args) 
  {
    boolean playAgain = true;
    int score = 0;
    int round = 0;

    String[] memory = {"a","b","c"};

    MemoryGameGUI game = new MemoryGameGUI();
    game.createBoard(3, true);

    while (playAgain == true)
    {
        String[] randomMemory = {memory[(int)(Math.random()*3)],memory[(int)(Math.random()*3)],memory[(int)(Math.random()*3)]};
        String randomStringForm = (randomMemory[0])+(randomMemory[1])+(randomMemory[2]);
        String userGuess = game.playSequence(randomMemory, 0.5);
        if (randomStringForm.equals(userGuess))
        {
            game.matched();
            score++;
        }
        else
        {
            game.tryAgain();
        }
        round++;
        game.showScore(score,round);
        playAgain = game.playAgain();
    }
    game.showScore(score,round);
    game.quit();
    // Create the "memory strings" - an array of single character strings to 
    // show in the buttons, one element at a time. This is the sequence
    // the player will have to remember.

    // Create the game and gameboard. Configure a randomized board with 3 buttons.
    // (Later, you can change options to configure more or less buttons
    // and turn randomization on or off.)

    // Play the game until user wants to quit.
  
      // Create a new array that will contain the randomly ordered memory strings.

      // Create a list of randomly ordered integers with no repeats, the length
      // of memory strings. Use it to create a random sequence of the memory strings.
      // - OR -
      // Overload the next method in RandomPermutation to create a random sequence 
      // of the memory strings, passed as a parameter.

      // Play one sequence, delaying half a second for the strings to show
      // in the buttons. Save the player's guess. 
      // (Later, you can speed up or slow down the game.)

      // Determine if player's guess matches all elements of the random sequence.
      
        // Cleanup the guess - remove commas and spaces. Refer to a new String method 
        // replace to make this easy.
        
        // iterate to determine if guess matches sequence

        // If match, increase score, and signal a match, otherwise, try again.

      // Ask if user wants to play another round of the game 
      // and track the number of games played.
   
    // When done playing, show score and end the game.
  }
}