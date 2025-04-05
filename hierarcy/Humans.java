/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hierarcy;

/**
 *
 * @author priti
 */
class Humans extends LivingBeings {
    public boolean isVegitarian;
    public boolean isNonvegitarian;
    
    Humans(String Name, int Age , boolean isVegitarian , boolean isNonvegitarian){
        super(Name,Age);
        this.isVegitarian = isVegitarian;
        this.isNonvegitarian = isNonvegitarian;
    }
    public String tostring(){
        return "Name:" + Name + "\nAge:" + Age + "\n isVegitarian" + isVegitarian + "\n isNonvegitarian" + isNonvegitarian;
    }
}

