package chapter5.ReflectionTest;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Scanner;

/**
 * Created by SBT-Ishkov-VYu on 25.05.2017.
 */
public class ReflectionTest {
    public static void main(String[] args) {
        // Получаем имя анализируемого класса
        String className;
        if (args.length > 0) {
            className = args[0];
        } else {
            Scanner in = new Scanner(System.in);
            System.out.println("Введите название класса с указанием пакета ( например: java.util.Date): ");
            className = in.next();
        }

        try {
            // вывод именеи класса
            Class cl = Class.forName(className);
            Class superCl = cl.getSuperclass();

            String modifiers = Modifier.toString(cl.getModifiers());
            if (modifiers.length() > 0) {
                System.out.print(modifiers + " ");
            }
            System.out.print("class " + className);
            if (superCl != null && superCl != Object.class) {
                System.out.print(" extends " + superCl.getName());
            }

            System.out.print("\n{\n");
            printConstructors(cl);
            System.out.println();
            printMethod(cl);
            System.out.println();
            printFields(cl);
            System.out.println("}");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void printConstructors(Class cl) {
        Constructor[] constructors = cl.getDeclaredConstructors();

        for (Constructor constructor : constructors) {
            String name = constructor.getName();
            System.out.print(" ");
            String modifiers = Modifier.toString(constructor.getModifiers());
            if (modifiers.length() > 0) {
                System.out.print(modifiers + " ");
            }
            System.out.print(name + "(");

            // вывести типы параметров
            Class[] paramTypes = constructor.getParameterTypes();
            for (int i = 0; i < paramTypes.length; i++) {
                if (i > 0) System.out.print(", ");
                System.out.print(paramTypes[i].getName());
            }
            System.out.println(");");
        }
    }

    public static void printMethod(Class cl) {
        Method[] methods = cl.getMethods();

        for (Method method : methods) {
            Class returnType = method.getReturnType();
            String name = method.getName();

            System.out.print(" ");
            // вывести модификаторы, возвращаемый тип и имя метода
            String modifiers = Modifier.toString(method.getModifiers());
            if (modifiers.length() > 0) {
                System.out.print(modifiers + " ");
            }
            System.out.print(returnType.getName() + " " + name + "(");

            // вывести типы параметров
            Class[] paramTypes = method.getParameterTypes();
            for (int i = 0; i < paramTypes.length; i++) {
                if (i > 0) System.out.print(", ");
                System.out.print(paramTypes[i].getName());
            }
            System.out.println(");");
        }
    }

    public static void printFields(Class cl) {
        Field[] fields = cl.getDeclaredFields();

        for (Field f : fields) {
            Class type = f.getType();
            String name = f.getName();
            System.out.print(" ");
            String modifiers = Modifier.toString(f.getModifiers());
            if (modifiers.length() > 0) {
                System.out.print(modifiers + " ");
            }
            System.out.println(type.getName() + " " + name + ";");
        }
    }
}
