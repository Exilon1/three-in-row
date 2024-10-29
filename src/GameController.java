public class GameController {
    private final GameField field;
    private int score;
    private final int targetScore;
    private boolean gameOver = false;

    public GameController(CellFactory factory, int targetScore) {
        this.field = new GameField(factory);
        this.targetScore = targetScore;
        this.score = 0;
    }

    // Предусловие: действие должно быть допустимым
    // Постусловие: поле изменяется в зависимости от действия и проверяется конец игры
    public void handleAction(UserAction action) {
        action.execute(field);
        score += field.getScoreFromLastAction();
        checkGameOver();
    }

    private void checkGameOver() {
        if (score >= targetScore) {
            gameOver = true;
            endGame();
        }
    }

    public boolean isGameOver() {
        return gameOver;
    }

    private void endGame() {
        System.out.println("Game Over!");
    }
}
