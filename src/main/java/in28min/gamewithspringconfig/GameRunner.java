package in28min.gamewithspringconfig;

public class GameRunner {
    //private MarioGame game;
//    private SuperContraGame game;
    private GamingConsole game;

//    public GameRunner(MarioGame game) {this.game = game;}

//    public GameRunner(SuperContraGame game) {this.game = game;}


    public GameRunner(GamingConsole game) {
        this.game = game;
    }

    public void run() {
        System.out.println("Running Game: "+game);
        game.up();
        game.down();
        game.left();
        game.right();
    }
}
