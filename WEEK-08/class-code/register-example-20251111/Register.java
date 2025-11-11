import java.util.List;

public interface Register {
    public void addName(String name) throws AlreadyPresentException;
    
    public List<String> getNames(); 
}
