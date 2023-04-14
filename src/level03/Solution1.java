package level03;

import java.io.*;

public class Solution1 {
    public static void main(String[] args) {
        BufferedReader reader = null;
        BufferedWriter writer = null;
        try {
            reader = new BufferedReader(new InputStreamReader(System.in));
            String destinationFileName = reader.readLine();
            writer = new BufferedWriter(new FileWriter(destinationFileName));
            StringBuilder builder = new StringBuilder();

            String s = "";
            while (!s.equals("exit")) {
                s = reader.readLine();
                builder.append(s).append("\n");
            }
            writer.write(builder.toString());
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                reader.close();
                writer.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }


}
