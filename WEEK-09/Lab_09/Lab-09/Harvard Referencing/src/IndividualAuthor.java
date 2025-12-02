//this class implements the Author's interface
public class IndividualAuthor implements Author {
    private final String lastName;
    private final String initials;
    
    public IndividualAuthor(String lastName, String initials) {
        this.lastName = lastName;
        this.initials = initials;
    }
    
    @Override
    //the fullName() method of the interface returns the lastname "," and initials
    public String fullName() {
        return lastName + ", " + initials;
    }
    
    @Override
    // the citeName() method of the interface returns the lastname
    public String citeName() {
        return lastName;
    }
}
 