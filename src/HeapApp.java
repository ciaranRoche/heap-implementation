import java.util.Scanner;

/**
 * Created by ciaran on 06/02/2017.
 */
public class HeapApp {

    public static void main(String[] args) {
        Heap<Integer> hp = new Heap<Integer>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter next int, 'done' to stop: ");
        String line = sc.next();
        while (!line.equals("done")) {
            hp.add(Integer.parseInt(line));
            System.out.println(hp);
            System.out.print("Enter next int, 'done' to stop: ");
            line = sc.next();
        }

        while (!hp.isEmpty()) {
            int max = hp.delete();
            System.out.println(max + " " + hp);
        }
    }

}

