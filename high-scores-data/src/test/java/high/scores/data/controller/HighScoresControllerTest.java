package high.scores.data.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.when;

import java.util.Collections;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import high.scores.common.model.HighScore;
import high.scores.data.service.HighScoresService;

@ExtendWith(MockitoExtension.class)
public class HighScoresControllerTest {
    
    @Mock
    private HighScoresService service;

    private HighScoresController controller;

    @BeforeEach
    public void setUp() {
        controller = new HighScoresController(service);
    }

    @Test
    public void testGetScoresByPlayerName() {
        String playerName = "BlahPlayer";

        when(service.getHighScoresByPlayerName(eq(playerName))).thenReturn(Collections.emptyList());
        List<HighScore> result = controller.getHighScoresByPlayerName(playerName);

        assertEquals(Collections.emptyList(), result);
    }
}
