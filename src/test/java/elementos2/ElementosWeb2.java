package elementos2;

import org.openqa.selenium.By;

public class ElementosWeb2 {
                                       //eu não gosto de fila
	By btnLogin = By.xpath("//button.[@class='login-button'] ");
	By username = By.xpath("//input[@name='username']");
	By password = By.xpath("//input[@name='password']");
	By btnContinuar = By.xpath("//button[@class='form-button']"); 
	By btnCancelar = By.xpath("//button[@class='form-button secondary-button']"); 
	
	//Elementos abrir conta
	By btnAbrirConta = By.xpath("//button[@class='open-account-button']");
	
	
	
	
}
