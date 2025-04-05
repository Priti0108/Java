/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hierarcy;

/**
 *
 * @author priti
 */
public class LivingBeings {
   public String Name;
   public int Age;
   
   LivingBeings(String Name , int age){
       this.Name = Name;
       this.Age = Age;
   }
   public String tostring(){
       return "Name:" + Name + "\nAge:" + Age;
   }
    
}
