package at.htl.robot.gui;

import at.htl.robot.model.Robot;
import processing.core.PApplet;


public class Main extends PApplet {

    // Hier die Member-Attribute eintragen

    int leftMargin = 50;
    int upperMargin = 50;
    int boxLength = 50;
    Robot robot;

    public static void main(String[] args) {
        PApplet.main("at.htl.robot.gui.Main", args);
    }

    public void settings() {

        size(800, 800);

    }

    public void setup() {

        background(209); //https://processing.org/tutorials/color/
        robot = new Robot();

    }

    /**
     * Diese Methode wird iterativ durchlaufen (wie loop() beim Arduino)
     */
    public void draw() {

        background(209);

        ellipse(leftMargin + boxLength/2 + robot.getX() ,
                upperMargin + boxLength/2 + robot.getY() ,
                (int) (boxLength * 0.8),
                (int) (boxLength * 0.8));

        for (int i = 0; i < 11; i++) {
            line(leftMargin,
                    upperMargin + i * boxLength,
                    leftMargin + 10 * boxLength,
                    upperMargin + i * boxLength);

            line(leftMargin + i * boxLength,
                    upperMargin,
                    leftMargin + i * boxLength,
                    upperMargin + 10 * boxLength);
        }




    }

    /**
     * Erstellen Sie eine eigene Methode, mittels der der Roboter am Bildschirm gezeichnet wird
     * Die Angabe zu Position des Roboters am Spielfeld erhalten Sie aus dem Roboter-Objekt, welches
     * als Parameter übergeben wird.
     *
     * @param robot Objekt des zu zeichnenden Roboters
     */
    public void drawRobot(Robot robot) {
    }

    /**
     * Erstellen Sie eine eigene Methode zum Löschen des Bildschirms
     */
    public void deleteAll() {
        background(209);
    }

    /**
     * In dieser Methode reagieren Sie auf die Tasten
     */
    public void keyPressed() {
        println("pressed " + key + " " + keyCode);

        if (key == 'f' || key == 'F') {
            robot.stepForward();
        } else if (key == 'l' || key == 'L') {
           robot.rotateLeft();
        }

    }

//   public void keyTyped() {
// println("typed " + key + " " + keyCode);
//   }
//
//    public void keyReleased() {
//        println("released " + key + " " + keyCode);
//    }

}
