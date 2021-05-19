package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import static org.junit.Assert.assertEquals;
import static utils.Utils.*;

public class JobsPage {

	Actions act = new Actions(driver);

	@FindBy(id = "menu_admin_viewAdminModule")
	private WebElement admin;

	@FindBy(linkText = "Job")
	private WebElement Job;

	@FindBy(linkText = "Job Titles")
	private WebElement JobTitle;

	@FindBy(name = "btnAdd")
	private WebElement botaoAdd;

	@FindBy(id = "jobTitle_jobTitle")
	private WebElement campoJobTitle;

	@FindBy(id = "jobTitle_jobDescription")
	private WebElement campoJobDescription;

	@FindBy(id = "jobTitle_note")
	private WebElement campoNote;

	@FindBy(name = "btnSave")
	private WebElement botaoSave;
	
	@FindBy(name = "btnCancel")
	private WebElement botaoCancelar;

//###########################################################################
//###########################################################################
//###########################################################################

	public void moverMouseAbaAdmin() {
		act.moveToElement(admin).build().perform();
	}

	public void moverMouseAbaJob() {
		act.moveToElement(Job).build().perform();
	}

	public void moverMouseAbaJobTitlesEClicla() {
		act.moveToElement(JobTitle).click().build().perform();
	}

	public void clicarBotaoAdd() {
		botaoAdd.click();
	}

	public void informarCampoJobTitle(String jobTitle) {
		campoJobTitle.sendKeys(jobTitle);
	}

	public void informarCampoJobDescription(String jobDescription) {
		campoJobDescription.sendKeys(jobDescription);
	}

	public void informarCampoNote(String note) {
		campoNote.sendKeys(note);
	}

	public void clicarBotaoSave() {
		botaoSave.click();
	}

	public void confirmarNomeJobNaLista(String valida) {
		assertEquals(valida, driver.findElement(By.linkText("QA Test")).getText());
	}

	public void validaJobJaCadastrado(String alerta) {
		assertEquals(alerta, driver.findElement(By.xpath("//span[text()='Already exists']")).getText());

	}
	
	public void clicarBotaoCancelar() {
		botaoCancelar.click();
	}

	public void campoObrigatorio(String arg1) {
		assertEquals(arg1, driver.findElement(By.xpath("//span[text()='Required']")).getText());
		
	}

}
