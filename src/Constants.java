import javax.imageio.ImageIO;
import java.awt.*;
import java.io.*;

public class Constants{
    public static final File boardFile=new File("Resource/board.png");
    public static final File blackAdvisorFile=new File("Resource/advisor_black.png");
    public static final File blackCannonFile=new File("Resource/cannon_black.png");
    public static final File blackChariotFile=new File("Resource/chariot_black.png");
    public static final File blackElephantFile=new File("Resource/elephant_black.png");
    public static final File blackHorseFile=new File("Resource/horse_black.png");
    public static final File blackSoldierFile=new File("Resource/soldier_black.png");
    public static final File blackGeneralFile=new File("Resource/general_black.png");
    public static Image board;
    public static Image blackAdvisor;
    public static Image blackCannon;
    public static Image blackChariot;
    public static Image blackElephant;
    public static Image blackHorse;
    public static Image blackSoldier;
    public static Image blackGeneral;
    public static final File redAdvisorFile=new File("Resource/advisor_red.png");
    public static final File redCannonFile=new File("Resource/cannon_red.png");
    public static final File redChariotFile=new File("Resource/chariot_red.png");
    public static final File redElephantFile=new File("Resource/elephant_red.png");
    public static final File redHorseFile=new File("Resource/horse_red.png");
    public static final File redSoldierFile=new File("Resource/soldier_red.png");
    public static final File redGeneralFile=new File("Resource/general_red.png");
    public static Image redAdvisor;
    public static Image redCannon;
    public static Image redChariot;
    public static Image redElephant;
    public static Image redHorse;
    public static Image redSoldier;
    public static Image redGeneral;
    public static void init() throws IOException
    {
        board=ImageIO.read(boardFile);
        redGeneral=ImageIO.read(redGeneralFile);
        redAdvisor=ImageIO.read(redAdvisorFile);
        redCannon=ImageIO.read(redCannonFile);
        redChariot=ImageIO.read(redChariotFile);
        redElephant=ImageIO.read(redElephantFile);
        redHorse=ImageIO.read(redHorseFile);
        redSoldier=ImageIO.read(redSoldierFile);
        blackGeneral=ImageIO.read(blackGeneralFile);
        blackAdvisor=ImageIO.read(blackAdvisorFile);
        blackCannon=ImageIO.read(blackCannonFile);
        blackChariot=ImageIO.read(blackChariotFile);
        blackElephant=ImageIO.read(blackElephantFile);
        blackHorse=ImageIO.read(blackHorseFile);
        blackSoldier=ImageIO.read(blackSoldierFile);
    }
}
