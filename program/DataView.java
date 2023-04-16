package homeWork3.program;

import java.util.Scanner;

public class DataView implements View {

    private Scanner in = new Scanner(System.in, "Cp866");

    @Override
    public void printOutputData(String message) {
        System.out.printf("%s \n", message);
    }

    @Override
    public String getInputData(String message) {
        System.out.printf("%s \n", message);
        return in.nextLine();
    }
}
