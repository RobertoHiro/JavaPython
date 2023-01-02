import java.io.File;
import java.io.InputStream;
import java.util.List;

public class java {
 
    @Test
    public void givenPythonScript_whenPythonProcessInvoked_thenSuccess() throws Exception {
        ProcessBuilder processBuilder = new ProcessBuilder("python", resolvePythonScriptPath("python.py"));
        processBuilder.redirectErrorStream(true);

        Process process = processBuilder.start();
        List<String> results = readProcessOutput(process.getInputStream());

        assertThat("Results should not be empty", results, is(not(empty())));
        assertThat("Results should contain output of script: ", results, hasItem(
        containsString("Hello Baeldung Readers!!")));

        int exitCode = process.waitFor();
        assertEquals("No errors should be detected", 0, exitCode);
    }

    private String resolvePythonScriptPath(String path){
        File file = new File(path);
        return file.getAbsolutePath();
     }

 }