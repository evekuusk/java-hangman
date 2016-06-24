public class Hangman {
  public static void main(String[] args) {
    Game game = new Game(args[0]);
    Prompter prompter = new Prompter(game);
    prompter.play();
  }
}
