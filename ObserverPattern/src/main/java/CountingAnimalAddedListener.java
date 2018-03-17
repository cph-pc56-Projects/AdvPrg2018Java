/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author trez_
 */
public class CountingAnimalAddedListener implements AnimalAddedListener {
    
    private static int animalAddedCount = 0;

    @Override
    public void updateAnimalAdded(Animal animal) {
        //Increment the number of animals
        animalAddedCount++;
        
        //Print the number of animals
        System.out.println("Total animals added: " + animalAddedCount);
    }
}
