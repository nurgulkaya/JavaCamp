package homeworkday3;


public class UserManager {
	
	 public void login(User user) {
    	 System.out.println(user.getFirstName()  + user.getLastName()  + " kursa giri� yapt�. ");
	 }
	 
     public void logout(User user) {
    	 System.out.println(user.getFirstName()  + user.getLastName() + " kurstan ��kt�. ");
     }
     
     public void signup(User user) {
    	 System.out.println(user.getFirstName()  + user.getLastName()  + " kursa kay�t oldu. ");
	 }
     
     public void deleteSign(User user) {
    	 System.out.println(user.getFirstName() + user.getLastName() + " kurstan kayd�n� sildi. ");
     }
    
	
 }
