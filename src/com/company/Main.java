package com.company;

public class Main {

    public static void main(String[] args) {

        // создание перенной типа int (числа)
        int num = 10;
             num = 30;
        System.out.println(num);

        // создание перенной типа данных doble (дробные)
        double doublenum = 5.10;
        System.out.println(doublenum);

        // создание переменных данных String (строки)
        String word = "Hello";
        System.out.println(word);

        // создание константы (неизменная переменная)
        final String con = "constant value";
        System.out.println(con);


        // условное выражение if-else
        if( num > 30){
            System.out.println("значение больше 30");
        } else if (num == 30){
            System.out.println("значение равно 30");
        }
        else
            System.out.println("значение меньше 30");
    }
}
