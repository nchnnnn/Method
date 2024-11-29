import java.util.Scanner;

public class Method {

    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the number of eggs: ");

    int eggs = input.nextInt();
    System.out.println("Number of dozen: " + determineDozen(eggs));
    System.out.println("Eggs less than a dozen: " + showLessDozen((eggs)));
    }

    static int showLessDozen(int x){
        int remainderEgg = x % 12;
        return remainderEgg;
    };

    static int determineDozen(int y){
        int dozen = y / 12;
        return dozen;
    }
}