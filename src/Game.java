import javax.swing.*;
import java.io.IOException;

/**
 * Created by vroyibg on 8/2/16.
 */
public class Game {
    public static void main(String[] args){
        try{
            Constants.init();
        }
        catch (IOException e){
            JOptionPane.showMessageDialog(null, "Some files were missing.", "Error", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        GameForm gameForm=new GameForm();
    }
}
