
public class Rectangle {

    private Point topLeft;
    private Point topRight;
    private Point botLeft;
    private Point botRight;

    public Rectangle(Point topLeft, Point topRight, Point botLeft, Point botRight) {
        this.topLeft = topLeft;
        this.topRight = topRight;
        this.botLeft = botLeft;
        this.botRight = botRight;
    }

    public Point getTopLeft() {
        return topLeft;
    }

    public Point getTopRight() {
        return topRight;
    }

    public Point getBotLeft() {
        return botLeft;
    }

    public Point getBotRight() {
        return botRight;
    }

    static Rectangle joinRectangles (Rectangle r1, Rectangle r2) {
        //Top left point
        Point topLeft = new Point(0,0);
        int comp = r1.getTopLeft().comparePoint(r2.getTopLeft(),1);
        if(comp == -1){
            topLeft = r1.getTopLeft();
        }else if(comp == 1){
            topLeft = r2.getTopLeft();
        }else{
            //Point x
            if(r1.getTopLeft().getX()<=r2.getTopLeft().getX()){
                topLeft.setX(r1.getTopLeft().getX());
            }else{
                topLeft.setX(r2.getTopLeft().getX());
            }
            //Point y
            if(r1.getTopLeft().getY()>=r2.getTopLeft().getY()){
                topLeft.setY(r1.getTopLeft().getY());
            }else{
                topLeft.setY(r2.getTopLeft().getY());
            }
        }

        //Top rigth point
        Point topRight = new Point(0,0);
        comp = r1.getTopRight().comparePoint(r2.getTopRight(),2);
        if(comp == -1){
            topRight = r1.getTopRight();
        }else if(comp == 1){
            topRight = r2.getTopRight();
        }else{
            //Point x
            if(r1.getTopRight().getX()>=r2.getTopRight().getX()){
                topRight.setX(r1.getTopRight().getX());
            }else{
                topRight.setX(r2.getTopRight().getX());
            }
            //Point y
            if(r1.getTopLeft().getY()>=r2.getTopLeft().getY()){
                topRight.setY(r1.getTopRight().getY());
            }else{
                topRight.setY(r2.getTopRight().getY());
            }
        }

        //Bot left point
        Point botLeft = new Point(0,0);
        comp = r1.getBotLeft().comparePoint(r2.getBotLeft(),3);
        if(comp == -1){
            botLeft = r1.getBotLeft();
        }else if(comp == 1){
            botLeft = r2.getBotLeft();
        }else{
            //Point x
            if(r1.getBotLeft().getX()<=r2.getBotLeft().getX()){
                botLeft.setX(r1.getBotLeft().getX());
            }else{
                botLeft.setX(r2.getBotLeft().getX());
            }
            //Point y
            if(r1.getTopLeft().getY()<=r2.getTopLeft().getY()){
                botLeft.setY(r1.getBotLeft().getY());
            }else{
                botLeft.setY(r2.getBotLeft().getY());
            }
        }
        //Bot left point
        Point botRight = new Point(0,0);
        comp = r1.getBotRight().comparePoint(r2.getBotRight(),4);
        if(comp == -1){
            botRight = r1.getBotRight();
        }else if(comp == 1){
            botRight = r2.getBotRight();
        }else{
            //Point x
            if(r1.getBotRight().getX()>=r2.getBotRight().getX()){
                botRight.setX(r1.getBotRight().getX());
            }else{
                botRight.setX(r2.getBotRight().getX());
            }
            //Point y
            if(r1.getTopLeft().getY()<=r2.getTopLeft().getY()){
                botRight.setY(r1.getBotRight().getY());
            }else{
                botRight.setY(r2.getBotRight().getY());
            }
        }
        return new Rectangle(topLeft, topRight, botLeft, botRight);
    }

    public String toString(){
        String response = "";
        response += "(" + this.getTopLeft().getX() + "," + this.getTopLeft().getY() + ")";
        response += " - ";
        response += "(" + this.getTopRight().getX() + "," + this.getTopRight().getY() + ")";
        response += "\n";
        response += "  |       |  ";
        response += "\n";
        response += "(" + this.getBotLeft().getX() + "," + this.getBotLeft().getY() + ")";
        response += " - ";
        response += "(" + this.getBotRight().getX() + "," + this.getBotRight().getY() + ")";
        return response;
    }

}
