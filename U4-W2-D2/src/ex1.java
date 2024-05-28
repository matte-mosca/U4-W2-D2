import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ex1 {
    public static void run(){
        Scanner scanner = new Scanner(System.in);
        int wordsN = 0;
        while (true) {
            System.out.println("Insert number");
            if (scanner.hasNextInt()){
                wordsN = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Hai inserito "+wordsN);
            } else {
                System.out.println("Numero non valido");
                scanner.next();
            }
            Set <String> words = new HashSet<String>();
            ArrayList<String> doubles = new ArrayList<String>();

            for (int i = 0; i < wordsN ; i++) {
                System.out.println("Insert Word");
                String word = scanner.nextLine();
                if (!words.add(word)){
                    doubles.add(word);
                }
            }
            System.out.println("You wrote "+words.size()+ " unique words: "+words);
            System.out.println("you wrote "+doubles.size() +"duplicates: "+doubles);
        }
    }
}
