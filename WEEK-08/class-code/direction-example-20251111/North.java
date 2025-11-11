public class North implements Direction {
    @Override
    public String getName() {
        return "North";
    }
    
    @Override
    public Direction rotateClockwise() {
        return new East();
    }
     
    @Override
    public Direction rotateCounterClockwise() {
        return new West();
    }
}
