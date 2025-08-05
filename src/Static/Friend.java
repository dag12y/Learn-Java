package Static;

public class Friend {
    static int numofFriends;
    String name;

    Friend(String name){
        this.name=name;
        numofFriends++;
    }
    static void showFriends(){
        System.out.println("You have "+numofFriends+" total friends.");
    }
}
