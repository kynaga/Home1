
public class Main {
    public static void main(String[] args) {
        //1. Выведите ваше имя в консоль
        System.out.println("Любовь");
        //2. Выведите любимое стихотворение в консоль
        System.out.println("Пой же, пой. На проклятой гитаре\n" +
                "Пальцы пляшут твои вполукруг.\n" +
                "Захлебнуться бы в этом угаре,\n" +
                "Мой последний, единственный друг.");
        //4. Вывести значение 2 + 2 * 2
        System.out.println(2 + 2 * 2);
        //5. Вывести значение (2+2)*2
        System.out.println((2+2)*2);
        //6. Вывести значение деления 100 на пи
        System.out.println(100/3.14);
        //7. Вывести значение 12345 в третьей степени
        int q = 12345;
        System.out.println(q*q*q);
        //8. Вывести квадратный корень от двух в 10 степени
        double w = Math.pow(2, 10);
        System.out.println(Math.sqrt(w));
        //9. Вывести корень из двух, возведенный в 10 степень
        double e = Math.sqrt(2);
        System.out.println(Math.pow(e, 10));
        //10. Что будет, если в джаве поделить на ноль? Проверить
        //System.out.println(10/0); - ошибка
        //11. Попробуйте сложить две строки в Java. Выведите результат.
        System.out.println("Складываю " + "строки");
        //12. Попробуйте вычесть, разделить две строки.
        //System.out.println("Складываю " - "строки"); - ошибка
        //13. Попробуйте сложить строку с числом пи. Что получилось?
        System.out.println("Так и живём " + 3.14);
        //14. Полезное упражнение: напишите программу, которая считает корень линейного уравнения ax+b=0
        int a = 4;
        int b = 8;
        double x = 0;
        x = -b/a;
        System.out.println(x);
        //15 и 16 задание
        int a1 = 10;
        int b1 = 2;
        int c1 = 12;
        int d1 = 24;
        int a2 = a1*c1;
        int b2 = b1*c1 + a1*d1;
        int c2 = d1*b1;
        double x1, x2 = 0;
        int D = b2*b2 - 4*a2*c2;

        x1 = (-b2+Math.sqrt(D)) / (2*a2);
        x1 = (-b2-Math.sqrt(D)) / (2*a2);

        System.out.println("Дискриминант = " + D);
        System.out.println("x1 = " + x1);
        System.out.println("x2 = " + x2);


    }
}