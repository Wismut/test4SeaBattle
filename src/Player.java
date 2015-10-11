import java.util.Scanner;


public class Player {
    int getShootVertical() {
        System.out.println("Введите номер ряда");
        Scanner scanner = new Scanner(System.in);
        String s;
        s = scanner.nextLine();
        System.out.printf("Вы ввели: %s\n", s);
        return Integer.parseInt(s);
    }

    int getShootHorizotal() {
        System.out.println("Введите номер столбца");
        Scanner scanner = new Scanner(System.in);
        String s;
        s = scanner.nextLine();
        System.out.printf("Вы ввели: %s\n", s);
        return Integer.parseInt(s);
    }
}
