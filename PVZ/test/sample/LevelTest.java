package sample;

import org.easymock.EasyMockExtension;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.easymock.Mock;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.easymock.EasyMock.expect;
import static org.easymock.EasyMock.replay;

@ExtendWith(EasyMockExtension.class)
public class LevelTest {
    @Mock
    private Actor actorMock1;

    @Mock
    private Actor actorMock2;

    @Test
    void test_Dist_ShouldReturn2() {
        Level level = new Level();

        expect(actorMock1.getX()).andReturn(1).anyTimes();
        expect(actorMock1.getY()).andReturn(2).anyTimes();
        replay(actorMock1);

        expect(actorMock2.getX()).andReturn(1).anyTimes();
        expect(actorMock2.getY()).andReturn(4).anyTimes();
        replay(actorMock2);

        double result = level.dist(actorMock1, actorMock2);

        Assertions.assertEquals(result, 2);
    }
}
