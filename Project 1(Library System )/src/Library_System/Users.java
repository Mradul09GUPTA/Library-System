package Library_System;

//import java.util.UUID;

public abstract class Users {
   private static int totalUsers=0 ;
   private static int idCounter =0;
   private final String userId;
   private String name;
   private String contactInfo;
   

  private final String generateUniqueId() {
    // TODO Auto-generated method st
    return String.valueOf(idCounter++);
}

   Users(){
    this.userId=generateUniqueId();
    totalUsers++;
   }
 

   public Users(String name ,String contactInfo){
       this.name=name;
       this.contactInfo=contactInfo;
       this.userId=generateUniqueId();
       totalUsers++;
   }
   public Users(Users u){
      
       this.name=u.name;
       this.userId=u.userId;
       this.contactInfo=u.contactInfo;
       totalUsers++;
   }

   public static int getTotalUsers(){
    return totalUsers;
   }

      public String getname(){
      return this.name;
   }
   
   public String getcontactInfo(){
       return this.contactInfo;
   }
    
    public void setname(String name){
         this.name=name;
   }
   
   public void setcontactInfo(String contactInfo){
       this.contactInfo=contactInfo;
   }

abstract void displayDashboard();
abstract boolean canBorrowBooks();


}
