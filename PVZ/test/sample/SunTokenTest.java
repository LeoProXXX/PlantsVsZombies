package sample;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SunTokenTest {
    @Test
    void test_Act_ShouldSetYToSpeed_WhenYisLowerThenLimit() {
        SunToken sunToken = new SunToken(0, 0, 25);

        sunToken.setSpeed(10);
        sunToken.act();

        Assertions.assertEquals(sunToken.getY(), 10);
    }
}
