import java.util.Scanner;

public class Control_problems {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("This Admin and Guest mode program :) ");

        String inputArguments = String.join(",", args);
        String adminFlag = "--admin";
        String guestFlag = "--quest";

        if (inputArguments.contains(adminFlag) && inputArguments.contains(guestFlag)) {
            System.out.println("Please, select either 'ADMIN' or " + "'Guest' mode for this program ");
        } else if (inputArguments.contains(adminFlag)) {
            System.out.println("Hello, Admin!");
        } else if (inputArguments.contains(guestFlag)) {
            System.out.println("Hello, Guest!");
        }

        // Simple Number Calculator

        System.out.println("Simple Number Calculator");
        if (args[0].contains(".") || args[1].contains(".")) {
            double paramDouble1 = Double.parseDouble(args[0]);
            double paramDouble2 = Double.parseDouble(args[1]);
            System.out.println(paramDouble1 + paramDouble2);
        } else {
            int paramInt1 = Integer.parseInt(args[0]);
            int paramInt2 = Integer.parseInt(args[1]);
            System.out.println(paramInt1 + paramInt2);
        }

    }
}
