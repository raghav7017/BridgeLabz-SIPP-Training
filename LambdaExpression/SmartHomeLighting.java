package lambdaproblems;

class SmartLight {
    interface LightAction {
        void activate();
    }

    public void trigger(LightAction action) {
        action.activate();
    }
}

public class SmartHomeLighting {
    public static void main(String[] args) {
        SmartLight light = new SmartLight();

        light.trigger(() -> System.out.println("Motion detected → Lights ON"));
        light.trigger(() -> System.out.println("Evening time → Dim Lights"));
        light.trigger(() -> System.out.println("Voice command → Lights OFF"));
    }
}
