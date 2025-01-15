package high.scores.data.service;

import java.util.List;

import high.scores.common.model.HighScore;

public interface HighScoresService {
    
    public List<HighScore> getHighScoresByPlayerName(String playerName);

    public List<HighScore> getHighScoresByGameName(String gameName);
}
