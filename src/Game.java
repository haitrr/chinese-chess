import javax.swing.*;
import java.io.IOException;

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
        gameForm.setVisible(true);
    }
}
