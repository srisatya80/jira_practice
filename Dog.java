package com.example.oops;

public class Dog {
    private String breed; //Instance variable
    private   int size; //Instance Variable
    private String color; //Instance Variable
    //Getter and Setter Method
    public String getBreed(){//Getter
        return breed;
    }
    public void setBreed(String breed){//Setter
        this.breed=breed;
    }

    public int getSize() {//Getter
        return size;
    }

    public void setSize(int size) {//Setter
        this.size = size;
    }

    public String getColor() {//Getter
        return color;
    }

    public void setColor(String color) {//Setter
        this.color = color;
    }
    /*   public Dog(){//Default Constructor
        System.out.println("Default Constructor is Triggerred.....");
    }
    public Dog(String name,int dogSize,String colorName){
        System.out.println("Parameterized Constructor is Triggerred....");
        breed=name;
        size=dogSize;
        color=colorName;
    }
    public void bark(){
        System.out.println("Wooh!.. Wooh!");
    }
    public void run(){
        System.out.println("I am "+breed+" I am Running");
    }
    public void loyal(){
        System.out.println("And i am very loyal.");

    }

  */
}
