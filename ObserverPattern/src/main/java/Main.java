/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author trez_
 */
public class Main {
    
    public static void main(String[] args) {
        //Create the zoo to store animals
        
        Zoo zoo = new Zoo();
        
//        //Register a listener to be notified when an animal is addded
//        zoo.registerAnimalAddedListener(new PrintNameAnimalAddedListener());
//        zoo.registerAnimalAddedListener(new CountingAnimalAddedListener());
        //Register a listener to be notified when an animal is addded
        AnimalAddedListener listener = zoo.registerAnimalAddedListener(
                (animal) -> System.out.println("Added a new animal with name: " + animal.getName() + " ") 
        );
        

        // Add an animal notify the registered listeners
        zoo.addAnimal(new Animal("Tiger"));
        zoo.addAnimal(new Animal("Elephant"));
        zoo.addAnimal(new Animal("Whale"));
        
        //Unregister the listener
        zoo.unregisterAnimalAddedListener(listener);
        
        //Add animal, which will not print the name, since it's not registered
        zoo.addAnimal(new Animal("Lion"));
        
    }
}
