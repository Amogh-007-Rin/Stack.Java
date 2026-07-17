public class ToStringDemo {
    public static void main(String[] args) {
        Person p = new Person("Charlie", 28);
        System.out.println(p);

        Object obj = p;
        System.out.println(obj.toString());
    }
}
