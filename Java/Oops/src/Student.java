interface Student {
    String name();

    int age();
}

abstract class Person implements Student {
    public String name() {
        return "Raghav";
    }
}
