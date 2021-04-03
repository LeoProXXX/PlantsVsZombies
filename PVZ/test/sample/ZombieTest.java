package sample;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ZombieTest {
    @Test
    void test_DecreaseHealth_ZombieShouldDie_WhenDecreasedDamageIsGreaterThanZombieHealth() {
        Zombie zombie = new Zombie(0, 0, 100, 100, 120, 12L, 1, 2.0D);

        zombie.decreaseHealth(150);

        Assertions.assertTrue(zombie.isDead());
    }
}
