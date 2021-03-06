import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Fileservice {

    private static final Gson GSON = new GsonBuilder().setPrettyPrinting().create();
    private static final Path PATH = Paths.get("./movies.json");

    public static Film readFile() {
        String json = " ";
        try {
            json = Files.readString(PATH);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return GSON.fromJson(json, Film.class);
    }


}




  