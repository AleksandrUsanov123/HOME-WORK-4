import java.util.Scanner;

public class Task1 {

    Scanner scanner = new Scanner(System.in);

// Ввод строки текста
System.out.print("Введите строку текста: ");
    String text = scanner.nextLine();

// Ввод символа
System.out.print("Введите символ: ");
    char symbol = scanner.next().charAt(0);

    // Поиск вхождений символа в строку
    int count = 0;
System.out.print("Индексы вхождений символа: ");
for (int i = 0; i < text.length(); i++) {
        if (text.charAt(i) == symbol) {
            System.out.print(i + " ");
            count++;
        }
    }

// Вывод результата
if (count > 0) {
        System.out.println("\nКоличество совпадений: " + count);
    } else {
        System.out.println("\nСовпадений не найдено.");
    }


}
