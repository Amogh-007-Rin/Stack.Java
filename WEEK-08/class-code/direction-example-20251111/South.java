public class South implements Direction {
    @Override
    public String getName() {
        return "South";
    }
    
    @Override
    public Direction rotateClockwise() {
        return new West();
    }
     
    @Override
    public Direction rotateCounterClockwise() {
        return new East();
    }
}
