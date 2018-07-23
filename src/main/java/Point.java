public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point() {
        this.x = 0;
        this.y = 0;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    // Options:
    // 1 -> topLeft
    // 2 -> topRight
    // 3 -> botLeft
    // 4 -> botRight
    public int comparePoint (Point p, int option){
        switch (option){
            case 1: if(this.getX()<=p.getX() && this.getY()>=p.getY()){
                        return -1;
                    }else if(p.getX()<=this.getX() && p.getY()>=this.getY()){
                        return 1;
                    }else {
                        return 0;
                    }
            case 2: if(this.getX()>=p.getX() && this.getY()>=p.getY()){
                        return -1;
                    }else if(p.getX()>=this.getX() && p.getY()>=this.getY()){
                        return 1;
                    }else {
                        return 0;
                    }
            case 3: if(this.getX()<=p.getX() && this.getY()<=p.getY()){
                        return -1;
                    }else if(p.getX()<=this.getX() && p.getY()<=this.getY()){
                        return 1;
                    }else {
                        return 0;
                    }
            case 4: if(this.getX()>=p.getX() && this.getY()<=p.getY()){
                        return -1;
                    }else if(p.getX()>=this.getX() && p.getY()<=this.getY()){
                        return 1;
                    }else {
                        return 0;
                    }
        }
        return 0;
    }


}
