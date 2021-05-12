package stepsDefinitions;

import static utils.Utils.*;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import pageObjects.LoginPage;

public class Hooks {

	@Before
	public void acesarSiteJaLogado() {
		acessarNavegador();
		Na(LoginPage.class).realizarLogin("Admin", "admin123");
	}
	
	@Before(value = "@login")
	public void acesarPaginaLogin() {
		acessarNavegador();
	}

	@After
	public void tearDown() {
		//fecharNavegador();
	}
}
