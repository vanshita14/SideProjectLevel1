import java.util.*;
 public class Email{
    String fname;
    String lname;
    String email;
    String dept;
    String pwd;
    int pwdLength=10;
    int mailBoxCapacity=50;
    
     public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String fname=sc.next();
        String lname=sc.next();
        String dept=sc.next();
        Email e1=new Email(fname,lname,dept);
        e1.showInfo();
    }
    
    public Email(String fname, String lname, String dept){
        this.fname=fname;
        this.lname=lname;
        this.dept=dept;
        email=fname+"_"+lname+"@"+dept+".com";
        pwd=generatePwd();
    }
    
    private String generatePwd(){
      String upperCase="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
      String lowerCase="abcdefghijklmnopqrstuvwxyz";
      String numbers="1234567890";
      String specialChar="!@#$";
      String combineChar=upperCase+lowerCase+numbers+specialChar;
      char[] c=new char[pwdLength];
      for(int i=0;i<pwdLength;i++){
          int rand=(int)(Math.random()*combineChar.length());
          c[i]=combineChar.charAt(rand);
      }
      return new String(c);
    }
    
    private String changePwd(String pwd){
        this.pwd=pwd;
        return pwd;
    }
    
    public void showInfo(){
        System.out.println("Name: "+fname+" "+lname);
        System.out.println("Email: "+email);
        System.out.println("MailBox Capacity: "+mailBoxCapacity);
    }
   
}
