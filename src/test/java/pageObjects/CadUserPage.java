package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CadUserPage {

	
//	Mapeamento dos elementos das páginas, no padrão pageFactory	

	@FindBy(name = "txtUsername")
	private WebElement campoUsuario;
}
