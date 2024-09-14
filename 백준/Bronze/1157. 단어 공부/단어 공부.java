import java.util.HashMap;
import java.util.Locale;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();

        HashMap<String, Integer> hashMap = new HashMap<>();

        String[] str = input.split("");
        String answer = "";
        int max = 0;
        for (int i = 0; i < str.length; i++) {
            String string = str[i].toUpperCase(Locale.ROOT);
            hashMap.put(string, hashMap.getOrDefault(string, 0) + 1);
            if (hashMap.get(string) > max) {
                max = hashMap.get(string);
            }
        }

        int maxCount = 0;

        for (String key : hashMap.keySet()) {
            if (hashMap.get(key) == max) {
                maxCount++;
                answer = key;
            }
        }

        if (maxCount > 1) {
            answer = "?";
        }

        System.out.println(answer);
    }
}
