class LegacyAPI {
    @Deprecated
    public void oldFeature() {
        System.out.println("Old feature (deprecated)");
    }

    public void newFeature() {
        System.out.println("New feature (use this instead)");
    }
}

public class Exercise2 {
    public static void main(String[] args) {
        LegacyAPI api = new LegacyAPI();
        api.oldFeature();  // Shows warning
        api.newFeature();
    }
}