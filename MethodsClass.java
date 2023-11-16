public class MethodsClass {
    @RepeatCount(repeat = 4)
    public void publicMethod(double number) { System.out.println("Public Method: " + number); }
    @RepeatCount(repeat = 2)
    public void publicMethod() {
        System.out.println("Public Method without parameters ");
    }
    @RepeatCount(repeat = 3)
    protected void protectedMethod(String text) {
        System.out.println("Protected Method: " + text);
    }
    @RepeatCount(repeat = 2)
    private void privateMethod(int value) {
        System.out.println("Private Method: " + value);
    }
}