import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import pizza.Order;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("=== Продажа пиццы ===");
    List<Order> orders = new ArrayList<>(); // завершённые заказы
    Order current = new Order(); // текущий заказ
    String command;
    do {
      System.out.println("Команды:");
      System.out.println("1. Добавить пиццу");
      System.out.println("2. Начать новый заказ");
      System.out.println("0. Выход");
      System.out.print("Выберите команду: ");
      command = scanner.nextLine();
      switch (command) {
        case "1" -> current.addPizza(scanner);
        case "2", "0" -> {
          if (!current.isEmpty()) {
            orders.add(current);
            current = new Order();
          }
        }
        default -> System.out.println("Некорректная команда: " + command);
      }
    } while (!command.equals("0"));
    System.out.println("=== Завершённые заказы ===");
    double total = 0.0;
    for (Order order : orders) {
      System.out.println(order);
      total += order.getTotal();
    }
    System.out.printf("Общий итог: %.2f EUR%n", total);
  }
}
