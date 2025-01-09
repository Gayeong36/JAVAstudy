package exampleCollections;

class Tool{
    int a;

    public Tool (int a) {
        this.a = a;
    }

    public static int Add (int a, int b){
        return a+b;
    } 
}

public class exLambda {
    public static void main(String[] args){

        // Tool One = new Tool(1);
        // Tool Two = new Tool(2);

        System.out.println(Tool.Add(3,4));
        

    }
    
}
