import java.util.*;

public class AttendanceRegister implements Register {
	private final List<String> names = new ArrayList<>();
	
	@Override
	public void addName(String name) throws AlreadyPresentException {
		if(names.contains(name)) {
			throw new AlreadyPresentException(name);
		}
		names.add(name);
	} 
	
	@Override
	public List<String> getNames() {
		return Collections.unmodifiableList(names);
	}
}