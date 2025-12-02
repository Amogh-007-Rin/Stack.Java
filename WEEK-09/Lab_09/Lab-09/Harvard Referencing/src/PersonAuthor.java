public class PersonAuthor implements Author {
    private final String surname;
    private final String initials;

    public PersonAuthor(String surname, String initials) {
        this.surname = surname;
        this.initials = initials;
    }

    @Override
    public String fullName() {
        // Harvard reference entries typically use "Surname, Initials."
        return surname + ", " + initials;
    }

    @Override
    public String citeName() {
        // In-text cite name is usually just the surname
        return surname;
    }
}