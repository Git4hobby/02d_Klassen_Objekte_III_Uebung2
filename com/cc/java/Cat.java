package com.cc.java;

public class Cat {

    private String firstName;
    private String furColor;
    private int age;
    private boolean isFemale;

    private int counter;

    // constructor
    public Cat(String firstName, String furColor, int age, boolean isFemale) {
        this.firstName = firstName;
        this.furColor = furColor;
        this.age = age;
        this.isFemale = isFemale;
    }

    /** Getter */
    public String getStringAttributes(String op) {
      switch (op) {
        case "#name":
            return firstName;
        case "#color":
            return furColor;
        default:
            return "ERROR";
      }
    }

    public String getAge() {
        if (isFemale) {
            return checkCompliance();
            
        } else {
            return Integer.toString(age);
        }
     }

    // Switch Counter
     private String checkCompliance(){

        counter++;    

        switch (counter) {
            case 1:
                return "This is an inappropriate question!";  // 1st time 
            
            case 2:
                return "I'v told you once!"; // 2nd time
            
            case 3:
                return "Talk to the hand!"; // 3rd time
            
            default:
                return "Wie oft noch du Hund!"; // 4th time++
                
        }



     }
  


}
