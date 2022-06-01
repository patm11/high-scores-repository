package high.scores.data.entity;

public class HighScoreEntity {
    
    private PlayerEntity player;
    private GameEntity game;
    
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
}
