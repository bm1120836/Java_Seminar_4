import java.util.Scanner;

/*
 * Определить является ли список знакочередующимся? (без массивов)
 */


public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        task2(scanner);
        scanner.close();
    }

    static void task2(Scanner scanner) {
        boolean flag = true;
        System.out.println("Введите длину последовательности:");
        int n = scanner.nextInt();
        System.out.println("Введите последовательность: ");
        int num1 = scanner.nextInt();

        for (int i = 1; i < n; i++) {
            int num2 = scanner.nextInt();
            if (!correctness(num1, num2)) {
                flag = false;
            }
            num1 = num2;
        }
        if(flag) {
            System.out.println("Список является знакочередующимся!");
        } else {
            System.out.println("Список не является знакочередующимся!");
        }
    }

    static boolean correctness(int a, int b) {
        if (a < 0 && b >= 0 || a >= 0 && b < 0) {
            return true;
        } else {
            return false;
        }
    }
}
    
