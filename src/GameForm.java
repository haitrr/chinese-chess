import javax.swing.*;

public class GameForm extends JFrame{
    private ChessBoard chessBoard;
    public GameForm() {
        super("Chinese Chess");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setSize(800, 600);
        setLocationRelativeTo(null);
        setResizable(false);
        chessBoard = new ChessBoard(500, 550, 50,25, 25);
        add(chessBoard);
    }
}
