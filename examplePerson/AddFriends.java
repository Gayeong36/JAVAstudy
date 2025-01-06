package examplePerson;

public class AddFriends {
    public static void main(String[] args) {
        Person gayeong = new Person("가영", 25);
        Person jinbae = new Person("진배",27);
        Person miyeong = new Person("미영", 23);


        gayeong.addFriend(jinbae);
        gayeong.addFriend(miyeong);

        gayeong.showFriends();
    }
}