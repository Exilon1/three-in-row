import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertTrue;

public class GameControllerTest {
    @Test
    public void testGameOver() {
        CellFactory factory = new CellFactory(Arrays.asList("Type1", "Type2"));
        int targetScore = 50;
        GameController controller = new GameController(factory, targetScore);

        // Множество обменов, чтобы набрать очки и достичь конца игры
        for (int i = 0; i < 5; i++) {
            ClickChain chain = new ClickChain(0, 0, 0, 1); // Предполагаем, что эта пара успешна
            UserAction action = new UserAction.SwapCells(chain);
            controller.handleAction(action);
        }

        assertTrue(controller.isGameOver());
    }
}
