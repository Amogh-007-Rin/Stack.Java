import java.util.*;

public class SoloRegister implements Register {
	private String name = null;
	
	@Override
	public void addName(String name) throws AlreadyPresentException {
		if(this.name == null) {
			this.name = name;
		} else if(this.name.equals(name)) {
			throw new AlreadyPresentException(name);
		} else {
			String message = "Can't add second name: " + this.name + ", " + name;
			throw new IllegalStateException(message);
		}
	}
	
	@Override
	public List<String> getNames() {
		if(name == null) {
			return Collections.emptyList(); 
		} else {
			return Collections.singletonList(name);
		}
	}
}