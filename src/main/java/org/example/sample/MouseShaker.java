package org.example.sample;
import java.awt.*;
import java.util.Random;

public class MouseShaker {
    public static void main(String[] args) throws InterruptedException{

        Robot robot;
        try{
            robot = new Robot();
        }catch (AWTException e){
            e.printStackTrace();
            return;
        }

        Random random = new Random();
        while(true){
            int dx= random.nextInt(21) - 10;
            int dy= random.nextInt(21) - 10;

            robot.mouseMove(MouseInfo.getPointerInfo().getLocation().x+dx,
                    MouseInfo.getPointerInfo().getLocation().y+dy);
            Thread.sleep(5000);
        }
    }
}
