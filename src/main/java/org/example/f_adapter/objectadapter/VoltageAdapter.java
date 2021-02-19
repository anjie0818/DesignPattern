package org.example.f_adapter.objectadapter;

public class VoltageAdapter implements IVoltage5V {

    private Voltage220V voltage220V;

    public VoltageAdapter(Voltage220V voltage220V) {
        this.voltage220V = voltage220V;
    }

    public int output5V() {
        int srcV = voltage220V.output220V();
        int dstV = srcV / 44;
        return dstV;
    }
}
