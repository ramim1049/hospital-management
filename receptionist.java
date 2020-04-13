
package hospital.management.system;

public class receptionist extends person{
     private int reception_ID; 
public receptionist()
{}
  public receptionist(int reception_ID)
    {
     super(name,phone_number);   
    this.reception_ID=reception_ID;
    }
  
    public int getreception_ID()
    {
        return  reception_ID;
    }
    public void setreception_ID(int  reception_ID)
    {
         this.reception_ID =  reception_ID;
    }
    
    public String CheakRoomAvalability()
    {
        return null;
    }
    public String BookRoom()
    {
        return null;
    }
    public String GenerateBill()
    {
        return null;
    }
    public String Patient_Details()
    {
        return null;
    }
     public String Draw_Salary()
    {
        return null;
    }
   public void Display()
{ 
 System.out.println("Member Name:"+ this.name+"\nreception_ID:"+ this.reception_ID);
}
}
