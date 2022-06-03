package high.scores.data.mapping;

import org.springframework.stereotype.Component;

import high.scores.common.model.HighScore;
import high.scores.data.entity.HighScoreEntity;

@Component
public class HighScoreMapper {

    public HighScore mapHighScore(HighScoreEntity entity) {
        HighScore hs = new HighScore();

        hs.setPlayerName(entity.getPlayer().getPlayerName());
        hs.setGameTitle(entity.getGame().getTitle());
        hs.setScore(entity.getScore().toString());

        return hs;
    }
}
