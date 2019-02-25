/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package distance;

/**
 *
 * @author teel6
 */
import java.text.DecimalFormat;
import java.util.Scanner;
public class Distance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the first x-coordinate:");
        double x1 = sc.nextInt();
        System.out.println("Enter the first y-coordinate:");
        double y1 = sc.nextInt();
        
        System.out.println("Enter the second x-coordinate:");
        double x2 = sc.nextInt();
        System.out.println("Enter the second y-coordinate:");
        double y2 = sc.nextInt();
        
        double distance = Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2));
        double cost = distance * 0.43;
        DecimalFormat numberFormat = new DecimalFormat("#.000");
        
        System.out.println("The distance is: " + numberFormat.format(distance));
        //System.out.println("The travel cost is: $" + numberFormat.format(cost));
    }
    
}
