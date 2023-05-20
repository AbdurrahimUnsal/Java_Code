package day34_static_key_word;

public class C02_StaticBlocks {
    C02_StaticBlocks(){
        System.out.println("Constructor is executed");
    }

    public static void main(String[] args) {
        System.out.println("main class is executed");

        System.out.println("==================================");

        C02_StaticBlocks obj = new C02_StaticBlocks();
    }

    //static block is created below. static block is the first one to execute
     /*
        Statick Block
        When class starts running before main method static block is executed. If we want to arrange something before
        main method we should use static blocks
        if there are more than one static block in the class they will be executed according to the order
         */
    static {
        System.out.println("Static block is executed");
    }

    static {
        System.out.println("2. Static block is executed");
    }

    //non-static block is created below
     /*
        Non-Static Block
        Non-static blocks are executed before object creation when we try to create an object
        We use it to arrange a few things before creating an object
         */
    {
        System.out.println("Non-static block is executed");
    }
}
