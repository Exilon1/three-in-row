public class ClickChain {
    private final int x1, y1, x2, y2;

    // Предусловие: ячейки должны быть соседними
    public ClickChain(int x1, int y1, int x2, int y2) {
        if (Math.abs(x1 - x2) + Math.abs(y1 - y2) != 1) {
            throw new IllegalArgumentException("Cells are not adjacent.");
        }
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    // Геттеры для получения координат
    public int getX1() { return x1; }
    public int getY1() { return y1; }
    public int getX2() { return x2; }
    public int getY2() { return y2; }
}
