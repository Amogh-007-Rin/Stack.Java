class Derived extends Base {

    @Override
    public int calculate(int x) {
        return x * 10;
    }

    @Override
    public void process() {
        System.out.println("Derived process");
    }
}
