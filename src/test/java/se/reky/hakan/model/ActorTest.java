package se.reky.hakan.model;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class ActorTest {

    private Player player;
    private Goblin goblin;
    @Test
    public void testAttackDoesDamage() {

        player = new Player("Levi", 100, 22);
        goblin = new Goblin("Tim", 100, 22);

        goblin.attack(player);

        assertEquals(78, player.getHp());
    }

}