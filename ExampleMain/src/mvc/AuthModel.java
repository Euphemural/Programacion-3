package mvc;

public class AuthModel {
	
	public AuthModel() 
	{

	}
	
	public boolean Login(String username, String password) {
		
		if(username == "admin" && password == "0000")
			return true;
		
		return false;
	}

}
