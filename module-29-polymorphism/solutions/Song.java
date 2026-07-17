class Song extends MediaItem {
    private String artist;

    Song(String title, String artist) {
        super(title);
        this.artist = artist;
    }

    @Override
    void play() {
        System.out.println("Playing " + title + " by " + artist);
    }
}
