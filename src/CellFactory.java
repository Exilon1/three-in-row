import java.util.List;
import java.util.Random;

public class CellFactory {
    private final List<String> cellTypes;

    public CellFactory(List<String> cellTypes) {
        this.cellTypes = cellTypes;
    }

    // Постусловие: возвращает ячейку случайного типа
    public Cell createRandomCell() {
        String randomType = cellTypes.get(new Random().nextInt(cellTypes.size()));
        return new Cell(randomType);
    }

    // Постусловие: возвращает ячейку заданного типа
    public Cell createSpecificCell(String type) {
        return new Cell(type);
    }
}
