class DVD extends LibraryItem {
    int durationMinutes;

    DVD(String title, String author, int year, int durationMinutes) {
        super(title, author, year);
        this.durationMinutes = durationMinutes;
    }

    @Override
    String getDescription() {
        return super.getDescription() + " | " + durationMinutes + " min";
    }
}
