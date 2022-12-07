import java.util.Arrays;
import java.util.Scanner;

/*
1) Создать массивы типа: int, double и создать методы, для их вывода на консоль
2) Сделать программу, которая будет складывать или вычитать введенные числа многократно,
пока не будет дана команда на выход из цикла
3*) Сделать процедуру для вывода из массива чисел со значением кратным 3. Найти в другой функции их среднее
арифметическое значение

 */

public class Main {
    public static void main(String[] args) throws Exception {
         int[] arr_i = new int [10];
         double[] arr_d = new double [10];

        int[] arrG = {10, 20, 30, 40, 50, 60, 70, 80, 90, 120, 150,};
        double[] arrC = {10.1, 20.1, 30.1, 40.1, 50.1, 60.1, 70.1, 80.1};
        String input = "Hi World and Hi Everyone";
        System.out.println(input);

        // 1
        render_i(arrG);
        render_d(arrC);

        // 2
        calc();

        // 3
        arrTask(arr_i);


    }

    // Задача 1
    public static void render_i(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

    public static void render_d(double[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

    // Задача 2
    public static void calc() {
        int x = 0;
        for (; ; ) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("enter num");
            String dig = scanner.nextLine();

            if (dig.charAt(0) == 'e') {
                break;
            }
            x += Integer.parseInt(dig);
            System.out.println("common - '" + x + "'  (to exit press \"e\")");

        }
    }



    // Задача 3
    public static void arrTask (int[] argum) {
        int[] arr = new int[13];
        for (int i = 0; i < argum.length; i++) {
            if (argum[i] % 3 == 0 && argum[i] != 0) {
                arr[i] += argum[i];
                System.out.println(arr[i]);
            }
        }
        render(Arrays.toString(arr));
    }

    public static void render(String str) {
        String[] strArray = null;
        for (int i = 0; i < str.length(); i++) {

            str = str.replace("0,", "");
            str = str.replace("0", "");
            str = str.replace(" ", "");
            str = str.replace("[", "");
            str = str.replace("]", "");
            strArray = str.split(",");
        }
        double render = 0;
        for (int i = 0; i < strArray.length; i++) {
            render += Integer.parseInt(strArray[i]);
        }
        render = render / strArray.length;
        System.out.println(render);

    }
}