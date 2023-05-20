package day40_inheritance2;

import day44_interfaces.C01_ParentClass;

public class C02_Parent extends C01_Grandparent {
    String parentStr = "This is parent string";
    int parentInt = 40;

    public C02_Parent (){
        super();
        System.out.println("**Parent clas constructor is used");
    }

//    public C02_Parent (String str){
//        super();
//        System.out.println("**Parent clas With STRING parameterconstructor is used" + str);
//    }


    public void parentMethod(){
        System.out.println("This parent method");
    }
}
