// Manual testing for quary string

public class QueryStringMain {
    
    public static void main(String args[]){
        
        QueryString data = new QueryString("name=Ironman&age=20&country=UK");

        System.out.println("Testing the getParameter function");
        System.out.println();
        System.out.println(data.getParameter("name"));
        System.out.println("Testing the hasParameter function");
        System.out.println(data.hasParameter("country"));
        System.out.println();
        System.out.println("Testing the getParameterOffset function");
        System.out.println(data.getParameterOffset("UK"));
        System.err.println("Testing the decode function");
        System.out.println();
        System.out.println(data.decode("Amogh"));


        



    }
}
