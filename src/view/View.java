package view;

import controller.Controller;
import model.Spieler;
import model.Vereine;

import java.util.Scanner;

public class View {
    private final Controller controller = new Controller();
    private final Scanner scanner = new Scanner(System.in);

    public void menu() {
        while (true) {

            System.out.println("1. Add Player");
            System.out.println("2. Show All Players");
            System.out.println("3. Update Player");
            System.out.println("4. Delete Player");
            System.out.println("5. Add Team");
            System.out.println("6. Show All Teams");
            System.out.println("7. Update Team");
            System.out.println("8. Delete Team");
            System.out.println("9. Add player to team");

            // First filter
            System.out.println("10. Filter Characters by Region");

            // Second filter
            System.out.println("11. Filter Characters by product's region");

            // Sort
            System.out.println("12. Sort Products in ascending/descending order");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1 -> addPlayer();
                case 2 -> showAllPlayers();
                case 3 -> updatePlayer();
                case 4 -> deletePlayer();
                case 5 -> addTeam();
                case 6 -> showAllTeams();
                case 7 -> updateTeam();
                case 8 -> deleteTeam();
                case 9 -> addPlayerToTeam();
//                case 10 -> filterCharacterByRegion();
//                case 11 -> filterCharacterByProductRegion();
//                case 12 -> sortCharactersProducts();
            }
        }
    }

    // CRUD Player

    /**
     * Creates player to the InMemory repository.
     */
    private void addPlayer() {
        System.out.println("Enter the player ID");
        int spielerId = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter the player name");
        String name = scanner.nextLine();
        System.out.println("Enter the player age");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter the player position");
        String position = scanner.nextLine();
        System.out.println("Enter the player market value");
        int marketValue = scanner.nextInt();
        scanner.nextLine();

        controller.addPlayer(new Spieler(spielerId, name, age, position, marketValue));
    }

    /**
     * Gets all players from the InMemory repository.
     */
    private void showAllPlayers() {
        controller.getPlayersList().forEach(System.out::println);
    }

    /**
     * Updates player to the InMemory repository.
     */
    private void updatePlayer() {
        showAllPlayers();
        System.out.println("Enter the player ID");
        int spielerId = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter the player name");
        String name = scanner.nextLine();
        System.out.println("Enter the player age");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter the player position");
        String position = scanner.nextLine();
        System.out.println("Enter the player market value");
        int marketValue = scanner.nextInt();
        scanner.nextLine();
        controller.updatePlayer(spielerId, name, age, position, marketValue);
    }

    /**
     * Deletes player from the InMemory repository.
     */
    private void deletePlayer() {
        System.out.println("Enter the player ID");
        int spielerId = scanner.nextInt();
        controller.deletePlayer(spielerId);
    }

    // CRUD Team

    /**
     * Adds Team to the InMemory repository.
     */
    private void addTeam() {
        System.out.println("Enter the team ID");
        int clubId = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter the team name");
        String name = scanner.nextLine();
        System.out.println("Enter the team city");
        String city = scanner.nextLine();
        controller.addTeam(new Vereine(clubId, name, city));
    }

    /**
     * Gets all teams from the InMemory repository.
     */
    private void showAllTeams() {
        controller.getTeamsList().forEach(System.out::println);
    }

    /**
     * Updates team from the InMemory repository.
     */
    private void updateTeam() {
        System.out.println("Enter the team ID");
        int clubId = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter the team name");
        String name = scanner.nextLine();
        System.out.println("Enter the team city");
        String city = scanner.nextLine();
        controller.updateTeam(clubId, name, city);
    }

    /**
     * Deletes team from the InMemory repository.
     */
    private void deleteTeam() {
        System.out.println("Enter the team ID");
        int clubId = scanner.nextInt();
        controller.deleteTeam(clubId);
    }

    /**
     * Player is added to team
     */
    private void addPlayerToTeam() {
        showAllTeams();
        showAllPlayers();
        System.out.println("Enter the player ID");
        int spielerId = scanner.nextInt();
        System.out.println("Enter the team ID");
        int clubId = scanner.nextInt();
        controller.addPlayerToTeam(spielerId, clubId);
    }
}
