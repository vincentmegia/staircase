package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        staircase(9);
    }

    static void staircase(int n) {
        String text = "";
        for (int row = 0; row <= n - 1; row++) {
            text += "#";
            for (int column = 0; column <= n - (row + 2) ; column++) {
                System.out.print(" ");
            }
            System.out.println(text);
        }
    }
}
