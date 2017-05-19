package chapter4.ParamTest;

/**
 * Created by SBT-Ishkov-VYu on 19.05.2017.
 */
public class ParamTest {
    public static void main(String[] args) {

        /*
         * Тест 1:  методы не могут изменить числовые параметры
         */
        System.out.println("Testing tripleValue");
        double percent = 10;
        System.out.println("Before: percent=" + percent);
        tripleValue(percent);
        System.out.println("After: percent=" + percent);

        /*
         * Test 2: методы могут изменять состояние объектов,
         * передаваемых в качестве параметров
         */
    }

    public static void tripleValue(double x) {
        x = 3 * x;
        System.out.println("End of method: x=" + x);
    }
}