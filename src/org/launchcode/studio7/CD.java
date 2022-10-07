package org.launchcode.studio7;

public class CD extends BaseDisc implements OpticalDisc {

private String title;

    public CD(String title, Integer storage, Integer minRPM, Integer maxRPM) {
        super(storage, minRPM, maxRPM);
        this.title = title;
    }

    public String getTitle() {
        return this.title;
    }

    public void spinDisc(){
    System.out.println("It spins between " + this.getMinRPM() + " - " + this.getMaxRPM() + " RPM");
}

    public void loadDisc(){System.out.println((getTitle() + " has been loaded!"));}

    public static void main(String[] args){
        System.out.println();

        CD cd1 = new CD("Bruno Jupiter", 350, 200, 500);
        cd1.spinDisc();
        cd1.loadDisc();
        System.out.println("se llama " + cd1.getTitle());

    }

    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

}
