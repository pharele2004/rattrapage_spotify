package Factory;

import BDD.Convert_Album;
import javafx.util.Callback;
import sample.Controller;

public class ControllerFactory implements Callback<Class<?>, Object> {

    private final Convert_Album convertAlbum;

    public ControllerFactory(Convert_Album convertAlbum) {
        this.convertAlbum = convertAlbum;
    }

    @Override
    public Object call(Class<?> type) {
        if (type == Controller.class) {
            return new Controller(convertAlbum);
        }
        try {
            return type.getDeclaredConstructor().newInstance();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
