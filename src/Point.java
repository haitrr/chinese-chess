import java.awt.*;

public class Point {
    private int x;

    public int getX() {
        return x;
    }

    private int y;

    public int getY() {
        return y;
    }

    private Piece piece;

    public void setPiece(Piece piece) {
        this.piece = piece;
    }

    public Point(int x, int y, Piece piece){
        this.piece=piece;
        this.x=x;
        this.y=y;
    }
    public void drawPiece(Graphics graphics,int size){
        if(piece!=null) {
            piece.draw(graphics, x, y, size);
        }
    }

}
