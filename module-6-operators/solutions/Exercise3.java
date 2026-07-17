public class Exercise3 {
    public static void main(String[] args) {
        byte READ    = 0b0001;
        byte WRITE   = 0b0010;
        byte EXECUTE = 0b0100;
        byte DELETE  = 0b1000;

        byte permissions = 0;
        permissions |= READ;
        permissions |= WRITE;
        permissions |= EXECUTE;
        System.out.println("Permissions: " + Integer.toBinaryString(permissions));

        boolean canRead = (permissions & READ) != 0;
        boolean canDelete = (permissions & DELETE) != 0;
        System.out.println("Can read:   " + canRead);
        System.out.println("Can delete: " + canDelete);

        permissions ^= EXECUTE;  // toggle execute off
        System.out.println("After toggling EXECUTE off: " + Integer.toBinaryString(permissions));
    }
}
