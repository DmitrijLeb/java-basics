package lv.acodemy;

import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {

        // one-line comment
    /*
    This is
    multi-line comment

     */

        //Primitive data types

        // double floating numbers
        double pi = 3.14;
        System.out.println(pi);

        // float - floatinh number
        float weight = 70.34f;
        System.out.println(weight);
        // int (integer)
        int populationofLatvia = 1700000;
        System.out.println(populationofLatvia);

        // char
        char myFirstNameChar = 'D';
        System.out.println(myFirstNameChar);

        // byte
        byte age = 28;
        System.out.println(age);

        // boolean is , has
        boolean isSummer = true;
        boolean isWinter = false;
        System.out.println(isSummer);
        System.out.println(isWinter);

        // String
        String name = "Dmitry";
        String surname = "Lebedev";
        System.out.println(name + " " + surname);
        System.out.printf("My name is: " + name + " %s %s", name, surname);
        System.out.printf("%s %s", name, surname);

        System.out.println(String.format("My name is: %s. My surname is: %s", name, surname));

        // Operator
        int a = 10;
        int b = 5;
        int c = a + b;
        System.out.println(c);

        int x = 10;
        int y = 10 % 4;
        System.out.println(y);


    }
}