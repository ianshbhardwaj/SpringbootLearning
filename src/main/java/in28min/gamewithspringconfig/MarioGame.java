package in28min.gamewithspringconfig;

public class MarioGame implements GamingConsole {

    public void up(){
        System.out.println("Jump");
    }

    public void down(){
        System.out.println("Go into hole");
    }

    public void left(){
        System.out.println("Go Back");
    }

    public void right(){
        System.out.println("Accelerate");
    }


}
