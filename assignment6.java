



class animal {
    public int age;
    public String gender;
    public void isMammal(){
        System.out.println("this is a public method isMammal() from the animal class");
    }
    public void mate(){
        System.out.println("this is a public method mate() from the animal class");
    }
    public static void main(String[] args) {
        animal myAnimal = new animal();
        fish myFish = new fish();
        zebra myZebra= new zebra();
        myAnimal.mate();
        myAnimal.isMammal();
        myZebra.run();
        
    }
}
class fish extends animal{
    private float sizeInFeet;
    private void caneat(){
        System.out.println("This is a private method canEat() from class fish");
        
    }
}
class zebra extends animal{
    public boolean is_wild;
    public void run(){
        System.out.println("this is a public method run() from the zebra class");
    }
}
