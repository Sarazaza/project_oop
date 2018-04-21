/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main_car;

/**
 *
 * @author User
 */
public class motor {
     public void show();
    int getPrice(int num,int price){
    for(int i=0;i<=w;i++){
        switch(num)
            case 1: System.out.println("Fino 115 cc.");
                    price =price+150; break;
            case 2: System.out.println("Fino 125 cc.");
                    price=price+160; break;
            case 3: System.out.println("Gt 125 cc.");
                    price=price+160; break;
            case 4: System.out.println("Filano ");
                    price=price+150; break;
            case 5: System.out.println("Click 125i");
                    price=price+160; break;
            case 6: System.out.println("Zoomer-x ");
                    price=price+160; break;
    }
        return price;
}
