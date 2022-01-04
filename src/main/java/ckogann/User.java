package ckogann;

public class User {
    String name;
    int age;
    boolean doYouLikeYourPhone;

    public void isMyPhoneGood() {
        System.out.println("Do you like this smartphone? - " + doYouLikeYourPhone);
    }
    public void whoIsOwner() {
        System.out.println("Owner: " + name + ", " + age);
    }
}