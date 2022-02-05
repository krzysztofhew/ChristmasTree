
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Enter the lenght of the base");
        char asterysk = '*';
        int baseLenght = getInt();
        int firstLevel = baseLenght % 2 == 0 ? 2 : 1;
        {
            for (int numberOfAsterysk = firstLevel; numberOfAsterysk <= baseLenght; numberOfAsterysk += 2) {
                int emptyField = (baseLenght - numberOfAsterysk) / 2;
                for (int i = 0; i < emptyField + numberOfAsterysk; i++) {
                    System.out.print(i < emptyField ? " " : asterysk);
                }
                System.out.println();
            }
        }

    }

    public static int getInt() {
        return new Scanner(System.in).nextInt();

    }

}