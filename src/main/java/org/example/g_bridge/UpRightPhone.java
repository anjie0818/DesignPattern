package org.example.g_bridge;

public class UpRightPhone extends Phone {
    public UpRightPhone(Brand brand) {
        super(brand);
    }

    public void open() {
        System.out.println("UpRightPhone");
        super.open();
    }

    public void close() {
        System.out.println("UpRightPhone");
        super.close();
    }

    public void call() {
        System.out.println("UpRightPhone");
        super.call();
    }
}
