class AccessModifiersExample {

    public int publicVar = 1;
    protected int protectedVar = 2;
    int defaultVar = 3;
    private int privateVar = 4;

    public void publicMethod() {
        System.out.println("Public Method: " + publicVar);
    }

    protected void protectedMethod() {
        System.out.println("Protected Method: " + protectedVar);
    }

    void defaultMethod() {
        System.out.println("Default Method: " + defaultVar);
    }

    private void privateMethod() {
        System.out.println("Private Method: " + privateVar);
    }

    public void accessPrivate() {
        privateMethod(); // Accessing private method within the class
    }

    public static void main(String[] args) {
        AccessModifiersExample obj = new AccessModifiersExample();
        obj.publicMethod();
        obj.protectedMethod();
        obj.defaultMethod();
        obj.accessPrivate();
    }
}
