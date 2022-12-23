import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1() {
        System.out.println("Задача 1!");
        int[] box = new int[3];
        box[0] = 1;
        box[1] = 2;
        box[2] = 3;
        System.out.println(box[2]);
        double[] cat = {1.57, 7.654, 9.986};
        for (int i = 0; i < cat.length; i++) {
            System.out.println(cat[i]);
            int[] dog = {2, 6, 8};
            System.out.println(dog[2]);
        }
    }

    public static void task2() {
        System.out.println("Задача 2!");
        int[] a = {1, 2, 3};
        double[] b = {1.57, 7.654, 9.986};
        int[] c = {1, 2, 4, 5};
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
            if (i != a.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("");
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i]);
            if (i != b.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("");
        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i]);
            if (i != c.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("");
    }

    public static void task3() {
        System.out.println("Задача 3");
        int[] a = {1, 2, 3};
        double[] b = {1.57, 7.654, 9.986};
        int[] c = {1, 2, 4, 5};

        for (int i = a.length - 1; i >= 0; i--) {
            System.out.print(a[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = b.length - 1; i >= 0; i--) {
            System.out.print(b[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = c.length - 1; i >= 0; i--) {
            System.out.print(c[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    public static void task4() {
        System.out.println("Задача 4!");
        int[] a = {1,2,3};
        for (int i = 0; i <a.length ; i++) {
            if (a[i]%2 !=0){
                a[i]+= 1;
            }
            System.out.println(a[i]);
        }
        System.out.println(Arrays.toString(a));
    }

}





















            



