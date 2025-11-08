import greenfoot.*;

public class MyWorld extends World {
    private int score = 0;
    private Player player;
    private int time = 1800;
    public MyWorld() {
         
        super(600, 400, 1);
        Player player = new Player();
        addObject(player, 300, 350);
        addObject(new Coin(), Greenfoot.getRandomNumber(600), 0);
        showText("Time: 30", 520, 20);
        
    }
    public void act()
    {
        if(Greenfoot.getRandomNumber(100) < 2)
        {
            addObject(new Coin(), Greenfoot.getRandomNumber(600), 0);    
        }
        time--;
        if(time % 60 == 0)
        {
            showText("Time: " + (time / 60), 520, 20);    
        }
    }
    public void addScore(int points)
    {
        score += points;
        showText("Score: " + score, 50, 20);
    }
}
