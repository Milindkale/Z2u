package CommonLibraries;

public class Login {
	
	
	public String driverpath(){
		
		String driverpath="D://Milind//cc";
		return driverpath;
		
	}
	
	public String emaillocator(){
		String email=".//*[@id='content']/div[2]/div/div[2]/div[2]/div/form/div[1]/input";
		return email;
		
	}
	
	public String pwdlocator(){
		String pwd=".//*[@id='content']/div[2]/div/div[2]/div[2]/div/form/div[2]/input";
		return pwd;
	}
	
	public String loginbtnlocator(){
		String loginbtn=".//*[@id='content']/div[2]/div/div[2]/div[2]/div/form/div[3]/button";
		return loginbtn;
	}
	
	public String logoutlocator(){
		String logout=".//*[@id='nav']/li[3]/a";
		return logout;
	}
	
	public String url(String url){
		
		
		return url;
	}
	
	public String emailvalidation(){
		
		String emailvalidation=".//*[@id='content']/div[2]/div/div[2]/div[2]/div/form/div[1]/span";
		return emailvalidation;
	}
	
	public String passwordvalidation(){
		
		String passwordvalidation=".//*[@id='content']/div[2]/div/div[2]/div[2]/div/form/div[2]/span";
		return passwordvalidation;
	}
	
	public String usernamepasswordvalidation(){
		
		String usernamepasswordvalidation=".//*[@id='content']/div[2]/div/div[2]/div[2]/div/form/span";
		return usernamepasswordvalidation;
	}
	
	public String logoutbtnclassLocator(){
		String logoutclassname="btn logout-button";
		return logoutclassname;
	}
	
	public String alreadyLoggedoutpopup(){
		String AlreadyLoggedoutpopup=".//*[@id='app']/div[1]/div/div/div[2]/button";
		return AlreadyLoggedoutpopup;
	}
	
	public String EmailNotRegisteredValid(){
		
		String EmailNotRegisteredValid=".//*[@id='content']/div[2]/div/div[2]/div[2]/div/form/span";
		return EmailNotRegisteredValid;
	}

}
