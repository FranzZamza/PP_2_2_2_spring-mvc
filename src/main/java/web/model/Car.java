package web.model;

public class Car {
    private String model;
    private String series;
    private Boolean isNewCar;

    public Car(String model, String series, Boolean isNewCar) {
        this.model = model;
        this.series = series;
        this.isNewCar = isNewCar;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public Boolean getNewCar() {
        return isNewCar;
    }

    public void setNewCar(Boolean newCar) {
        isNewCar = newCar;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", series='" + series + '\'' +
                ", isNewCar=" + isNewCar +
                '}';
    }
}
