package ru.job4j;

/**
 * Calculate.
 *
 * @author Artem Trifonov
 * @version $Id$
 * @since 0.1
 */
public class Calculate {
    /**
     * Main.
     * @param args - args.
     */
    public static void main(String[] args) {
        System.out.println("Hello World");

        int i;
        int y;
        int k = 7;

        for (i = 1; i < k;i++){
            y = i + k*i;
            System.out.println("result = " + y);

        }

    }
}
