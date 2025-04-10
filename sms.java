class Student{
  private String name;
  private String branch;
  private String type;
  private int year;
  private String regno;
    static int count = 1;
  
    Student(String name,String branch,int year,String type){
      this.name = name;
      this.branch = branch;
      this.year = year;
     
     
      this.type = type;
      }
    public String toString(){
      return "Name: " + name + "\nBranch: " + branch + "\nYear Of Study: " + year + "\nType Of Student: " + type;
      
    }
    public String regularRegno(){
     
      String r = " ";
      if(branch.equals("IT") && year ==2023){
        String i = String.format("%03d",count);
        r = year + "BIT" + i;
        count ++;
      }
       return r;
    }
    public String DsyRegno(){
     
      String r = " ";
      if(branch.equals("IT")&& year == 2024){
        String i = String.format("%02d",count);
        r = year + "BIT" + "5" + i;
        count ++;
        }
      return r;  
      
    }
    
    
   }   


class RegularStudents extends Student{
  RegularStudents(String name , String branch,int year, String type){
    super(name,branch,year,type);
    }
    public String toString(){
      return super.toString() + "\nRegistration no: " + regularRegno();
    }
    
}

class DsyStudents extends Student{
  DsyStudents(String name , String branch,int year, String type){
    super(name,branch,year,type);
    }
     public String toString(){
      return super.toString() + "\nRegistration no: " + DsyRegno();
    }
    
  

}

class sms{
  public static void main(String[]args){
    int counter = 0;
    for(int i = 1 ; i<=args.length/4 ; i++){
      String name = args[counter++];
      String branch = args[counter++];
      String type = args[counter++];
      int year = Integer.parseInt(args[counter++]);
      
      System.out.println("*********************");
      
      if(year == 2023){
         RegularStudents Regular = new  RegularStudents(name , branch ,year , type );
         System.out.println(Regular);
      }else{
        DsyStudents Dsy = new DsyStudents(name , branch , year , type);
        System.out.println(Dsy);
      }
      
    }
  }

}
