import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class Kadai2 {

        public static void main(String[] args) {
            try (BufferedReader br = new BufferedReader(new FileReader("./src/BookInfo.csv", Charset.forName("MS932")))) {
                String line;
                while ((line = br.readLine()) != null) {
                    String str = line;
                    String[] elements = str.split(",");
                    for(String element : elements){
                        System.out.print("["+ element + "]");
                    }
                }
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
}



