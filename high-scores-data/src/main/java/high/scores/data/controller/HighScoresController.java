package high.scores.data.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import high.scores.common.model.HighScore;
import high.scores.data.service.HighScoresService;

@RestController
@RequestMapping("/api/scores")
public class HighScoresController {

    private final HighScoresService service;

    @Autowired
    public HighScoresController(HighScoresService service) {
        this.service = service;
    }

    @GetMapping("/player/{playerName}")
    public List<HighScore> getHighScoresByPlayerName(@PathVariable("playerName") String playerName) {
        return service.getHighScoresByPlayerName(playerName);
    }

    @GetMapping("/game/{gameName}")
    public List<HighScore> getHighScoresByGameName(@PathVariable("gameName") String gameName) {
        return service.getHighScoresByGameName(gameName);
    }
}
