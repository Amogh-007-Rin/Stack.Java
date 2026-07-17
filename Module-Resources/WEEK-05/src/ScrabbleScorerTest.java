import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

public class ScrabbleScorerTest {
    
    // THIS TEST CASE VERIFIES THE SCORING OF INDIVIDUAL SCRABBLE TILES
    @Test
    void testScoreForTile() {
        ScrabbleScorer scorer = new ScrabbleScorer();
        assertEquals(1, scorer.scoreForTile('A'));
        assertEquals(10, scorer.scoreForTile('Q'));
        assertEquals(0, scorer.scoreForTile('_'));
        assertEquals(0, scorer.scoreForTile('!'));
        assertEquals(1, scorer.scoreForTile('a')); // Test case-insensitivity
    }
    
    // THIS TEST CHECKS THE SCORING OF THE COMPLETE WORDS 
    @Test
    void testScoreForWord() {
        ScrabbleScorer scorer = new ScrabbleScorer();
        assertEquals(8, scorer.scoreForWord("HELLO"));
        assertEquals(20, scorer.scoreForWord("QUICK"));
        assertEquals(0, scorer.scoreForWord("_"));
        assertEquals(0, scorer.scoreForWord("!?"));
        assertEquals(8, scorer.scoreForWord("hello")); // Test case-insensitivity
        assertNotEquals(30, scorer.scoreForWord("MAN"));
    }
    
    // THIS TEST CASE VERIFIES FINDING THE HIGHEST SCORING WORD FROM A LIST
    @Test
    void testHighestScoringWord() {
        ScrabbleScorer scorer = new ScrabbleScorer();
        List<String> words1 = Arrays.asList("CAT", "DOG", "APPLE");
        assertEquals("APPLE", scorer.highestScoringWord(words1));

        List<String> words2 = Arrays.asList("QUIZ", "JAVASCRIPT");
        assertEquals("JAVASCRIPT", scorer.highestScoringWord(words2));

        List<String> words3 = Arrays.asList("A", "B", "R");
        assertEquals("B", scorer.highestScoringWord(words3));
        
        List<String> emptyList = Arrays.asList();
        assertNull(scorer.highestScoringWord(emptyList));

        assertNull(scorer.highestScoringWord(null));
    }
}
