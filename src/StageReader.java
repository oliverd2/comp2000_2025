import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class StageReader {
  public static Stage readStage(String path) throws IOException {
    Stage stage = new Stage();
    List<String> lines;
    try {
      lines = Files.readAllLines(Paths.get(path));
    } catch (IOException e) {
      throw new IOException("Failed to read stage file: " + e.getMessage());
    } 

    for (String line : lines) {
      String[] parts = line.split("=");
      int l = (int)parts[0].charAt(0) - (int)'A';
      int r = Integer.parseInt(parts[0].substring(1));
      Cell cell = new Cell(parts[0].charAt(0), r, l * 35 + 10, r * 35 + 10);
      if(parts[1].toLowerCase().equals("cat")) {
        stage.actors.add(new Cat(cell));
        continue;
      } else if(parts[1].toLowerCase().equals("dog")) {
        stage.actors.add(new Dog(cell));
        continue;
      } else if(parts[1].toLowerCase().equals("bird")) {
        stage.actors.add(new Bird(cell));
        continue;
      } else {
        throw new IOException("Unknown actor type: " + parts[1]);
      }
    }

    return stage;
  }
}