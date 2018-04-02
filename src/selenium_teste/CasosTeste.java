package selenium_teste;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebElement;


public class CasosTeste {

private WebDriver driver;
private String user_p;
private String pass_p;
private String token_p;
private String messageUser;
private String messageUserAlter;
private String user_np;
private String pass_np;
private String token_np;

	@Before
	public void setUp(){
		
		
		/* Dados do usuário de teste criado com permissão para postar e alterar  
		 * email: jennifer_rtkztdw_huiwitz@tfbnw.net
		 * senha: 123tester456
		 * token: EAAFRP1mFcZCcBAEF1rdER1t983rlDikIwFFpoZBSpEtpY5JgsX1JOCaoNTvRBnqvzoH0X9khGPZBYyTS5tlA2XLf0ZC8PGMiuTVfpL0CuQCYthrXhfQx9bqhXmo32JU1vZBZCw0UN1OKTJb1z9qiOZBpCbytz9HnEFkGSJQyh3xbnpnhxlaL52ERsqiDx4cHnVGMxGY7syLd3x3dVrrgTI3kuGGc9rZADgDepynuPcLqiwZDZD
		 * 
		 * email: carol_xhfmwas_yangsen@tfbnw.net
		 * senha: 123teste456
		 * token: EAAFRP1mFcZCcBANpFZB66ZACZCCkjyoUzwhafbcVvO23QKgG3S587gmZAZB0RxXEfVyrf44AzzI3INVWYYlifZBYBNOuOgCFU7iutNJ162v0FZCgmIqpfAC0SLIFVjZB18XtrlW2qSs39hYN77y4KXd3p3bl2KZBOZCQhDpVrjCLC2qs2d9vRuP4szBU9ByrAvfoke9YfyaYzLE9QqRZCJRf8ZCHaq6phFD9IJmXPZAUf86mmIwAZDZD
		 *
		 */
		
		System.setProperty("webdriver.gecko.driver", "C://geckodriver//geckodriver.exe");
		      
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		setUser_p("jennifer_rtkztdw_huiwitz@tfbnw.net");
		setPass_p("123tester456");
		setToken_p("EAAFRP1mFcZCcBAEF1rdER1t983rlDikIwFFpoZBSpEtpY5JgsX1JOCaoNTvRBnqvzoH0X9khGPZBYyTS5tlA2XLf0ZC8PGMiuTVfpL0CuQCYthrXhfQx9bqhXmo32JU1vZBZCw0UN1OKTJb1z9qiOZBpCbytz9HnEFkGSJQyh3xbnpnhxlaL52ERsqiDx4cHnVGMxGY7syLd3x3dVrrgTI3kuGGc9rZADgDepynuPcLqiwZDZD");
		
		setMessageUser("Hello, Marina!");
		setMessageUserAlter("Oi, pessoas!");
		
	}
	
	@Test
	public void ct1(){
		
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys(getUser_p());
		
		WebElement password = driver.findElement(By.id("pass"));
		password.sendKeys(getPass_p());
		
		WebElement btn_login = driver.findElement(By.id("loginbutton"));
		btn_login.click();
			
	}
	
	@Test
	public void ct2(){
		
		WebElement email = driver.findElement(By.id("email"));
		email.clear();
		email.sendKeys("teste_123_not_cadas@tfbnw.net");
		
		WebElement password = driver.findElement(By.id("pass"));
		password.clear();
		password.sendKeys("123456");
		
		WebElement btn_login = driver.findElement(By.id("loginbutton"));
		btn_login.click();
		 
			
	}
	
	@Test
	public void ct3(){
		
		WebElement email = driver.findElement(By.id("email"));
		email.clear();
		email.sendKeys(getUser_p());
		
		WebElement password = driver.findElement(By.id("pass"));
		password.clear();
		password.sendKeys("123456");
		
		WebElement btn_login = driver.findElement(By.id("loginbutton"));
		btn_login.click();
	}
	
