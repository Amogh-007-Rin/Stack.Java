// Student Name : Amogh Dath Kalasapura Arunkumar
// Student Id   : 24168333
// Student Email : amoghdath.kalasapuraarunkumar@mail.bcu.ac.uk
// Submission Date : 31st October 2025

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
        int[] scores = {1, 3, 3, 2, 1, 4, 2, 4, 1, 8, 5, 1, 3, 1, 1, 3, 10, 1, 1, 1, 1, 4, 4, 8, 4, 10};
        
        // TODO: create the `tileScores` map
        this.tileScores = new HashMap<>();
        
        // TODO: populate the `tileScores` map using the `tiles`
        // and `scores` arrays
        for (int i = 0; i < tiles.length; i++) {
            this.tileScores.put(tiles[i], scores[i]);
        }
    }
    
    /*
     * Calculates the score for an individual letter tile.
     * If the character is not a letter, then 0 is returned.
     */
    public int scoreForTile(char tile) {
        // TODO: convert the tile to an uppercase character
        tile = Character.toUpperCase(tile);
        
        // TODO: check if the `tileScores` map contains this tile
        if (tileScores.containsKey(tile)) {
            // TODO: get the tile score from the `tileScores` map
            return tileScores.get(tile);
        } else {
            return 0;
        }
    }
    
    /*
     * Calculates the score for a word.
     */
    public int scoreForWord(String word) {
        char[] tiles = word.toCharArray();
        
        // TODO: calculate the total score of the tiles
        int totalScore = 0;
        for (char tile : tiles) {
            totalScore += scoreForTile(tile);
        }
        return totalScore;
    }
    
    /*
     * Returns the highest-scoring word from a list of words,
     * or null if the list is empty.
     */
    public String highestScoringWord(List<String> words) {
        // TODO: find the word with the highest score
        if (words == null || words.isEmpty()) {
            return null;
        }

        String highestWord = null;
        int highestScore = -1;

        for (String word : words) {
            int currentScore = scoreForWord(word);
            if (currentScore > highestScore) {
                highestScore = currentScore;
                highestWord = word;
            }
        }
        return highestWord;
    }
}