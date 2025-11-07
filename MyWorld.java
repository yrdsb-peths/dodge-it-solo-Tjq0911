import greenfoot.*;

public class MyWorld extends World {
    private int score = 0;
    private Player player;
    public MyWorld() {
         
        super(600, 400, 1);
        Player player = new Player();
        addObject(player, 300, 350);
        
    }
}
