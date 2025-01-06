package examplePerson;

public class CompareAge {
    public static void main(String[] args){
        Person gayeong = new Person("가영", 25);
        Person jinbae = new Person("진배", 27);
        Person Miyeong = new Person("미영",23);

        gayeong.compareAge(jinbae);
        jinbae.compareAge(gayeong);
        gayeong.compareAge(Miyeong);
    }
}
