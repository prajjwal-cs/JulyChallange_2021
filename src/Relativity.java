/* Created by IntelliJ IDEA.

    Author: Prajjwal Pachauri
    Date: 09-07-2021
    Time: 01:01 PM
    File: Relativity.java
*/

import java.util.Scanner;

/* Test cases:
 *    3
 *    7 1400
 *    5 1000
 *    10 1000
 */

public class Relativity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t-- > 0) {
            int g = sc.nextInt();
            int c = sc.nextInt();

            int res = (c * c) / (2 * g);
            System.out.println(res);
        }

    }
}