package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import static org.junit.Assert.assertEquals;
import static utils.Utils.*;

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

	@FindBy(id = "//option[text()='Enabled']")
	private WebElement campoStatus;

	@FindBy(id = "systemUser_password")
	private WebElement campoPassWord;

	@FindBy(id = "systemUser_confirmPassword")
	private WebElement campoConfirmPassword;

	@FindBy(id = "btnSave")
	private WebElement botaoSave;

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

	public void validarCadastroUsuarioComSucesso(String alerta) {
		assertEquals(alerta, driver.findElement(By.xpath("//*[contains(text(), '" + alerta + "')]")).isDisplayed());

	}

}
