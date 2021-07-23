package robo;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

public class Robo {

    public static void main(String[] args) {    
       //do{
            try{
            Thread.sleep(20000);
            System.out.println("Executando seu macro...");
            }catch(Exception e){
            }
           try {

               Robot robot = new Robot();
               robot.delay(1000);

               robot.mouseMove(400, 800);
               robot.mousePress(InputEvent.BUTTON1_MASK);
               robot.mouseRelease(InputEvent.BUTTON1_MASK);
               robot.delay(1000);           
               robot.keyPress(KeyEvent.VK_Y);              
               robot.keyPress(KeyEvent.VK_O);              
               robot.keyPress(KeyEvent.VK_U);              
               robot.keyPress(KeyEvent.VK_T);              
               robot.keyPress(KeyEvent.VK_U);              
               robot.keyPress(KeyEvent.VK_B);              
               robot.keyPress(KeyEvent.VK_E);              
               robot.keyPress(KeyEvent.VK_ENTER);
               robot.delay(1000); 
               robot.mouseMove(200, 300);
               robot.mousePress(InputEvent.BUTTON1_MASK);
               robot.mouseRelease(InputEvent.BUTTON1_MASK);
               robot.delay(1000); 
               robot.mouseMove(400, 650);
               robot.delay(1000);
               robot.mousePress(InputEvent.BUTTON1_MASK);
               robot.mouseRelease(InputEvent.BUTTON1_MASK);               
               robot.delay(5000);
               robot.keyPress(KeyEvent.VK_ALT);
               robot.keyPress(KeyEvent.VK_F4);
               robot.keyRelease(KeyEvent.VK_ALT);
               robot.keyRelease(KeyEvent.VK_F4);
            System.out.println("Macro finalizando!");


           } catch (AWTException e) {
               e.printStackTrace();
           }
    //}while(true);
       }
    }