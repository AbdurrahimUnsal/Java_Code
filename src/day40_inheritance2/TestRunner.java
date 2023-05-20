package day40_inheritance2;

public class TestRunner {
    public static void main(String[] args) {

        C03_Child childObj = new C03_Child();

        System.out.println(childObj.grandParentStr);//This is grandparent string
        System.out.println(childObj.grandParentInt);//70
        childObj.granParentMethod();//This grandparent method


        System.out.println(childObj.parentStr);//This is parent string
        System.out.println(childObj.parentInt);//40
        childObj.parentMethod();//This parent method

        System.out.println(childObj.childStr);//This is child string
        System.out.println(childObj.childInt);//10
        childObj.childMethod();//This child method




    }
}
