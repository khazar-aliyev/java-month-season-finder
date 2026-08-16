import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("In which month you are? ");
        String month = scanner.nextLine().toLowerCase();
        switch (month) {
            case "january", "february", "december" -> System.out.println("It is winter");
            case "march", "april", "may" -> System.out.println("It is spring");
            case "june", "july", "august" -> System.out.println("It is summer");
            case "september", "october", "november" -> System.out.println("It is autumn");
            default -> System.out.println(month + " is not a month");


        }

    }
}
