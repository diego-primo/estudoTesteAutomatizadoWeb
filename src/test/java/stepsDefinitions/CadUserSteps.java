package stepsDefinitions;

import static utils.Utils.*;

import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.CadUserPage;

public class CadUserSteps {

	@Quando("mover o mouse para Aba Admin")
	public void moverOMouseParaAbaAdmin() {
		Na(CadUserPage.class).moverMouseAbaAdmin();
	}

	@Quando("mover o mouse para Aba User Management")
	public void moverOMouseParaAbaUserManagement() {
		Na(CadUserPage.class).moverMouseAbaUserManagement();
	}

	@Quando("mover o mouse para Aba User e depois clicar nele")
	public void moverOMouseParaAbaUserEDepoisClicarNele() {
		Na(CadUserPage.class).moverMouseAbaUserEClick();
	}

	@Quando("clicar no botao Add")
	public void clicarNoBotaoAdd() {
		Na(CadUserPage.class).clicarBotaoAdd();
	}

	@Quando("confirmar se o campo o User Role esta selecionado com {string}")
	public void confirmarSeOCampoOUserRoleEstaSelecionadoCom(String string) {
		Na(CadUserPage.class).validarCampoUserRole(string);
	}

	@Quando("informar o Employee Name {string}")
	public void informarOEmployeeName(String string) {
		Na(CadUserPage.class).informarCampoEmployeeName(string);
	}

	@Quando("informar Username {string}")
	public void informarUsername(String string) {
		Na(CadUserPage.class).informarCampoUserName(string);
	}

	@Quando("confirmar se o campo o  Status esta selecionado {string}")
	public void confirmarSeOCampoOStatusEstaSelecionado(String string) {
		Na(CadUserPage.class).validarCampoStatus(string);
	}

	@Quando("informar o Password {string}")
	public void informarOPassword(String string) {
		Na(CadUserPage.class).informarPassword(string);

	}

	@Quando("informar o Confirm Password {string}")
	public void informarOConfirmPassword(String string) {
		Na(CadUserPage.class).informarConfirmPassword(string);
	}

	@Quando("clicar botao Save")
	public void clicarBotaoSave() {
		Na(CadUserPage.class).clicarBotaoSalvar();
	}

	@Entao("^o sistema confirmara o cadastrado constanto o nome do usuario na lista \"([^\"]*)\"$")
	public void oSistemaConfirmaraOCadastradoConstantoONomeDoUsuarioNaLista(String arg1) {
		Na(CadUserPage.class).validarCadastroUsuarioComSucesso(arg1);
	}

	
	
	@Entao("^o site informa que o usuario nao existe \"([^\"]*)\"$")
	public void oSiteInformaQueOUsuarioNaoExiste(String arg1) {
		Na(CadUserPage.class).employeeNameNaoExiste(arg1);
	}

	@Entao("^o site apontara erro no campo employeeName$")
	public void oSiteApontaraErroNoCampoEmployeeName() {
		Na(CadUserPage.class).employeeNameNaoExiste("Employee does not exist");
	}

	@Entao("^o site apontara erro no campo userName$")
	public void oSiteApontaraErroNoCampoUserName(){
		Na(CadUserPage.class).userNameRequerido("Required");
	}

	@Entao("^o site apontara erro no password$")
	public void oSiteApontaraErroNoPassword(){
		Na(CadUserPage.class).passwordRequerido("Required");
	}

	@Entao("^o ususario clica no botao Cancelar$")
	public void oUsusarioClicaNoBotaoCancelar() {
		Na(CadUserPage.class).clicarBotaoCancelar();
	}
}
