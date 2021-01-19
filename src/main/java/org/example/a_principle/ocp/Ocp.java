package org.example.a_principle.ocp;

public class Ocp {

    public static void main(String[] args) {
        GraphicEditor graphicEditor = new GraphicEditor();
        graphicEditor.drawShape(new Triangle());
        graphicEditor.drawShape(new Circle());
        graphicEditor.drawShape(new Rectangle());
    }
}

class Shape {
    int m_type;
}

// 这是一个用于绘图的类【使用方】
class GraphicEditor {

    public void drawShape(Shape s) {
        if (s.m_type == 1) {
            drawRectangle(s);
        } else if (s.m_type == 2) {
            drawCircle(s);
        } else if (s.m_type == 3) {
            drawTriangle(s);
        }
    }

    private void drawTriangle(Shape s) {
        System.out.println("三角形绘制");
    }

    private void drawCircle(Shape s) {
        System.out.println("圆形绘制");
    }

    private void drawRectangle(Shape s) {
        System.out.println("矩形绘制");
    }

}

class Rectangle extends Shape {
    Rectangle() {
        super.m_type = 1;
    }
}

class Circle extends Shape {
    Circle() {
        super.m_type = 2;
    }
}

class Triangle extends Shape {
    Triangle() {
        super.m_type = 3;
    }
}