public class Move {
    private Point source;
    private Point dest;

    public Point getSource() {
        return source;
    }

    public Point getDest() {
        return dest;
    }
    public Move(Point source,Point dest){
        this.source=source;
        this.dest=dest;
    }
}
