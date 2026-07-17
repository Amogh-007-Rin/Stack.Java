class LibraryMember {
    private String name;
    private int memberId;
    private int age;
    private String email;
    private int booksCheckedOut;

    public LibraryMember(String name, int memberId) {
        this.name = name;
        this.memberId = memberId;
        this.age = 0;
        this.email = "";
        this.booksCheckedOut = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name cannot be empty");
        }
        this.name = name;
    }

    public int getMemberId() {
        return memberId;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0 || age > 150) {
            throw new IllegalArgumentException("Age must be between 0 and 150");
        }
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (email != null && !email.contains("@")) {
            throw new IllegalArgumentException("Invalid email address");
        }
        this.email = email;
    }

    public int getBooksCheckedOut() {
        return booksCheckedOut;
    }

    public void checkOutBook() {
        booksCheckedOut++;
    }

    public void returnBook() {
        if (booksCheckedOut > 0) {
            booksCheckedOut--;
        }
    }

    public void display() {
        System.out.println("Member #" + memberId + ": " + name +
                           " | Age: " + age + " | Email: " + email +
                           " | Books out: " + booksCheckedOut);
    }
}
