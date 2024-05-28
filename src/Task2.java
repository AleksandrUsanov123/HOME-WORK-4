import java.util.Scanner;

public class Task2 {

    Scanner sc = new Scanner(System.in);
// Ввод числа n
System.out.print("Введите число n: ");
    int n = sc.nextInt();


    // Создание строки с целыми числами
    StringBuilder numbers = new StringBuilder();
    int i = 1;
while (numbers.length() < 1000) {
        numbers.append(i);
        i++;
    }

// Вывод цифры на позиции n
if (n >= 1 && n <= numbers.length()) {
        char digit = numbers.charAt(n - 1);
        System.out.println("Цифра на позиции " + n + ": " + digit);
    } else {
        System.out.println("Некорректная позиция.");
    }


}
