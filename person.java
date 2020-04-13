
package hospital.management.system;

public class person {
    
    String name; 
String phone_number ;
    //overload
    public person()
    {
    }
    public person(String name,String phone_number )
    {
       this.name = name;
this.phone_number= phone_number;
    }
    
    public String getname()
    {
        return name;
    }
    public void setname(String name)
    {
         this.name = name;
    }
 public String getphone_number()
    {
        return phone_number;
    }
    public void setphone_number(String phone_number)
    {
         this.phone_number= phone_number;
    }

    
    
   public void whoyouare()
    {
       System.out.println(" Name:"+ this.getname()+"Phone Number:"+this.getphone_number() );
    }
    
    
} 
