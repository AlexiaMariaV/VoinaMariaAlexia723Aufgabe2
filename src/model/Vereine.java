package model;

import java.util.ArrayList;
import java.util.List;

public class Vereine {
    private int clubId;
    private String name;
    private String city;
    private List<Spieler> players = new ArrayList<Spieler>();

    public Vereine(int clubId, String name, String city) {
        this.clubId = clubId;
        this.name = name;
        this.city = city;
        this.players = players;
    }

    public int getClubId() {
        return clubId;
    }

    public void setClubId(int clubId) {
        this.clubId = clubId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public List<Spieler> getPlayers() {
        return players;
    }

    public void setPlayers(List<Spieler> players) {
        this.players = players;
    }

    @Override
    public String toString() {
        return "Vereine{" +
                "clubId=" + clubId +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", players=" + players +
                '}';
    }
}
