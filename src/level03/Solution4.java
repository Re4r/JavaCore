package level03;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Solution4 {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String path = reader.readLine();
        Scanner scanner = new Scanner(new FileInputStream(path));

        List<Integer> list = new ArrayList<Integer>();
        while (scanner.hasNext()) {
            int value = scanner.nextInt();
            if (value % 2 == 0) {
                list.add(value);
            }
        }

        Collections.sort(list);
        for (var item : list) {
            System.out.println(item);
        }

        reader.close();
        scanner.close();
    }
}
