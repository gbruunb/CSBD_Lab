/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DrawShapeApplication;

import java.util.Scanner;

/**
 *
 * @author sarun
 */
public class Foot {
    private FootShape footShape = new FootShape();
    public void draw(String shape) {
        switch(shape) {
            case "Ellipse":
                footShape.drawAsEllipse();
                break;
            case "Rectangle":
                footShape.drawAsRectangle();
                break;
        }
    }
    
    public static void main(String[] args) {
        Foot app = new Foot();
        Scanner inp = new Scanner(System.in);
        System.out.print("What to draw? 1. Ellipse, 2. Rectangle ");
        int type = inp.nextInt();
        switch(type) {
            case 1:
                app.draw("Ellipse");
                break;
            case 2:
                app.draw("Rectangle");
                break;
        }      
    }
}
