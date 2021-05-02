package javacampgamemanagement;

public class PlayerManager implements BaseManager {

    private Player player;


    public PlayerManager(Player player) {
        this.player = player;
    }

    @Override
    public void add() {
        System.out.println("Added Player : " + player.getFirstName() + " " + player.getLastName());
    }

    @Override
    public void delete() {
        System.out.println("Deleted Player : " + player.getFirstName() + " " + player.getLastName());
    }

    @Override
    public void update() {
        System.out.println("Updated Player : " + player.getFirstName() + " " + player.getLastName());
    }
}
