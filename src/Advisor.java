/**
 * Created by vroyibg on 8/2/16.
 */
import java.awt.*;
public class Advisor extends Piece {
    public Advisor(boolean red){
        super(red);
        name="Advisor";
        if(red) image=Constants.redAdvisor;
        else image=Constants.blackAdvisor;
    }
}
