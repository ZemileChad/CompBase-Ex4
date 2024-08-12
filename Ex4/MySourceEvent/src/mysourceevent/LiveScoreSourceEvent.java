/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mysourceevent;

import java.util.Scanner;

/**
 *
 * @author sarun
 */
public class LiveScoreSourceEvent {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ScoreSource obj = new ScoreSource();
        Subscriber sub1 = new Subscriber();
        Subscriber sub2 = new Subscriber();
        obj.addMyListener(sub1);
        obj.addMyListener(sub2);
        Scanner in = new Scanner(System.in);
        String input;
        
        while (true) {
            System.out.print("Enter Score (press Enter without text to finish):");
            input = in.nextLine();
            if (input.isEmpty()) {
                break;
            }
            obj.setScoreLine(input);
        }
    }
    
}
