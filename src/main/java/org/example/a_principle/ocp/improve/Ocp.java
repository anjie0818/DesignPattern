package org.example.a_principle.ocp.improve;

public class Ocp {

    public static void main(String[] args) {
        GraphicEditor graphicEditor = new GraphicEditor();
        graphicEditor.drawShape(new Triangle());
        graphicEditor.drawShape(new Circle());
        graphicEditor.drawShape(new Rectangle());
    }
}

abstract class Shape {
    int m_type;

    public abstract void draw();
}

// 这是一个用于绘图的类【使用方】
class GraphicEditor {

    public void drawShape(Shape s) {
        s.draw();
    }

}

class Rectangle extends Shape {
    Rectangle() {
        super.m_type = 1;
    }

    public void draw() {
        System.out.println("矩形绘制");
    }
}

class Circle extends Shape {
    Circle() {
        super.m_type = 2;
    }

    public void draw() {
        System.out.println("圆形绘制");
    }
}

class Triangle extends Shape {
    Triangle() {
        super.m_type = 3;
    }

    public void draw() {
        System.out.println("三角形绘制");
    }
}