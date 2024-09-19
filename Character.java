public class Character {
    private String name;
    private int health;
    private static final int MAX_HEALTH = 100;

    public Character(String name) {
        this.name = name;
        health = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /* Add a getter for health here. */

    /*
     * Add a setter for health here. The max health is MAX_HEALTH, so don't set
     * health above that.
     */
}
