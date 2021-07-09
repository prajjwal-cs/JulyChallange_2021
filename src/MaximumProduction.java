/* Created by IntelliJ IDEA.

    Author: Prajjwal Pachauri
    Date: 09-07-2021
    Time: 01:06 PM
    File: MaximumProduction.java 
*/

import java.util.Scanner;

public class MaximumProduction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();
        while (t-- > 0) {
            byte d = scanner.nextByte();
            byte x = scanner.nextByte();
            byte y = scanner.nextByte();
            byte z = scanner.nextByte();

            // Using first strategy
            int first = x * 7;
            // Using second strategy
            int second = (y * d) + (z * (7 - d));

            if (first > second) {
                System.out.println(first);
            } else {
                System.out.println(second);
            }
        }
    }
}