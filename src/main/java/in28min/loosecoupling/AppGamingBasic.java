package in28min.loosecoupling;

public class AppGamingBasic {
    public static void main(String[] args) {


     //   var game = new MarioGame();
//        var game = new SuperContraGame();

        //Object Creation
        var game = new PacMan();

        //Object Creation +Wiring of Dependencies
        //Game(Mario, pacman) is a Dependecy of GameRunner
        var gameRunner = new GameRunner(game);

        gameRunner.run();
    }
}
