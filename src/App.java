
import java.util.Objects;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        double height, weight;
        boolean exit = false;
        Scanner sc = new Scanner(System.in);

        while (!exit) {
            height = -1;
            weight = -1;
            while (height < 0) {
                System.out.print("| Please enter your height (m) : ");
                height = sc.nextDouble();
            }

            while (weight < 0) {
                System.out.print("| Please enter your weight (kg) : ");
                weight = sc.nextDouble();
            }

            System.out.println("| Your Body Mass Index : " + (weight / height * height));

            System.out.print("| Exit (Y/N) : ");
            exit = Objects.equals(sc.next(), "Y");
        }
        sc.close();
    }
}
