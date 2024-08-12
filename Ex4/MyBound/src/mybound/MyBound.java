/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mybound;

import java.util.Scanner;

/**
 *
 * @author DoubleX
 */
public class MyBound {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LiveScoreBean obj = new LiveScoreBean();
        Subscriber sub1 = new Subscriber();
        Subscriber sub2 = new Subscriber();
        obj.addPropertyChangeListener(sub1);
        obj.addPropertyChangeListener(sub2);
        Scanner in = new Scanner(System.in);
        String input;
        
        while (true) {
            System.out.print("Enter Score (press Enter without text to finish):");
            input = in.nextLine();
            if (input.isEmpty()) {
                break;
            }
            obj.setScore(input);
        }
    }
    
}
