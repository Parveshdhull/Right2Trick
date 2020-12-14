package Classes;

import java.awt.Font;
import java.io.File;
import java.util.HashMap;
import javax.swing.JComponent;

public class FontChanger {

    HashMap<String, Font> fonts = new HashMap<>();

    public FontChanger() {
    }

    public void addFont(String key, String name) {
        try {
            File fontFile = new File("src/main/res/fonts/" + name);
            Font font = Font.createFont(Font.TRUETYPE_FONT, fontFile);
            fonts.put(key, font);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
    
    public void setFont(JComponent object, String key, float size){
    Font font = fonts.get(key).deriveFont(size);
    object.setFont(font);
    }

}
