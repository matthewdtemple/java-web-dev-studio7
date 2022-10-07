package org.launchcode.studio7;

public class DVD extends BaseDisc implements OpticalDisc {
    private String title;

    public DVD(String title, Integer storage, Integer minRPM, Integer maxRPM){
        super(storage, minRPM, maxRPM);
        this.title = title;
    }

    public String getTitle() {
        return this.title;
    }
    @Override
    public void spinDisc() {
        System.out.println("It spins between " + this.getMinRPM() + " - " + this.getMaxRPM() + " RPM");
    }
    public void loadDisc(){System.out.println((this.title + " has been loaded!"));}


    public static void main(String[] args){
        System.out.println();

        DVD dvd1 = new DVD("The Lion King", 1500, 700, 1500);
        dvd1.spinDisc();
        dvd1.loadDisc();
        System.out.println(dvd1.getTitle() + " is the current Title");
    }

    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

}
