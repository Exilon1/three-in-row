public class GameController {
    private final GameField field;
    private boolean gameOver = false;

    public GameController(CellFactory factory) {
        this.field = new GameField(factory);
    }

    // Предусловие: действие должно быть допустимым
    // Постусловие: поле изменяется в зависимости от действия
    public void handleAction(UserAction action) {
        action.execute(field);
        checkForMatches();
        if (isGameOver()) {
            endGame();
        }
    }

    private void checkForMatches() {
        // Логика проверки совпадений
    }

    public boolean isGameOver() {
        return gameOver;
    }

    private void endGame() {
        System.out.println("Game Over!");
    }
}
