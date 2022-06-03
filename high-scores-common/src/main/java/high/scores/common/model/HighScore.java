package high.scores.common.model;

public class HighScore {
    private String playerName;
    private String gameTitle;
    private String score;
    
    public String getPlayerName() {
        return playerName;
    }
    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }
    public String getGameTitle() {
        return gameTitle;
    }
    public void setGameTitle(String gameTitle) {
        this.gameTitle = gameTitle;
    }
    public String getScore() {
        return score;
    }
    public void setScore(String score) {
        this.score = score;
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((gameTitle == null) ? 0 : gameTitle.hashCode());
        result = prime * result + ((playerName == null) ? 0 : playerName.hashCode());
        result = prime * result + ((score == null) ? 0 : score.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        HighScore other = (HighScore) obj;
        if (gameTitle == null) {
            if (other.gameTitle != null)
                return false;
        } else if (!gameTitle.equals(other.gameTitle))
            return false;
        if (playerName == null) {
            if (other.playerName != null)
                return false;
        } else if (!playerName.equals(other.playerName))
            return false;
        if (score == null) {
            if (other.score != null)
                return false;
        } else if (!score.equals(other.score))
            return false;
        return true;
    }
    
    @Override
    public String toString() {
        return "HighScore [gameTitle=" + gameTitle + ", playerName=" + playerName + ", score=" + score + "]";
    }
}
