package CommonLibraries;

public class ForgotPwdLocators {
    
	protected static String NotRegisteredEmailValidation1;
	protected static String NotRegisteredEmailValidation2;
	
	public String ForgotPwd_CancelLocator(){
		
		String Cancel_forgotpwd=".//*[@id='content']/div[2]/div/div[2]/div/div[2]/div/form/div[3]/button";
		return Cancel_forgotpwd;
	}
	
	public String ForgotyourPwdlink(){
		
		String ForgotyourPwdlink=".//*[@id='content']/div[2]/div/div[2]/div[2]/div/form/div[5]/a";
		return ForgotyourPwdlink;
	}
	
	public String Emailfield_ForgotPwdLocator(){
		
		String EmailfieldLocator=".//*[@id='content']/div[2]/div/div[2]/div/div[2]/div/form/div[1]/input";
	return EmailfieldLocator;
	}
	
	public String ResetBtnLocator_ForgotPwd(){
		
		String ResetbtnLocator=".//*[@id='content']/div[2]/div/div[2]/div/div[2]/div/form/div[2]/button";
		return ResetbtnLocator;
	}
	
	public String Loginherelocator_ForgotPwd(){
		
		String LoginhereLocator=".//*[@id='content']/div[2]/div/div[2]/div/div[1]/button";
		return LoginhereLocator;
	}
	
	public String ResetMessage_Locator(){
		
		String ResetMessage=".//*[@id='content']/div[2]/div/div[2]/div/span";
		return ResetMessage;
	}
	
	public String EmptyEmailfieldvalidLocator_ForgotPwd(){
		
		String EmptyEmailfield=".//*[@id='content']/div[2]/div/div[2]/div/div[2]/div/form/div[1]/span";
		return EmptyEmailfield;
	}
	
	public String NotRegisteredEmailValidLocator_ForgotPwd(){
		
		NotRegisteredEmailValidation1=".//*[@id='content']/div[2]/div/div[2]/div/span";
		return NotRegisteredEmailValidation1;
	
		}
	
	public String NotRegisteredEmailValidotherLocator_ForgotPwd(){
		
		NotRegisteredEmailValidation2=".//*[@id='content']/div[2]/div/div[2]/div/div[2]/span";
		return NotRegisteredEmailValidation2;
	}
	
	public String DefaultMessageDisplayedLocator_ForgotPassword(){
		String DefaultMessageDisplayedloc=".//*[@id='content']/div[2]/div/div[2]/div/div[2]/span";
		return DefaultMessageDisplayedloc;
	}
	
	public String Zoom2uimgAvailable_ForgotPassword(){
		String Zoom2uimgLocator=".//*[@id='content']/div[2]/div/div[1]/div/a/img";
		return Zoom2uimgLocator;
	}
}
