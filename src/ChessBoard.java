/**
 * Created by vroyibg on 8/3/16.
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class ChessBoard extends JPanel{
    private int squareSize;
    private Point[][] points;
    private Point selectingPoint;
    public ChessBoard(int width,int height,int squareSize,int x,int y) {
        super(null);
        this.setDoubleBuffered(true);
        this.setSize(width, height);
        this.setLocation(x, y);
        this.squareSize = squareSize;
        this.setBackground(Color.gray);
        points = new Point[10][9];
        setupPoints();
    }
    public void paintComponent(Graphics graphics){
        super.paintComponent(graphics);
        Graphics2D graphics2D=(Graphics2D)graphics;
        graphics2D.setRenderingHint(
                RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);
        graphics2D.setRenderingHint(
                RenderingHints.KEY_TEXT_ANTIALIASING,
                RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
        graphics2D.setRenderingHint(RenderingHints.KEY_INTERPOLATION,
                RenderingHints.VALUE_INTERPOLATION_BILINEAR);
        drawBoard(graphics2D);
        for(Point[] point:points){
            for(Point p:point) {
                p.drawPiece(graphics, squareSize*4/5);
            }
        }
    }
    MouseListener mouseListener=new MouseListener() {
        @Override
        public void mouseClicked(MouseEvent mouseEvent) {
            int x=mouseEvent.getX();
            int y=mouseEvent.getY();

            if(selectingPoint==null){

            }
            else{

            }
        }

        @Override
        public void mousePressed(MouseEvent mouseEvent) {

        }

        @Override
        public void mouseReleased(MouseEvent mouseEvent) {

        }

        @Override
        public void mouseEntered(MouseEvent mouseEvent) {

        }

        @Override
        public void mouseExited(MouseEvent mouseEvent) {

        }
    };
    public void drawBoard(Graphics graphics){
        for(int i=0;i<9;i++){
            graphics.drawLine(points[0][i].getX(),points[0][i].getY(),points[4][i].getX(),points[4][i].getY());
            graphics.drawLine(points[9][i].getX(),points[9][i].getY(),points[5][i].getX(),points[5][i].getY());
        }
        for(int i=0;i<10;i++){
            graphics.drawLine(points[i][0].getX(),points[i][0].getY(),points[i][8].getX(),points[i][8].getY());
        }
        graphics.drawLine(points[4][0].getX(),points[4][0].getY(),points[5][0].getX(),points[5][0].getY());
        graphics.drawLine(points[4][8].getX(),points[4][8].getY(),points[5][8].getX(),points[5][8].getY());
        graphics.drawLine(points[0][3].getX(),points[0][3].getY(),points[2][5].getX(),points[2][5].getY());
        graphics.drawLine(points[0][5].getX(),points[0][5].getY(),points[2][3].getX(),points[2][3].getY());
        graphics.drawLine(points[9][3].getX(),points[9][3].getY(),points[7][5].getX(),points[7][5].getY());
        graphics.drawLine(points[9][5].getX(),points[9][5].getY(),points[7][3].getX(),points[7][3].getY());
    }
    public void setupPoints(){
        for(int i=0;i<10;i++){
            for(int j=0;j<9;j++){
                points[i][j]=new Point(j*squareSize+squareSize/2,i*squareSize+squareSize/2,null);
            }
        }
        points[0][0].setPiece(new Chariot(true));
        points[0][1].setPiece(new Horse(true));
        points[2][1].setPiece(new Cannon(true));
        points[0][2].setPiece(new Elephant(true));
        points[0][3].setPiece(new Advisor(true));
        points[0][4].setPiece(new General(true));
        points[0][8].setPiece(new Chariot(true));
        points[0][7].setPiece(new Horse(true));
        points[2][7].setPiece(new Cannon(true));
        points[0][6].setPiece(new Elephant(true));
        points[0][5].setPiece(new Advisor(true));
        points[9][0].setPiece(new Chariot(false));
        points[9][1].setPiece(new Horse(false));
        points[7][1].setPiece(new Cannon(false));
        points[9][2].setPiece(new Elephant(false));
        points[9][3].setPiece(new Advisor(false));
        points[9][4].setPiece(new General(false));
        points[9][8].setPiece(new Chariot(false));
        points[9][7].setPiece(new Horse(false));
        points[7][7].setPiece(new Cannon(false));
        points[9][6].setPiece(new Elephant(false));
        points[9][5].setPiece(new Advisor(false));
    }
}
