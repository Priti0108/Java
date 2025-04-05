/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hierarcy;

/**
 *
 * @author priti
 */
 class Animals extends LivingBeings{
      public String Type;
     
     Animals(String Name, int Age , String Type){
         super(Name, Age);
         this.Type = Type;
     }
     public String tostring(){
         return "Name:" + Name + "\nAge:" + Age + "Type of Animal:" + Type;
     }
}
