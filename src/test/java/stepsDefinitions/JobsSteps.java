package stepsDefinitions;

import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.JobsPage;

import static utils.Utils.*;

public class JobsSteps {

	@Quando("mover o mouse para Admin")
	public void moverOMouseParaAbAdmin() {
		Na(JobsPage.class).moverMouseAbaAdmin();
	}

	@Quando("mover o mouse para Aba Job")
	public void moverOMouseParaAbJob() {
		Na(JobsPage.class).moverMouseAbaJob();
	}

	@Quando("clicar a aba Job titles")
	public void clicarAAbaJobTitles() {
		Na(JobsPage.class).moverMouseAbaJobTitlesEClicla();

	}

	@Quando("clicar no btn Add")
	public void clicarNoBotaoAdd() {
		Na(JobsPage.class).clicarBotaoAdd();
	}

	@E("^informar o nome do job no campo Job Title \"([^\"]*)\"$")
	public void informarONomeDoJobNoCampoJobTitle(String arg1) {
		Na(JobsPage.class).informarCampoJobTitle(arg1);
	}

	@E("^informar a descricao do job no campo Job Description \"([^\"]*)\"$")
	public void informarADescricaoDoJobNoCampoJobDescription(String arg1) {
		Na(JobsPage.class).informarCampoJobDescription(arg1);
	}

	@E("^informar a nota no campo Note \"([^\"]*)\"$")
	public void informarANotaNoCampoNote(String arg1) {
		Na(JobsPage.class).informarCampoNote(arg1);
	}

	@Quando("clicar no botao Save")
	public void clicarNoBotaoSave() {
		Na(JobsPage.class).clicarBotaoSave();

	}

	@Entao("^o sistema confirma a inclusao mostranto o Nome do Job na lista \"([^\"]*)\"$")
	public void oSistemaConfirmaAInclusaoMostrantoONomeDoJobNaLista(String arg1) {
		Na(JobsPage.class).confirmarNomeJobNaLista(arg1);
	}

}
