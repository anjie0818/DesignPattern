package org.example.g_bridge;

public class FoldedPhone extends Phone {
    public FoldedPhone(Brand brand) {
        super(brand);
    }

    public void open() {
        System.out.println("FoldedPhone");
        super.open();
    }

    public void close() {
        System.out.println("FoldedPhone");
        super.close();
    }

    public void call() {
        System.out.println("FoldedPhone");
        super.call();
    }
}
