class Points {
  public class Point{
    private double x, y;
    public Point(double X, double Y){
      x = X;
      y = Y;
    }
    public Point(Point p){
      x = p.x;
      y = p.y;
    }
    public double getX(){
      return x;
    }
    public double getY(){
      return y;
    }
    public double distanceTo(Point other){
      return (Math.sqrt(Math.pow(other.getX() - x, 2.0) + Math.pow(other.getY() - y, 2.0)));
    }
    public boolean equals(Point other){
      if (other.getX() == x && other.getY() == y){
        return true;
      }
      else{
        return false;
      }
    }

  }
}
