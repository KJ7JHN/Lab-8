class Dog{
   String name;
   String breed;
   int age;
   String furColor;
   boolean serviceDog;

// n args objects
   Dog(){
      this.name = "?";
      this.breed = "?";
      this.age = 0;
      this.furColor = "?";
      this.serviceDog = false;
   }

   Dog(String name, String breed, int age, String furColor, boolean serviceDog){
      this.name = name;
      this.breed = breed;
      this.age = age;
      this.furColor = furColor;
      this.serviceDog = serviceDog;
   }
   
// Getters    
   public String get_dog(){
      String info = (name + breed + age + furColor + serviceDog);
      return info;
   }
   public String get_name(String name){return this.name;}
   public String get_breed(String breed){return this.breed;}
   public int get_age(int age){return this.age;}
   public String get_furColor(String furColor){return this.furColor;}
   public boolean get_serviceDog(boolean serviceDog){return this.serviceDog;}

// Setters
   public void set_dog(String name, String breed, 
                       int age, String furColor, 
                       boolean serviceDog){
      name = this.name;
      breed = this.breed;
      age = this.age;
      furColor = this.furColor;
      serviceDog = this.serviceDog;
   }
   public void set_name(String name){this.name = name;}
   public void set_breed(String breed){this.breed = breed;}
   public void set_age(int age){this.age = age;}
   public void set_furColor(String furColor){this.furColor = furColor;}
   public void set_serviceDog(boolean serviceDog){this.serviceDog = serviceDog;}

// toString
   public String toString(){
      return String.format("\nMy name is: %s \nI am a: %s" +
                           "\nI am %s years old. \nMy fur color is: %s" +
                           "\nService dog? %s", this.name, this.breed, 
                            this.age, this.furColor, 
                            this.serviceDog);
   }

// Methods
   public static void speak(){
      System.out.println("bark! bark! bark!");
   }
}

class DogCreator{                                       // DogCreator class
   public static void main(String[] args){              // main class
      Dog dog1 = new Dog();                             // no-arg constructor. 
      Dog dog2 = new Dog("Sally", "Alaskan Klee Kai", 3, "White / Black", true);                // arg constructor
      Dog dog3 = new Dog();                             // no-arg with later set parameters
      dog3.name = "Bert";
      dog3.breed = "Scottish Terrier";
      dog3.age = 1;
      dog3.furColor = "Purple";
      dog3.serviceDog = false;

      System.out.println(dog1.toString());
      dog1.speak();
      System.out.println(dog2.toString());
      dog3.speak();
      System.out.println(dog3.toString());
      dog3.speak();
   }
}
