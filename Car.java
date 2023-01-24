public class Car {
    private String registerNo, model, color;
    private Double cc;
    private int yearManufactured;

    public Car(String registerNo, String model, String color, Double cc, int yearManufactured) {
        this.registerNo = registerNo;
        this.model = model;
        this.color = color;
        this.cc = cc;
        this.yearManufactured = yearManufactured;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getRegisterNo() {
        return registerNo;
    }

    public void setRegisterNo(String registerNo) {
        this.registerNo = registerNo;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public Double getCc() {
        return cc;
    }

    public void setCc(Double cc) {
        this.cc = cc;
    }

    public int getYearManufactured() {
        return yearManufactured;
    }

    public void setYearManufactured(int yearManufactured) {
        this.yearManufactured = yearManufactured;
    }

    public String CarDetails() {
        return ("Car Details :" + "{ Register Number = " + registerNo + " , Model = " +
                model + " , Color = " + color + " , cc = " + cc + " , The Year of Manufacturer = " +
                yearManufactured + " }").toString();
    }

}