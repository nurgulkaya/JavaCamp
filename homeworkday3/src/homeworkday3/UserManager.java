package homeworkday3;


public class UserManager {
	
	public void login(User user) {
    	 System.out.println(user.getFirstName()  + user.getLastName()  + " kursa giriş yaptı. ");
        }
	 
        public void logout(User user) {
    	 System.out.println(user.getFirstName()  + user.getLastName() + " kurstan çıktı. ");
        }
     
        public void signup(User user) {
    	 System.out.println(user.getFirstName()  + user.getLastName()  + " kursa kayıt oldu. ");
	}
     
        public void deleteSign(User user) {
    	 System.out.println(user.getFirstName() + user.getLastName() + " kurstan kaydını sildi. ");
        }
    	
 }
