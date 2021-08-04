abstract class Bird {
    void Flap() {
        System.out.println("hi");
    }
}

class App extends Bird {
    // void Flap() {
    // }
    public static void main(String[] args) throws Exception {
        App app = new App();
        app.Flap();
        // System.out.println("Hello, World!");
    }
}
