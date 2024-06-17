public class Iteration_Statement {
    public static void main(String[] args) {

        int count = 0;
        // while (count < 5) {
        // System.out.println("Counter is " + count++);
        // }

        // infinite loop
        // while (true) {
        // System.out.println(count);
        // }

        // this example is Atm pin code incase of wrong pin code it runs again so this
        // runs at least ones

        // do {
        // System.out.println("Counter: " + count++);
        // } while (count < 4);

        // for (int i = 0; i < 5; i++) {
        // System.out.println("Counter: " + i);
        // }

        // int i = 0;
        // for(; i < 5;) {
        // System.out.println("Counter: " + i);
        // i++;
        // }

        // Infinite loop
        // for(;;) {

        // }

        // for (int i = 0, j = 10; i < j; i++, j--) {
        // System.out.println("Counter: i = " + i + ", j = " + j);
        // }

        // // for each loop
        // int[] arr = { 1, 2, 3 };
        // int sum = 0;
        // for (int number : arr) {
        // sum += number;
        // System.out.println("Number: " + number);
        // }

        // System.out.println("Sum " + sum);

        for (int i = 0; i < 5; i++) {
            System.out.println("*** i = " + i + " ***");
            for (int j = 0; j < 3; j++) {
                System.out.println(j + "\t");
            }
            System.out.println();
        }

        // Jump statments

        // for (int i = 0; i < 5; i++) {
        // if (i % 2 == 0) {
        // continue;
        // }
        // System.out.println("Counter: " + i);
        // }
        // System.out.println("****** break");
        // for (int i = 0; i < 5; i++) {
        // if (i == 3) {
        // break;
        // }
        // System.out.println("counter: " + i);
        // }

        // for (int i = 0; i < 5; i++) {
        // for (int j = 0; j < 5; j++) {
        // if (j == 3)
        // break;
        // System.out.print(j + " ");
        // }
        // System.out.println(i + " -> Counter");

        // }

        // Labels ->
        loop1: for (int i = 0; i < 5; i++) {
            System.out.println("counter j: " + i);
            loop2: for (int j = 0; j < 5; j++) {
                System.out.println("counter j: " + j);
                if (j >= 0 && j < 3) {
                    System.out.println("Continue loop2");
                    continue loop2;
                } else {
                    System.out.println("break loop1");
                    break loop1;
                }
            }
        }

    }
}
