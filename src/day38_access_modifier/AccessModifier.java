package day38_access_modifier;

public class AccessModifier {

    //public: Can be reached anywhere from the project
    public static String publicStr = "Public string in the project";

    // if a variable is not static, It becomes non-static variable ( Instance variable ( object variable))
    // if we want to reach this variable, we need to create an object from the class itself
    public String publicNonStaticStr = "Public non-static string in the project";

    //Private:It can be called and used only in same class. It wont be accessible from any otherclass or package in
    //         the project (( prived to this class))
    private static String privateStr = "Private string in the project";


    //default:if you don't add any access modifiers, java will accept it as a default access modifier
    //    this data can be reach from the same package, not from anywhere else
    static String defaultStr =" this one is default";

    //protected: it is very similar to default. It can be used in same package and child of the classes from the same package
    protected static String protectedStr =" this one is protected";


    public static void main(String[] args) {
        System.out.println(publicStr);
        System.out.println(privateStr);
        System.out.println(defaultStr);
        System.out.println(protectedStr);
    }


}
