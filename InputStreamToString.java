import java.io.*;

public class InputStreamToString {
    public static void main(String[] args) throws Exception {

        String text = "Hello Java";

        InputStream inputStream = new ByteArrayInputStream(text.getBytes());

        byte[] bytes = inputStream.readAllBytes();

        String result = new String(bytes);

        System.out.println(result);
    }
}
