
import TurtleGraphics.Pen;

public class Circle implements Shape{
   private double xPos,yPos,radius;
   public Circle(){
       xPos=0;
       yPos=0;
       radius=1;
   }
   public Circle(double x, double y, double r){
       xPos=x;
       yPos=y;
       radius=r;
   }
    
    public double area(){
        return Math.PI * radius * radius;
    }

    @Override
    public void draw(Pen p) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    public double getXPos() {
        return xPos;
    }

    
    public double getYPos() {
        return yPos;
    }

    
    public void move(double xLoc, double yLoc) {
        xPos=xLoc;
        yPos=yLoc;
    }

    
    public void stretchBy(double factor) {
        radius*=factor;
    }
    
    public String toString(){
        String str="This is a CIRCLE\n";
        str+="XLOC: " +xPos+"\tYLOC: "+yPos+"\n";
        str+="RADIUS: "+radius+"\n";
        str+="AREA: "+area();
        return str;
    }
}
