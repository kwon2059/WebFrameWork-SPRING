package kr.ac.hansung.cse.animals;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class PetOwner {

    @Qualifier("qf-cat")
    @Autowired // wiring by type
    AnimalType animal;

//    public PetOwner(AnimalType animal) {
//        this.animal = animal;
//    }

    public void play(){
        animal.sound();
    }
}
