package controller;

import model.Spieler;
import model.Vereine;

import java.util.ArrayList;
import java.util.List;

public class Controller {
    private List<Spieler> playersList = new ArrayList<>();
    private List<Vereine> teamsList= new ArrayList<>();

    // CRUD Player

    /**
     * Adds player to the InMemory repository.
     * @param spieler
     */
    public void addPlayer(Spieler spieler) {
        playersList.add(spieler);
    }

    /**
     * Gets all players from the InMemory repository.
     * @return
     */
    public List<Spieler> getPlayersList() {
        return playersList;
    }

    /**
     * Updates player from the InMemory repository.
     * @param spielerId
     * @param newName
     * @param newAge
     * @param newPosition
     * @param newMarketValue
     */
    public void updatePlayer(int spielerId, String newName, int newAge, String newPosition, int newMarketValue) {
        for (Spieler spieler : playersList) {
            if (spieler.getSpielerId() == spielerId) {
                spieler.setName(newName);
                spieler.setAge(newAge);
                spieler.setPosition(newPosition);
                spieler.setMarketValue(newMarketValue);
            }
        }
    }

    /**
     * Deletes player from the InMemory repository.
     * @param spielerId
     */
    public void deletePlayer(int spielerId) {
        playersList.removeIf(product -> product.getSpielerId() == spielerId);
    }

    // CRUD Team

    /**
     * Adds team to the InMemory repository.
     * @param vereine
     */
    public void addTeam(Vereine vereine) {
        teamsList.add(vereine);
    }

    /**
     * Gets all teams from the InMemory repository.
     * @return
     */
    public List<Vereine> getTeamsList() {
        return teamsList;
    }

    /**
     * Updates team from the InMemory repository.
     * @param clubId
     * @param newName
     * @param newCity
     */
    public void updateTeam(int clubId, String newName, String newCity) {
        for (Vereine vereine : teamsList) {
            if (vereine.getClubId() == clubId) {
                vereine.setName(newName);
                vereine.setCity(newCity);
            }
        }
    }

    /**
     * Deletes team from the InMemory repository.
     * @param clubId
     */
    public void deleteTeam(int clubId) {
        teamsList.removeIf(character -> character.getClubId() == clubId);
    }

    /**
     * Method for adding a player to a team.
     * @param spielerId
     * @param teamId
     */
    public void addPlayerToTeam(int spielerId, int teamId) {
        for (Vereine vereine : teamsList) {
            if (vereine.getClubId() == teamId) {
                for (Spieler spieler : playersList) {
                    if (spieler.getSpielerId() == spielerId) {
                        vereine.getPlayers().add(spieler);
                    }
                }
            }
        }
    }
}
