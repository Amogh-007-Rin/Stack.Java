class AudioBook extends MediaItem {
    private String narrator;

    AudioBook(String title, String narrator) {
        super(title);
        this.narrator = narrator;
    }

    @Override
    void play() {
        System.out.println("Listening to " + title + " narrated by " + narrator);
    }
}
