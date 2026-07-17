class MediaItem {
    protected String title;

    MediaItem(String title) {
        this.title = title;
    }

    void play() {
        System.out.println("Playing " + title);
    }
}
