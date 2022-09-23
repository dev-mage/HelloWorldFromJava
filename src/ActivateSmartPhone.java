public class ActivateSmartPhone {
    void activate(SmartPhone smartPhone, String model) {
        System.out.println(smartPhone.getClass().getName() + " " + model + " 개통 완료");

    }

    public static void main(String[] args) {
        ActivateSmartPhone activateSmartPhone = new ActivateSmartPhone();

        activateSmartPhone.activate(new IPhone(), "13");
        activateSmartPhone.activate(new Galaxy(), "S22");


    }
}
