package BDD;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.*;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;




public class Convert_Album {

    private List<Album> albums;
    private Gson gson;
    private String filename;

    public Convert_Album(String filename) {
        this.filename=filename;
        this.gson = new Gson();
        this.albums = loadAlbums();
    }

    public List<Album> loadAlbums() {
        try (Reader reader = new FileReader(filename)) {
            Type listType = new TypeToken<ArrayList<Album>>() {}.getType();
            return gson.fromJson(reader, listType);
        } catch (FileNotFoundException e) {
            return new ArrayList<>();
        } catch (IOException e) {
            e.printStackTrace();
            return new ArrayList<>();
        }
    }

    public void saveAlbums() {
        try (Writer writer = new FileWriter(filename)) {
            gson.toJson(albums, writer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
