package high.scores.data.entity;

public class HighScoreEntity {
    
    private PlayerEntity player;
    private GameEntity game;
    private Long score;
    

    public PlayerEntity getPlayer() {
        return player;
    }
    public void setPlayer(PlayerEntity player) {
        this.player = player;
    }
    public GameEntity getGame() {
        return game;
    }
    public void setGame(GameEntity game) {
        this.game = game;
    }
    public Long getScore() {
        return score;
    }
    public void setScore(Long score) {
        this.score = score;
    }
}
