abstract class Bird {
    abstract void Flap();
}

class App extends Bird {
    void Flap() {
        System.out.println("hi");
    }
    public static void main(String[] args) throws Exception {
        App app = new App();
        app.Flap();
        // System.out.println("Hello, World!");
    }
}
