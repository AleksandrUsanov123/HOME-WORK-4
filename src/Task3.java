import java.util.Scanner;

public class Task3 {

    System.out.println("Задание №3");
    Scanner scanner = new Scanner(System.in);
        System.out.print("Введите предложение: ");
    String predlozheniye = scanner.nextLine();

    String[] slova = predlozheniye.split(" ");
    int obshchayadlina = 0;

        for (String word : slova) {
        obshchayadlina += word.length();
    }

    double Srednyayadlina = (double) obshchayadlina / slova.length;

        System.out.println("Средняя длина слова: " + Srednyayadlina);


}
