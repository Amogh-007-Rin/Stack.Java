import java.util.*;

class Patron {
    int id;
    String name;

    Patron(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Patron p)) return false;
        return id == p.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return name + " (#" + id + ")";
    }
}

public class Solution3 {
    public static void main(String[] args) {
        Set<Patron> patrons = new HashSet<>();
        patrons.add(new Patron(1, "Alice"));
        patrons.add(new Patron(2, "Bob"));
        patrons.add(new Patron(1, "Alice Clone"));  // same id as Alice

        System.out.println("Patrons: " + patrons);
        System.out.println("Size: " + patrons.size());  // 2, not 3
        System.out.println("Alice equals Alice Clone: " +
            new Patron(1, "Alice").equals(new Patron(1, "Alice Clone")));
    }
}
