package examplePerson;

public class PersonalGreet {
    public static void main(String[] args){
        Person gayeong = new Person("가영", 25);
        Person jinbae = new Person("진배", 27);
        Person seoa = new Person("서아",4);

        seoa.personalizedGreeting();
        gayeong.personalizedGreeting();
    }
}
