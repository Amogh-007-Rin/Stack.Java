class Movie extends MediaItem {
    private String director;

    Movie(String title, String director) {
        super(title);
        this.director = director;
    }

    @Override
    void play() {
        System.out.println("Playing " + title + " directed by " + director);
    }
}
