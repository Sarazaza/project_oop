package main_car;

import java.util.Scanner;

class ch_car extends rent {

public void greeting(){
    System.out.println("---------1.Motorcycle---------");
    
}

public void brand(){
    this.greeting();
    Scanner input = new Scanner(System.in);
    int w;
    int num;
    int price;
    System.out.println("How many do you want to for rent?");
    System.out.println("Amount : ");
    w = input.nextInt();
    motor m=new motor();
    for(int i=1;i<=w;i++){
        m.show();
    }
    
   
}
public void greeting1(){
      System.out.print("1.Car");
      
    }
public void brand1(){
    this.greeting1();
    
}
}

  
    