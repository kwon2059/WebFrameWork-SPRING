package kr.ac.hansung.cse.animals;

public class Dog implements AnimalType{
    String myName;

    public void setMyName(String myName) {
        this.myName = myName;
    }

    @Override
    public void sound() {
        System.out.println("Dog name = " + myName + " : WalWal");
    }
}
