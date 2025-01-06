package Day2;

public class Javatest {
    static boolean odo;
    public static void main(String[] args){
        System.out.println("냥냥냥");
        
        // int a = add(1,2);
        // System.out.print(a);
        System.out.println(add(2,4));

        DataType();

        System.out.print(odo);
    }
    
    public static void DataType(){
        byte byteValue = 10;
        short shortValue = 1000;
        int intValue = 100000;
        long longValue = 10000000000L;

        System.out.println("byte    : " + byteValue);
        System.out.println("short   : " + shortValue);
        System.out.println("int     : " + intValue);
        System.out.println("long    : " + longValue);
    }

    public static Integer add(int a,int b){
        return a+b;
    } 
}