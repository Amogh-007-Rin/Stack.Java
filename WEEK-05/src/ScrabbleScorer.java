import java.util.*;

/*
 * This class scores words in the game of Scrabble.
 * A word's score is the total of its individual tile scores.
 */
public class ScrabbleScorer {
    private final Map<Character, Integer> tileScores;
    
    public ScrabbleScorer() {
        char[] tiles = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
        
        // TODO: initialise the array of individual letter scores
        int[] scores;
        
        // TODO: create the `tileScores` map
        
        // TODO: populate the `tileScores` map using the `tiles`
        // and `scores` arrays
        
    }
    
    /*
     * Calculates the score for an individual letter tile.
     * If the character is not a letter, then 0 is returned.
     */
    public int scoreForTile(char tile) {
        // TODO: convert the tile to an uppercase character
        
        // TODO: check if the `tileScores` map contains this tile
        
        // TODO: get the tile score from the `tileScores` map
   
    }
    
    /*
     * Calculates the score for a word.
     */
    public int scoreForWord(String word) {
        char[] tiles = word.toCharArray();
        
        // TODO: calculate the total score of the tiles
        
    }
    
    /*
     * Returns the highest-scoring word from a list of words,
     * or null if the list is empty.
     */
    public String highestScoringWord(List<String> words) {
        // TODO: find the word with the highest score
        
    }
}