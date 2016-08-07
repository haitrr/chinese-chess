import java.awt.*;

public class Piece {
    protected String name;
    protected boolean red;
    protected Image image;
    protected Piece(boolean red){
        this.red=red;
    }
    public void draw(Graphics graphics,int x,int y,int size){
        graphics.drawImage(image,x-size/2,y-size/2,size,size,null);
    }
}
