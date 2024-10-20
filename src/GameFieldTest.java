import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class GameFieldTest {
    @Test
    public void testFieldInitialization() {
        CellFactory factory = new CellFactory(Arrays.asList("Type1", "Type2"));
        GameField field = new GameField(factory);
        assertEquals(8, field.getSize());
        assertNotNull(field.getCell(0, 0)); // Проверяем, что клетка существует
    }

    @Test
    public void testSwapCells() {
        CellFactory factory = new CellFactory(Arrays.asList("Type1", "Type2"));
        GameField field = new GameField(factory);
        Cell cell1 = field.getCell(0, 0);
        Cell cell2 = field.getCell(0, 1);

        field.swapCells(0, 0, 0, 1);
        assertEquals(cell1, field.getCell(0, 1));
        assertEquals(cell2, field.getCell(0, 0));
    }
}
