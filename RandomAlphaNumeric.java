package task1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class RandomAlphaNumeric implements Interface {



    @Override
    public void randomAlphaNumeric(int length) {
        try {
            final String LETTERS = "abcdefghijklmnopqrstuvwxyz";

            final char[] ALPHANUMERIC = (LETTERS + LETTERS.toUpperCase() + "0123456789").toCharArray();
            int ranStringLen = 100;
            String[] ranStr = new String[length];
            FileWriter fw = new FileWriter("C:\\Users\\DELL\\IdeaProjects\\RandomStringGenerator\\src\\task1\\rsg\\file.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            for (int j = 0; j < length; j++) {
                StringBuilder result = new StringBuilder();
                for (int i = 0; i < ranStringLen; i++) {

                    result.append(ALPHANUMERIC[new Random().nextInt(ALPHANUMERIC.length)]);

                }
                ranStr[j]=result.toString();
                bw.write(ranStr[j]);
                bw.newLine();
            }
            System.out.println("file generated");
            bw.close();
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public int getNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number between 1-230");
        int x = sc.nextInt();
        while (x < 1 || x > 230) {
            System.out.println("Enter the number");
            x = sc.nextInt();
        }
        return x;
    }
}
