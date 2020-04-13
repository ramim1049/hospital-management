
package hospital.management.system;

import java.io.PrintStream;

public class doctor extends person{
     private int doctor_ID;
      private String Dept;
 private String Location; 
    private String dept;
public doctor()
{}
  public doctor(int doctor_ID, String Dept,String Location)
    {
     super(name,phone_number);   
    this.doctor_ID=doctor_ID;
this.dept=dept;
this.location =location ;
    }
  
    public int getdoctor_ID()
    {
        return  doctor_ID;
    }
    public void setdoctor_ID(int  doctor_ID)
    {
         this.doctor_ID =  doctor_ID;
    }
    
      public String getDept()
    {
        return  Dept;
    }
    public void setDept(String Dept)
    {
         this.Dept =Dept;
    }
    
       public String getLocation()
    {
        return  Location;
    }
    public void setLocation(String Location)
    {
         this.Location =Location;
    }
    public String prescribeMeds()
    {
        return null;
    }
    public String CheakReports()
    {
        return null;
    }
    public String prescribeTest()
    {
        return null;
    }
    public String DrawSalary()
    {
        return null;
    }
   public void Display()
{ 
         PrintStream println = System.out.println("Member Name:"+ this.name+"\ndoctor_ID:"+ this.doctor_ID+"\nDepertment:"+ this.dept+"\nLocation:"+this.Location);
}
}
