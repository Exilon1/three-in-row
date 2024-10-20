public class GameField {
    private final int size = 8;
    private final Cell[][] field = new Cell[size][size];

    public GameField(CellFactory factory) {
        // Генерация начального поля
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                field[i][j] = factory.createRandomCell();
            }
        }
    }

    // Предусловие: координаты должны находиться в пределах поля
    public Cell getCell(int x, int y) {
        if (x < 0 || x >= size || y < 0 || y >= size) {
            throw new IllegalArgumentException("Coordinates out of bounds");
        }
        return field[x][y];
    }

    // Предусловие: ячейки должны быть внутри границ поля
    // Постусловие: две ячейки должны быть обменены местами
    public void swapCells(int x1, int y1, int x2, int y2) {
        Cell temp = field[x1][y1];
        field[x1][y1] = field[x2][y2];
        field[x2][y2] = temp;
    }

    public int getSize() {
        return size;
    }
}