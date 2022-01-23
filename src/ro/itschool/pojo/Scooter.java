package ro.itschool.pojo;

import java.util.Arrays;

public class Scooter extends Motorcycle{
    private String[] scooterFeatures;

    public Scooter() {
    }

    public String[] getScooterFeatures() {
        return scooterFeatures;
    }

    public void setScooterFeatures(String[] scooterFeatures) {
        this.scooterFeatures = scooterFeatures;
    }

    @Override
    public String toString() {
        return "Scooter{" +
                "id=" + id +
                ", price=" + price +
                ", model='" + model + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", fabricationYear=" + fabricationYear +
                ", scooterFeatures=" + Arrays.toString(scooterFeatures) +
                '}';
    }
}
