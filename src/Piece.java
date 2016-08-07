import java.awt.*;

/**
 * Created by vroyibg on 8/2/16.
 */
public class Piece {
    protected String name;
    protected boolean red;
    protected Image image;
    public Piece(boolean red){
        this.red=red;
    }
    public void draw(Graphics graphics,int x,int y,int size){
        graphics.drawImage(image,x-size/2,y-size/2,size,size,null);
    }
}
