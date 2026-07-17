import java.util.*;

public class Solution1 {
    public static void main(String[] args) {
        Set<String> genres = new HashSet<>();
        genres.add("Science Fiction");
        genres.add("Fantasy");
        genres.add("Mystery");
        genres.add("Science Fiction");  // duplicate
        genres.add("Non-Fiction");
        genres.add("Biography");

        System.out.println("Genres: " + genres);
        System.out.println("Contains 'Fantasy'? " + genres.contains("Fantasy"));
        System.out.println("Size: " + genres.size());
    }
}
