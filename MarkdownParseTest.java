/* Compile: javac -cp ".;lib\junit-4.13.2.jar;lib\hamcrest-core-1.3.jar" MarkdownParseTest.java
 *
 * Run: java -cp ".;lib/junit-4.13.2.jar;lib/hamcrest-core-1.3.jar" org.junit.runner.JUnitCore MarkdownParseTest
 */

import static org.junit.Assert.*;
import org.junit.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;

public class MarkdownParseTest extends MarkdownParse{
    @Test
    public void addition() {
        assertEquals(2, 1 + 1);
    }

    @Test
    public void test1() throws IOException{
        Path fileName = Path.of("test-file1.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = getLinks(content);
        ArrayList<String> expected = new ArrayList<String>();
        expected.add("https://something.com");
        expected.add("some-thing.html");
        assertEquals(expected, links);
    }

    @Test
    public void test2() throws IOException{
        Path fileName = Path.of("test-file2.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = getLinks(content);
        ArrayList<String> expected = new ArrayList<String>();
        expected.add("https://something.com");
        expected.add("some-thing.html");
        assertEquals(expected, links);
    }

    @Test
    public void test3() throws IOException{
        Path fileName = Path.of("test-file3.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = getLinks(content);
        ArrayList<String> expected = new ArrayList<String>();
        expected.add("https://something.com");
        expected.add("https://slither.io");
        expected.add("https://some-thing.html");
        assertEquals(expected, links);
    }

    @Test
    public void test4() throws IOException{
        Path fileName = Path.of("test-file4.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = getLinks(content);
        ArrayList<String> expected = new ArrayList<String>();
        expected.add("https://something.com");
        assertEquals(expected, links);
    }

    @Test
    public void test5() throws IOException{
        Path fileName = Path.of("test-file5.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = getLinks(content);
        ArrayList<String> expected = new ArrayList<String>();
        expected.add("https://something.com");
        expected.add("some-page.html");
        assertEquals(expected, links);
    }

    @Test
    public void test6() throws IOException{
        Path fileName = Path.of("test-file6.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = getLinks(content);
        ArrayList<String> expected = new ArrayList<String>();
        assertEquals(expected, links);
    }

    @Test
    public void test7() throws IOException{
        Path fileName = Path.of("test-file7.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = getLinks(content);
        ArrayList<String> expected = new ArrayList<String>();
        assertEquals(expected, links);
    }
}