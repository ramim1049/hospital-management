
package hospital.management.system;

public class patient extends person{
     private int patient_ID;
      private String Address;
        private int Age;
       private String Sex;
       private int Room_No;
    private boolean Location;
public patient()
{}
  public patient(int patient_ID, String Address,int Age,String Sex,int Room_No)
    {
     super(name,phone_number);   
    this.patient_ID=patient_ID;
this.Address=Address;
this.Age =Age ;
this.Sex=Sex;
this.Room_No=Room_No;
    }
  
    public int getpatient_ID()
    {
        return  patient_ID;
    }
    public void setpatient_ID(int  patient_ID)
    {
         this.patient_ID =  patient_ID;
    }
    
      public String getAddress()
    {
        return  Address;
    }
    public void setAddress(String Address)
    {
         this.Address =Address;
    }
    
       public int getAge()
    {
        return  Age;
    }
    public void setAge(int Age)
    {
         this.Age =Age;
    }
      public String getSex()
    {
        return  Sex;
    }
    public void setSex(String Sex)
    {
         this.Sex =Sex;
    }
      public int getRoom_No()
    {
        int  Room_NO;
         return 0;
    }
    public void setRoom_No(int Room_NO)
    {
         this.Room_No =Room_No;
    }
    public String paybills()
    {
        return null;
    }
    
   public void Display()
{ 
 System.out.println("Member Name:"+ this.name+"\npatient_ID:"+ this.patient_ID+"\nAddress:"+ this.Address+"\nAge:"+this.Age+"\nSex:"+this.Sex+"\nRoom_No:"+this.Room_No);
}
}
