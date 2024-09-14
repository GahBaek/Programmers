import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Locale;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine().trim();

        HashMap<String, Integer> hashMap = new HashMap<>();
        String[] str = input.split("");
        String answer = "";
        int max = 0;
        boolean isDuplicateMax = false;

        for (int i = 0; i < str.length; i++) {
            String string = str[i].toUpperCase(Locale.ROOT);
            hashMap.put(string, hashMap.getOrDefault(string, 0) + 1);
            int count = hashMap.get(string);

            if (count > max) {
                max = count;
                answer = string;
                isDuplicateMax = false;
            } else if (count == max) {
                isDuplicateMax = true;
            }
        }

        if (isDuplicateMax) {
            answer = "?";
        }

        System.out.println(answer);
    }
}
