package model;

public class Spieler {
    private int spielerId;
    private String name;
    private int age;
    public String position;
    public int marketValue;

    @Override
    public String toString() {
        return "Spieler{" +
                "spielerId=" + spielerId +
                ", name='" + name + '\'' +
                ", alter=" + age +
                ", position='" + position + '\'' +
                ", marketValue=" + marketValue +
                '}';
    }

    public Spieler(int spielerId, String name, int age, String position, int marketValue) {
        this.spielerId = spielerId;
        this.name = name;
        this.age = age;
        this.position = position;
        this.marketValue = marketValue;
    }

    public int getSpielerId() {
        return spielerId;
    }

    public void setSpielerId(int spielerId) {
        this.spielerId = spielerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getMarketValue() {
        return marketValue;
    }

    public void setMarketValue(int marketValue) {
        this.marketValue = marketValue;
    }
}
