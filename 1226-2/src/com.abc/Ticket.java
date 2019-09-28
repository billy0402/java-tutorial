/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * @author USER
 */

package com.abc;

public class Ticket implements Payable {
    private String destination;   // 是否折扣房型

    // 建構元(1)
    public Ticket(String destination) {
        this.destination = destination;
    }

    // 建構元(2)
    public Ticket() {
    }

    // setter	
    public void setDestination(String destination) {
        this.destination = destination;
    }

    // getter	
    public String getDestination() {
        return destination;
    }

    // ------------------------------
    // 實作介面的方法	
    // ------------------------------    
    @Override
    public String item() {
        return "交通費";
    }
    // ------------------------------


    // ------------------------------
    // 實作介面的方法	
    // ------------------------------    
    @Override
    public int payment() {
        int price;

        switch (destination) {
            case "台中":
                price = 500;
                break;
            case "台南":
                price = 800;
                break;
            case "高雄":
                price = 1200;
                break;
            default:
                price = 0;
                break;
        }

        return price;
    }
    // ------------------------------    
}