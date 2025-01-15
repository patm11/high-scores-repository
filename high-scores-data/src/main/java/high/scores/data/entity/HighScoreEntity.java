package high.scores.data.entity;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "HIGH_SCORES")
public class HighScoreEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "HIGH_SCORES_SEQ")
    private Long id;
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private PlayerEntity player;
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private GameEntity game;
    private Date date;
    private Long score;
    
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
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
    public Date getDate() {
        return date;
    }
    public void setDate(Date date) {
        this.date = date;
    }
    public Long getScore() {
        return score;
    }
    public void setScore(Long score) {
        this.score = score;
    }
}
