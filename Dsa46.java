import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;

public class Dsa46 {
    public static void main(String[] args) {
        Map<String, Integer> wordFrequency = new HashMap<>();
        String filePath = "words.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] words = line.split(" ");
                for (String word : words) {
                    wordFrequency.put(word.trim(), wordFrequency.getOrDefault(word.trim(), 0) + 1);
                }
            }
            wordFrequency.forEach((key, value) -> System.out.println(key + " " + value));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
