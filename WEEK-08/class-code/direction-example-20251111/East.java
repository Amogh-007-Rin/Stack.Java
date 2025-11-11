public class East implements Direction {
    @Override
    public String getName() {
        return "East";
    }
    
    @Override
    public Direction rotateClockwise() {
        return new South();
    }
    
    @Override
    public Direction rotateCounterClockwise() {
        return new North(); 
    }
}
