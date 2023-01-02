import java.io.BufferedReader;
import java.io.Console;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;


public class java {

    public static void main(String[] args) throws Exception {
        givenPythonScript_whenPythonProcessInvoked_thenSuccess();
    }
 
    @Test
    public static void givenPythonScript_whenPythonProcessInvoked_thenSuccess() throws Exception {
        ProcessBuilder processBuilder = new ProcessBuilder("python", "python.py", "joãozinho", "17");
        processBuilder.redirectErrorStream(true);

        Process process = processBuilder.start();
        System.out.println("iniciando processo");
        BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
        String line = null;
        try {
          while ((line = reader.readLine()) != null) {
            System.out.println(line);
            /*
            try {
                new JSONObject(json);
            } catch (JSONException e) {
                System.out.println("Json invalido");
            }
             */
          }
        } catch (IOException e) {
          e.printStackTrace();
        }
    }

 }