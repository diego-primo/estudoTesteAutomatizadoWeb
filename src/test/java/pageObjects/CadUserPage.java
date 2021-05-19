package pageObjects;

import static org.junit.Assert.assertEquals;
import static utils.Utils.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class CadUserPage {

	Actions acaoMouse = new Actions(driver);

	// Mapeamento dos elementos das páginas, no padrão pageFactory

	@FindBy(id = "menu_admin_viewAdminModule")
	private WebElement abaAdmin;

	@FindBy(id = "menu_admin_UserManagement")
	private WebElement abaUserManangement;

	@FindBy(id = "menu_admin_viewSystemUsers")
	private WebElement abaUser;

	@FindBy(id = "btnAdd")
	private WebElement botaoAdd;

	@FindBy(xpath = "//option[@selected]")
	private WebElement campoUserRole;

	@FindBy(id = "systemUser_employeeName_empName")
	private WebElement campoEmployeeName;

	@FindBy(id = "systemUser_userName")
	private WebElement campoUserName;

	@FindBy(xpath = "//option[text()='Enabled']")
	private WebElement campoStatus;

	@FindBy(id = "systemUser_password")
	private WebElement campoPassWord;

	@FindBy(id = "systemUser_confirmPassword")
	private WebElement campoConfirmPassword;

	@FindBy(id = "btnSave")
	private WebElement botaoSave;
	
	@FindBy(id = "btnCancel")
	private WebElement botaoCancelar;
	 
//	##########################################
//	##########################################
//	##########################################

	public void moverMouseAbaAdmin() {
		acaoMouse.moveToElement(abaAdmin).build().perform();
	}

	public void moverMouseAbaUserManagement() {
		acaoMouse.moveToElement(abaUserManangement).build().perform();
	}

	public void moverMouseAbaUserEClick() {
		acaoMouse.moveToElement(abaUser).click().build().perform();

	}

	public void clicarBotaoAdd() {
		botaoAdd.click();
	}

	public void validarCampoUserRole(String campo) {
		assertEquals(campo, campoUserRole.getText());
	}

	public void informarCampoEmployeeName(String empName) {
		campoEmployeeName.sendKeys(empName);
	}

	public void informarCampoUserName(String user) {
		campoUserName.sendKeys(user);
	}

	public void validarCampoStatus(String status) {
		assertEquals(status, campoStatus.getText());
	}

	public void informarPassword(String password) {
		campoPassWord.sendKeys(password);
	}

	public void informarConfirmPassword(String confirmPassword) {
		campoConfirmPassword.sendKeys(confirmPassword);
	}

	public void clicarBotaoSalvar() {
		botaoSave.click();
	}

	public void validarCadastroUsuarioComSucesso(String user) {
		assertEquals(user, driver.findElement(By.xpath("//a[text()='" + user + "']")).getText());

	}

	public void employeeNameNaoExiste(String arg1) {
		assertEquals(arg1, driver.findElement(By.xpath("//span[text()='Employee does not exist']")).getText());

	}

	public void userNameRequerido(String string) {
		assertEquals(string, driver.findElement(By.xpath("//span[@for='systemUser_userName']")).getText());

	}

	public void passwordRequerido(String string) {
		assertEquals(string, driver.findElement(By.xpath("//span[@for='systemUser_password']")).getText());

	}
	
	public void clicarBotaoCancelar() {
		botaoCancelar.click();
	}

}
