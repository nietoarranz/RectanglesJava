public class main {
    public static void main (String [] args){

        //Test 1
        System.out.println("============ TEST 1 ============");
        Point tl = new Point(1,2);
        Point tr = new Point(2,2);
        Point bl = new Point(1,1);
        Point br = new Point(2,1);

        Rectangle r1 = new Rectangle(tl,tr,bl,br);

        Point tl2 = new Point(2,3);
        Point tr2 = new Point(3,3);
        Point bl2 = new Point(2,2);
        Point br2 = new Point(3,2);

        Rectangle r2 = new Rectangle(tl2,tr2,bl2,br2);
        System.out.println("Rectangle 1:");
        System.out.println(r1.toString());
        System.out.println("Rectangle 2:");
        System.out.println(r2.toString());
        System.out.println("Union:");

        Rectangle r12 = Rectangle.joinRectangles(r1,r2);
        System.out.println(r12.toString());

        //Test 2
        System.out.println("============ TEST 2 ============");
        Point tl3 = new Point(1,3);
        Point tr3 = new Point(2,3);
        Point bl3 = new Point(1,1);
        Point br3 = new Point(2,1);

        Rectangle r3 = new Rectangle(tl3,tr3,bl3,br3);

        Point tl4 = new Point(3,2);
        Point tr4 = new Point(4,2);
        Point bl4 = new Point(3,1);
        Point br4 = new Point(4,1);

        Rectangle r4 = new Rectangle(tl4,tr4,bl4,br4);
        System.out.println("Rectangle 3:");
        System.out.println(r3.toString());
        System.out.println("Rectangle 4:");
        System.out.println(r4.toString());
        System.out.println("Union:");

        Rectangle r34 = Rectangle.joinRectangles(r3,r4);
        System.out.println(r34.toString());

    }
}
