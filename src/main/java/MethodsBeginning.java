public class MethodsBeginning {
    public static void main(String[] args) {
        //calling non static method from the class, we need to create object of the class
        MethodsBeginning s = new MethodsBeginning();
        String data = s.getData();
        System.out.println(data);
        //calling non static public method from another class, we need to create object of the class
        MethodsBeginning2 s2 = new MethodsBeginning2();
        System.out.println(s2.getUserData());
        //calling static method from the class, we don't need to create object of the class
        System.out.println(getData2());
    }
    public String getData() {
        System.out.println("first line");
        return "second line";
    }
    public static String getData2() {
        System.out.println("fifth line");
        return "sixth line";
    }

}
