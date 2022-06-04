package high.scores.data.mapping;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import high.scores.common.model.HighScore;
import high.scores.data.entity.GameEntity;
import high.scores.data.entity.HighScoreEntity;
import high.scores.data.entity.PlayerEntity;

public class HighScoreMapperTest {

    private HighScoreMapper mapper;

    @BeforeEach
    public void setUp() {
        mapper = new HighScoreMapper();
    }

    private HighScoreEntity buildHighScoreEntity(String playerName, String gameTitle, Long highScore) {
        GameEntity gameEntity = new GameEntity();
        gameEntity.setTitle(gameTitle);

        PlayerEntity playerEntity = new PlayerEntity();
        playerEntity.setPlayerName(playerName);

        HighScoreEntity highScoreEntity = new HighScoreEntity();
        highScoreEntity.setGame(gameEntity);
        highScoreEntity.setPlayer(playerEntity);
        highScoreEntity.setScore(highScore);

        return highScoreEntity;
    }

    @Test
    public void testMapHighScore() {
        String playerName = "Steve";
        String gameTitle = "Space Invaders";
        Long highScore = 100000L;

        HighScoreEntity entity = buildHighScoreEntity(playerName, gameTitle, highScore);

        HighScore result = mapper.mapHighScore(entity);

        assertEquals(playerName, result.getPlayerName());
        assertEquals(gameTitle, result.getGameTitle());
        assertEquals(highScore.toString(), result.getScore());
    }
}
