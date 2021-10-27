import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class Main {

  public static void main(String[] args) {
    PersonServiceImpl personService = new PersonServiceImpl();
    System.out.println(personService.createPerson().toString());
    personService.makePersonMoan();
    try {
      Path newPath = Paths.get("src/main/resources/File.json");
//      Files.createFile(newPath);
      String json = "\"{\\n\" +\n" +
        "                   \"    \\\"glossary\\\": {\\n\" +\n" +
        "                    \"        \\\"title\\\": \\\"example glossary\\\",\\n\" +\n" +
        "                    \"\\t\\t\\\"GlossDiv\\\": {\\n\" +\n" +
        "                    \"            \\\"title\\\": \\\"S\\\",\\n\" +\n" +
        "                    \"\\t\\t\\t\\\"GlossList\\\": {\\n\" +\n" +
        "                    \"                \\\"GlossEntry\\\": {\\n\" +\n" +
        "                    \"                    \\\"ID\\\": \\\"SGML\\\",\\n\" +\n" +
        "                    \"\\t\\t\\t\\t\\t\\\"SortAs\\\": \\\"SGML\\\",\\n\" +\n" +
        "                    \"\\t\\t\\t\\t\\t\\\"GlossTerm\\\": \\\"Standard Generalized Markup Language\\\",\\n\" +\n" +
        "                  \"\\t\\t\\t\\t\\t\\\"Acronym\\\": \\\"SGML\\\",\\n\" +\n" +
        "                    \"\\t\\t\\t\\t\\t\\\"Abbrev\\\": \\\"ISO 8879:1986\\\",\\n\" +\n" +
        "                    \"\\t\\t\\t\\t\\t\\\"GlossDef\\\": {\\n\" +\n" +
        "                    \"                        \\\"para\\\": \\\"A meta-markup language, used to create markup languages such as DocBook.\\\",\\n\" +\n" +
        "                    \"\\t\\t\\t\\t\\t\\t\\\"GlossSeeAlso\\\": [\\\"GML\\\", \\\"XML\\\"]\\n\" +\n" +
        "                    \"                    },\\n\" +\n" +
        "                    \"\\t\\t\\t\\t\\t\\\"GlossSee\\\": \\\"markup\\\"\\n\" +\n" +
        "                    \"                }\\n\" +\n" +
        "                    \"            }\\n\" +\n" +
        "                    \"        }\\n\" +\n" +
        "                    \"    }\\n\" +\n" +
        "                    \"}\";";

      Files.write(newPath, json.getBytes());
      Path newPath1 = Paths.get("src/main/resources/File.txt");
      List<String> line = Files.readAllLines(newPath);
      String json1 = Arrays.toString(line.toArray());
      Files.write(newPath1, json1.getBytes());

    }
    catch (IOException ex){
      ex.printStackTrace();
    }

  }
}
