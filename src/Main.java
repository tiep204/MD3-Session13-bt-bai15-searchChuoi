import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào một chuỗi: ");
        String input = scanner.nextLine();
        scanner.close();

        String[] words = input.split("\\s+"); // Tách chuỗi thành các từ
        String maxLengthSubstring = "";

        for (String word : words) {
            char[] charArray = word.toCharArray();
            Arrays.sort(charArray);
            String sortedWord = new String(charArray);

            if (sortedWord.length() > maxLengthSubstring.length()) {
                maxLengthSubstring = sortedWord;
            }
        }

        System.out.println("Chuỗi con có độ dài lớn nhất và được sắp xếp tăng dần: " + maxLengthSubstring);
    }
}