	@Test
	public void ct4(){
		
		WebElement email = driver.findElement(By.id("email"));
		email.clear();
		email.sendKeys();
		
		WebElement password = driver.findElement(By.id("pass"));
		password.clear();
		password.sendKeys();
		
		WebElement btn_login = driver.findElement(By.id("loginbutton"));
		btn_login.click();
		 	
	}
	
	@Test
	public void ct5(){
		
		//pré condição - login ser realizado com sucesso
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys(getUser_p());
		
		WebElement password = driver.findElement(By.id("pass"));
		password.sendKeys(getPass_p());
		
		WebElement btn_login = driver.findElement(By.id("loginbutton"));
		btn_login.click();
		
		WebElement navFeedNot = driver.findElement(By.id("navItem_4748854339"));
		navFeedNot.click();
		
		WebElement status =driver.findElement(By.xpath("//textarea[@name='xhpc_message']"));
		status.sendKeys(getMessageUser());
		
		WebElement pageletComposer = driver.findElement(By.id("pagelet_composer"));
		pageletComposer.click();
		
		WebDriverWait wait = new WebDriverWait(driver,30);
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Publicar']"))).click();
	
	}
	
	@Test
	public void ct6(){
		
		//pré condição - login ser realizado com sucesso
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys(getUser_p());
		
		WebElement password = driver.findElement(By.id("pass"));
		password.sendKeys(getPass_p());
		
		WebElement btn_login = driver.findElement(By.id("loginbutton"));
		btn_login.click();
		
		WebElement navFeedNot = driver.findElement(By.id("navItem_4748854339"));
		navFeedNot.click();
		
		WebElement status =driver.findElement(By.xpath("//textarea[@name='xhpc_message']"));
		status.sendKeys(getMessageUser());
		
		WebElement pageletComposer = driver.findElement(By.id("pagelet_composer"));
		pageletComposer.click();
		
		WebDriverWait wait = new WebDriverWait(driver,30);
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Publicar']"))).click();
	
	}
	
	@Test
	public void ct7(){
		
		//pré condição - login ser realizado com sucesso
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys(getUser_p());
		
		WebElement password = driver.findElement(By.id("pass"));
		password.sendKeys(getPass_p());
		
		WebElement btn_login = driver.findElement(By.id("loginbutton"));
		btn_login.click();
		
		WebElement navFeedNot = driver.findElement(By.id("navItem_4748854339"));
		navFeedNot.click();
		
		WebElement bntEdit = driver.findElement(By.id("u_ps_jsonp_2_0_d"));
		bntEdit.click();
		
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Editar publicação']"))).click();
		
		 
				
		WebElement postEdit = driver.findElement(By.xpath("//span[text()='"+getMessageUser()+"']")); 
		((JavascriptExecutor)driver).executeScript("arguments[0].innerText ='"+getMessageUserAlter()+"'", postEdit);
		
		
		
		WebElement btnSalvar =driver.findElement(By.xpath("//span[text()='Salvar']"));
		btnSalvar.click();

	}
	
	
	@After
	public void fecharPagina(){
		driver.quit();
	}


	public String getMessageUser() {
		return messageUser;
	}

	public void setMessageUser(String messageUser) {
		this.messageUser = messageUser;
	}
	
	public String getUser_p() {
		return user_p;
	}
	
	public void setUser_p(String user_p) {
		this.user_p = user_p;
	}

	public String getPass_p() {
		return pass_p;
	}

	public void setPass_p(String pass_p) {
		this.pass_p = pass_p;
	}

	public String getToken_p() {
		return token_p;
	}

	public void setToken_p(String token_p) {
		this.token_p = token_p;
	}

	public String getMessageUserAlter() {
		return messageUserAlter;
	}

	public void setMessageUserAlter(String messageUserAlter) {
		this.messageUserAlter = messageUserAlter;
	}

	public String getUser_np() {
		return user_np;
	}

	public void setUser_np(String user_np) {
		this.user_np = user_np;
	}

	public String getPass_np() {
		return pass_np;
	}

	public void setPass_np(String pass_np) {
		this.pass_np = pass_np;
	}

	public String getToken_np() {
		return token_np;
	}

	public void setToken_np(String token_np) {
		this.token_np = token_np;
	}

}
