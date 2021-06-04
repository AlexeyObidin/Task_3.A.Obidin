import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner name = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        int a = 1;
        int b = name.nextInt();

        for (int i = a; i < b; i++) {
            if (i % 3 == 0){
                list.add(i);
            }
        }
        System.out.println("Числа кратные 3: " + list);

    }
}