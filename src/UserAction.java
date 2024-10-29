public abstract class UserAction {
    // Предусловие: координаты клеток должны быть действительными и находиться в пределах поля
    // Постусловие: действие изменит состояние игрового поля
    public abstract void execute(GameField field);

    // Пример действий
    public static class SelectCell extends UserAction {
        private final int x, y;

        public SelectCell(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public void execute(GameField field) {
            // Реализация выбора ячейки
        }
    }

    public static class SwapCells extends UserAction {
        private final ClickChain clickChain;

        public SwapCells(ClickChain clickChain) {
            this.clickChain = clickChain;
        }

        @Override
        public void execute(GameField field) {
            field.swapCells(clickChain.getX1(), clickChain.getY1(), clickChain.getX2(), clickChain.getY2());
        }
    }
}
