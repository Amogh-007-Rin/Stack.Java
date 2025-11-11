public class West implements Direction {
    @Override
    public String getName() {
        return "West";
    }
    
    @Override
    public Direction rotateClockwise() {
        return new North();
    }
    
    @Override
    public Direction rotateCounterClockwise() { 
        return new South();
    }
}
