package org.launchcode.studio7;

public class CD extends BaseDisc implements OpticalDisc {

private int speedRPM = 500;
private String title;

    public CD(String title) {
        super(title);
    }

    public String getTitle() {
        return title;
    }

    public void spinDisc(){
    System.out.println("It spins at " + speedRPM + " RPM");
}

    public static void main(String[] args){
        System.out.println();

        CD cd1 = new CD("Test Title");
        cd1.spinDisc();

    }

    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

}
