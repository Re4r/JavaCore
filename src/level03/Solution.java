package level03;

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {

        try {
            String sourceFileName;
            try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
                sourceFileName = reader.readLine();
            }
            FileInputStream fileInputStream = new FileInputStream(sourceFileName);
            StringBuilder stringBuilder;
            try (Scanner scanner = new Scanner(fileInputStream)) {
                stringBuilder = new StringBuilder();
                while (scanner.hasNextLine()) {
                    stringBuilder.append(scanner.nextLine()).append("\n");
                }
            }

            System.out.println(stringBuilder.toString());

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
