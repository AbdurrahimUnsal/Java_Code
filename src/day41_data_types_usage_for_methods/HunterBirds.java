package day41_data_types_usage_for_methods;

public class HunterBirds extends Birds{
    public void  move(){
        System.out.println("they fly");
    }
    public  void nutrition(){
        System.out.println("eats meat");
    }
    public  void claw(){
        System.out.println("clawed");
    }
    public  void beak(){
        System.out.println("pointed beak");
    }

    public static void main(String[] args) {


        HunterBirds hunterEagle = new HunterBirds();
        //data type is HunterBirds

        hunterEagle.move();  //they fly
        hunterEagle.nutrition();  //eats meat
        hunterEagle.claw();  //clawed
        hunterEagle.beak();  //pointed beak

        hunterEagle.wing();  // they are winged
        hunterEagle.respiration();  // they breathe with lungs
        hunterEagle.beak();  // pointed beak
        hunterEagle.multiply();  // they multiply with eggs

        hunterEagle.life(); // they live and die

        System.out.println("=================================");

        Birds birdEagle = new HunterBirds();
        //data type is Birds

        birdEagle.move();  //they fly
        birdEagle.nutrition();  //eats meat
        // birdEagle.claw();  //CTE
        birdEagle.beak();  //pointed beak

        birdEagle.wing();  // they are winged
        birdEagle.respiration();  // they breathe with lungs
        birdEagle.beak();  // pointed beak
        birdEagle.multiply();  // they multiply with eggs

        birdEagle.life(); // they live and die

        System.out.println("=======================");

        AnimalKingdom animalEagle = new HunterBirds();
        // data type is AnimalKingdom

        animalEagle.move();  //they fly // comes from HunterBirds
        animalEagle.nutrition();  //eats meat //comes from HunterBirds
        // animalEagle.claw();  // CTE
        //animalEagle.beak();  //CTE
        // animalEagle.wing();  // CTE
        animalEagle.respiration();  // they breathe with lungs // comes from Birds
        animalEagle.multiply();  // they multiply with eggs // comes from Birds
        animalEagle.life(); // they live and die // comes from AnimalKingdom


        AnimalKingdom animalEagleBird = new Birds();
        animalEagleBird.move(); //  they move // comes from animal Kingdom

        /*
        when we create an object by using same class data type and constructor
        for variables and methods we take the first one
        if data type and the constructor are from different classes
        for variables:
         ** go to data type class, then take the first one you see by following
         parent child relations (you can not check child classes)
         for methods
         ** go to the data type, try to find the method, if you can not find it
         in data type class follow parent child relations. If you can not find
         it, it will be CTE
         if we can find it, we should check if it is overridden. If it is
         we will take the most updated one
         But there are limits, we can only reach methods from constructor class
         to data type class
         */
        /* when we create an object from diffent classes in the family,
        everything will happen between the constructor and the datatype
         */




    }
}
