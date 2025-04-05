/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hierarcy;

/**
 *
 * @author priti
 */
 class Plants extends LivingBeings{
     public String Kind;
    
     Plants(String Name, int Age, String Kind){
         super(Name,Age);
         this.Kind = Kind;
         
     }
     public String tostring(){
        return "Name:" + Name + "\nAge:" + Age + "\nKind of a Plant:" + Kind;
     }
}
