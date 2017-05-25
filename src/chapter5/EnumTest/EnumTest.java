package chapter5.EnumTest;

import java.util.Scanner;

/**
 * Created by SBT-Ishkov-VYu on 25.05.2017.
 */
public class EnumTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a size: (SMALL, MEDIUM, LARGE, EXTRA_LAGRE) ");

        String inputValue = input.next().toUpperCase();
        Size size = Enum.valueOf(Size.class, inputValue);

        System.out.println("size=" + size);
        System.out.println("abbreviation=" + size.getAbbreviation());

        if (size == Size.EXTRA_LARGE) {
            System.out.println("Good job--you paid attention to the _.");
        }
    }
}
