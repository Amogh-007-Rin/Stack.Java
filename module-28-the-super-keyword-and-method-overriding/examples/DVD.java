class DVD extends Item {
    private int durationMinutes;

    DVD(String title, String author, int year, int durationMinutes) {
        super(title, author, year);
        this.durationMinutes = durationMinutes;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " | " + durationMinutes + " min";
    }

    public void play() {
        System.out.println("Playing: " + title + " (" + durationMinutes + " min)");
    }
}
