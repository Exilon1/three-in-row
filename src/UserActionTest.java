import org.junit.Test;

import java.util.Arrays;

public class UserActionTest {
    @Test
    public void testSwapAction() {
        CellFactory factory = new CellFactory(Arrays.asList("Type1", "Type2"));
        GameField field = new GameField(factory);
        ClickChain chain = new ClickChain(0, 0, 0, 1);
        UserAction action = new UserAction.SwapCells(chain);

        action.execute(field);
        // Проверяем, что действие произвело корректные изменения
    }
}
