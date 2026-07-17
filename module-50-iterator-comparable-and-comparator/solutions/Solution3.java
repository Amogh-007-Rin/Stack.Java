import java.util.*;

class Patron {
    String name;
    int membershipYear;

    Patron(String name, int membershipYear) {
        this.name = name;
        this.membershipYear = membershipYear;
    }

    @Override
    public String toString() {
        return name + " (" + membershipYear + ")";
    }
}

public class Solution3 {
    public static void main(String[] args) {
        List<Patron> patrons = new ArrayList<>();
        patrons.add(new Patron("Carol", 2020));
        patrons.add(new Patron("Alice", 2018));
        patrons.add(new Patron("Bob", 2022));

        Comparator<Patron> byName = (a, b) -> a.name.compareTo(b.name);
        Comparator<Patron> byYear = (a, b) -> Integer.compare(a.membershipYear, b.membershipYear);

        Collections.sort(patrons, byName);
        System.out.println("By name: " + patrons);

        Collections.sort(patrons, byYear);
        System.out.println("By year: " + patrons);
    }
}
