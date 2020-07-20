import java.sql.SQLOutput;

public class Main { //задание 1 :)))
    public static void main(String[] args) {

        //задание 2
        System.out.println("Задание 2");
        byte var1 = 120;
        System.out.println("Значение для типа данных byte равно " + var1);
        short var2 = 12000;
        System.out.println("Значение для типа данных short равно " + var2);
        int var3 = 120000;
        System.out.println("Значение для типа данных int равно " + var3);
        long var4 = 1200000000L;
        System.out.println("Значение для типа данных long равно " + var4);
        float var5 = 12.21f;
        System.out.println("Значение для типа данных float равно " + var5);
        double var6 = 123.321;
        System.out.println("Значение для типа данных double равно " + var6);
        char var7 = 'S';
        System.out.println("Значение для типа данных char равно " + var7);
        boolean var8 = false;
        System.out.println("Значение для типа данных boolean равно " + var8);

        //Задание 3
        System.out.println("Задание 3");
        float calc = calculator(3, 3, 3, 3);
        System.out.println("Результат вычисления равен " + calc);

        //Задание 4
        System.out.println("Задание 4");
        summ(6, 7);

        //Задание 5
        System.out.println("Задание 5");
        minus(-5);

        //Задание 6
        System.out.println("Задание 6");
        minus2(-5);

        //Задание 7
        System.out.println("Задание 7");
        hello("Юный кодер");

        //Задание 8
        System.out.println("Задание 8");
        year(2040);

    }
    // метод для 3 задания
    public static float calculator(float a, float b, float c, float d){
        return a * (b + (c / d));
    }

    //метод для 4 задания
    public static boolean summ(int a, int b){
        int c = a + b;
        boolean d = true;
        if (c>= 10 && c <=20){
            System.out.println(d);
            return d;
        } else {
            d = false;
            System.out.println(d);
            return d;
        }
    }

    //метод для задания 5
    public static void minus(int a){
        if (a >= 0){
            System.out.println("Число " + a + " является положительным");
        } else {
            System.out.println("Число " + a + " является отрицательным");
        }
    }

    //метод для задания 6
    public static boolean minus2(int a){
        boolean b = false;
        if (a >= 0){
            System.out.println(b);
            return b;
        } else {
            b = true;
            System.out.println(b);
            return b;
        }
    }

    //метод для задания 7
    public static void hello (String a){
        System.out.println("Привет, " + a + "!");
    }

    //метод для задания 8
    public static void year(int a){
        if (a % 4 == 0 && a % 100!=0){
            System.out.println("Год високосный");
        } else if (a % 4 == 0 && a % 400==0){
            System.out.println("Год високосный");
        } else {
            System.out.println("Год не високосный");
        }
    }


}
