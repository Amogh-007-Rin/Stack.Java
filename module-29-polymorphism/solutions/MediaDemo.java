public class MediaDemo {
    public static void main(String[] args) {
        MediaItem[] playlist = {
            new Song("Bohemian Rhapsody", "Queen"),
            new Movie("Inception", "Christopher Nolan"),
            new AudioBook("Dune", "Simon Vance"),
            new Song("Stairway to Heaven", "Led Zeppelin"),
            new Movie("The Matrix", "Wachowskis")
        };

        int songs = 0, movies = 0, audiobooks = 0;

        System.out.println("=== Media Playlist ===");
        for (MediaItem m : playlist) {
            m.play();
            if (m instanceof Song) songs++;
            else if (m instanceof Movie) movies++;
            else if (m instanceof AudioBook) audiobooks++;
        }

        System.out.println("\n=== Playlist Stats ===");
        System.out.println("Songs: " + songs);
        System.out.println("Movies: " + movies);
        System.out.println("AudioBooks: " + audiobooks);
    }
}
