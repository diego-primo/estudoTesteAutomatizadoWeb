package stepsDefinitions;

import static utils.Utils.*;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

	@Before
	public void setUp() {
		acessarNavegador();
	}

	@After
	public void tearDown() {
		fecharNavegador();
	}
}
