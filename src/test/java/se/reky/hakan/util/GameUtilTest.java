package se.reky.hakan.util;
import org.junit.jupiter.api.Test;
import se.reky.hakan.GameException;

import static org.junit.jupiter.api.Assertions.*;
class GameUtilTest {

    private GameUtil gameUtil;

    @Test
    public void testNullIsHandled() {
        gameUtil = new GameUtil();
        assertThrows(GameException.class, () -> gameUtil.toLowerCaseButFirstLetterCapitalized(null));
    }
}