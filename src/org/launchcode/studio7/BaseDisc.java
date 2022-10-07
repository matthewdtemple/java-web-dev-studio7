package org.launchcode.studio7;

public abstract class BaseDisc {

private Integer storage;
private Integer minRPM;
private Integer maxRPM;

public BaseDisc(Integer storage, Integer minRPM, Integer maxRPM){
    this.storage = storage;
    this.minRPM = minRPM;
    this.maxRPM = maxRPM;

}
    public Integer getStorage(){
        return storage;
    }

    public Integer getMaxRPM() {
        return maxRPM;
    }

    public Integer getMinRPM() {
        return minRPM;
    }

    public void setStorage(Integer storage) {
        this.storage = storage;
    }

    public void setMaxRPM(Integer maxRPM) {
        this.maxRPM = maxRPM;
    }

    public void setMinRPM(Integer minRPM) {
        this.minRPM = minRPM;
    }
}
