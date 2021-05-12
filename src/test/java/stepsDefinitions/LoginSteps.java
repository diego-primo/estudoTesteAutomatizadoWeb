package stepsDefinitions;

import static org.junit.Assert.assertEquals;
import static utils.Utils.Na;
import static utils.Utils.*;

import org.openqa.selenium.By;

import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.LoginPage;

public class LoginSteps {

//	@Dado("que eu estou acessando o sistema")
//	public void queEuEstouAcessandoOSistema() {
////		acessarNavegador();
//	}

	@Quando("na tela de login")
	public void naTelaDeLogin() {
		Na(LoginPage.class).validacaoTelaLogin();
	}

	@Quando("eu informar usuario {string}")
	public void euInformarUsuario(String usuario) {
		Na(LoginPage.class).informarCampoUsuario(usuario);
	}

	@E("informar a senha {string}")
	public void informarASenha(String senha) {
		Na(LoginPage.class).informarCampoSenha(senha);
	}

	@E("^clicar no botao login$")
	public void clicarNoBotaoLogin() throws Throwable {
		Na(LoginPage.class).clicarBotaoLogin();
	}

	@Entao("o sistema apresenta msg de credenciais invalidas {string}")
	public void oSistemaApresentaMsgDeCredenciaisInvalidas(String credenciais) {
		Na(LoginPage.class).credenciaisInvalidas(credenciais);
	}

	@Entao("o sistema apresenta msg de campo Username vazio {string}")
	public void oSistemaApresentaMsgDeCampoUsernameVazio(String string) {
		Na(LoginPage.class).loginComCamposUsernameEPasswordVazios(string);
	}

	@Entao("o sistema apresenta msg de campo Password vazio {string}")
	public void oSistemaApresentaMsgDeCampoPasswordVazio(String string) {
		Na(LoginPage.class).loginComCampoPasswordVazio(string);
	}

	@Entao("o sistema exibe o usuario logado")
	public void oSistemaExibeOUsuarioLogado() {
		assertEquals("Dashboard", driver.findElement(By.linkText("Dashboard")).getText());
	}

	@Quando("acessar o link {string} para recuperar senha")
	public void acessarOLinkParaRecuperarSenha(String string) {
		Na(LoginPage.class).recuperarSenha();
	}

	@Quando("o site enviar para pagina {string}")
	public void oSiteEnviarParaPagina(String string) {
		Na(LoginPage.class).validaPaginaAlterarSenha(string);
	}

	@Quando("eu informar no campo UserName {string}")
	public void euInformarNoCampoUserName(String string) {
		Na(LoginPage.class).informarCampoRecuperaSenha(string);
	}

	@Quando("clicar no botao Reset Passoword")
	public void clicarNoBotaoResetPassoword() {
		Na(LoginPage.class).clicarBotaoRecuperaSenha();
	}

	@E("^clica no botao Cancelar para voltar a pagina inicial$")
	public void clicaNoBotaoCancelarParaVoltarAPaginaInicial() {
		Na(LoginPage.class).botaoVoltar();
	}

	@Entao("^o site apresenta um alerta \"([^\"]*)\"$")
	public void oSiteApresentaUmAlerta(String arg1){
		Na(LoginPage.class).alertaPaginaRecuperarSenha(arg1);
	}

	@Entao("^o site apresenta um alerta de campo vazio \"([^\"]*)\"$")
	public void oSiteApresentaUmAlertaDeCampoVazio(String arg1){
		Na(LoginPage.class).alertaPaginaRecuperarSenhaCampoVazio(arg1);
	}

}
