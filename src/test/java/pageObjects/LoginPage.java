package pageObjects;

import static org.junit.Assert.assertEquals;
import static utils.Utils.driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

//	Mapeamento dos elementos das páginas, no padrão pageFactory	

	@FindBy(name = "txtUsername")
	private WebElement campoUsuario;

	@FindBy(name = "txtPassword")
	private WebElement campoSenha;

	@FindBy(name = "Submit")
	private WebElement botaoLogin;

	@FindBy(linkText = "Forgot your password?")
	private WebElement linkRecuperaSenha;

	@FindBy(id = "securityAuthentication_userName")
	private WebElement campoinfoUserRecuperaSenha;

	@FindBy(id = "btnSearchValues")
	private WebElement botaoRecuperaSenha;
	
	@FindBy(id = "btnCancel")
	private WebElement botaoVoltar;

//	###################################
//	###################################
//	###################################
//	###################################


	public void validacaoTelaLogin() {
		assertEquals("LOGIN Panel", driver.findElement(By.id("logInPanelHeading")).getText());
	}

	public void informarCampoUsuario(String usuario) {
		campoUsuario.sendKeys(usuario);
	}

	public void informarCampoSenha(String password) {
		campoSenha.sendKeys(password);
	}

	public void clicarBotaoLogin() {
		botaoLogin.click();
	}

	public void clicarBotaoRecuperaSenha() {
		botaoRecuperaSenha.click();
	}

	public void informarCampoRecuperaSenha(String usuario) {
		campoinfoUserRecuperaSenha.sendKeys(usuario);
	}

	public void realizarLogin(String usuario, String password) {
		informarCampoUsuario(usuario);
		campoSenha.sendKeys(password);
		botaoLogin.click();

	}

	public void credenciaisInvalidas(String credenciais) {
		assertEquals(credenciais, driver.findElement(By.id("spanMessage")).getText());
	}

	public void loginComCamposUsernameEPasswordVazios(String msg) {
		assertEquals(msg, driver.findElement(By.id("spanMessage")).getText());
	}

	public void loginComCampoPasswordVazio(String alerta) {
		assertEquals(alerta, driver.findElement(By.id("spanMessage")).getText());
	}

	public void recuperarSenha() {
		linkRecuperaSenha.click();

	}

	public void validaPaginaAlterarSenha(String validaPagina) {
		assertEquals(validaPagina, driver.findElement(By.xpath("//h1[text()='Forgot Your Password?']")).getText());
	}

	public void botaoVoltar() {
		botaoVoltar.click();
		
	}
}
