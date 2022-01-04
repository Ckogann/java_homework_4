package ckogann;

public class Main {

    public static void main(String[] args) {
        Smartphone pixel4 = new Smartphone();
        User kos = new User();

        pixel4.model = "Google Pixel 4";
        pixel4.date = "2019, October 15";
        pixel4.isItTop = true;
        pixel4.size = 5.7;
        pixel4.memory = 64;
        pixel4.smartphoneSpecs();

        kos.name = "Konstantin";
        kos.age = 31;
        kos.doYouLikeYourPhone = true;
        kos.whoIsOwner();
        kos.isMyPhoneGood();
    }
}