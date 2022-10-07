package org.launchcode.studio7;

public class DVD implements OpticalDisc {

    private int speedRPM = 1200;
    private String title;

    @Override
    public void spinDisc() {
        System.out.println("It spins at " + speedRPM + " RPM");
    }

    public static void main(String[] args){
        System.out.println();

        DVD dvd1 = new DVD();
        dvd1.spinDisc();
    }

    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

}
