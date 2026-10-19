package solid.responsible.example1.compliance;

import java.util.Scanner;
public class InputProcessor {
    public Pair processInput() {
        //inputs from user                             --------first responsibility
        String firstLine;
        String secondLine;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number ");
        firstLine = sc.nextLine();
        System.out.print("\nEnter 2st number ");
        secondLine = sc.nextLine();
        return new Pair(firstLine,secondLine);
    }
}
