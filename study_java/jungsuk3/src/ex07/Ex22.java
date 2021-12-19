package ex07;

public class Ex22 {
}
class Point{
    int x;
    int y;
    Point(){
        this(0,0);
    }
    Point(int x, int y){
        this.x = x;
        this.y = y;
    }
    public String toString(){
        return "x: "+this.x + ", y: "+this.y ;
    }
}

abstract class Shape{
    Point p;
    Shape(){
        this(new Point(0,0));
    }
    Shape(Point p){
        this.p = p;
    }

    // 도형의 면적 계산해서 반환
    abstract double calcArea();

    Point getPosition(){
        return p;
    }
    void setPosition(Point p){
        this.p = p;
    }
}

class Circle extends Shape{
    double r;
    Circle(){
        
    }

    @Override
    double calcArea() {
        return 0;
    }
}