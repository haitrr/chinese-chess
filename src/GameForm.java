import javax.swing.*;
import java.awt.*;
/**
 * Created by vroyibg on 8/2/16.
 */
public class GameForm extends JFrame{
    ChessBoard chessBoard;
    public GameForm() {
        super("Chinese Chess");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setSize(800, 600);
        setLocationRelativeTo(null);
        setResizable(false);
        chessBoard = new ChessBoard(500, 550, 50,25, 25);
        add(chessBoard);
        setVisible(true);
    }
}
