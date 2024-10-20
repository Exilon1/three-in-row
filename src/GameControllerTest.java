import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertTrue;

public class GameControllerTest {
    @Test
    public void testGameOver() {
        GameController controller = new GameController(new CellFactory(Arrays.asList("Type1", "Type2")));

        // Симулируем ситуацию конца игры
        controller.handleAction(new UserAction.SelectCell(0, 0));
        assertTrue(controller.isGameOver());
    }
}
