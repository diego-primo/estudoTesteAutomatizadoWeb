#language: pt
#@enconding: UFT-8

@CadastroUsuario
Funcionalidade: Acessar Sistema

  @CadastroComSucesso
  Cenario: Cadastrado de Usuario com Sucesso
    Quando eu clicar no modulo Admin
    E clicar no botao Add
    E confirmar se o campo o User Role esta selecionado com "ESS"
    E informar o Employee Name "Dominic Chase"
    E informar Username "TesteAdmin"
    E confirmar se o campo o  Status esta selecionado "Enabled"
    E informar o Password "1234567a"
    E informar o Confirm Password "1234567a"
    E clicar botao Save
    Entao o sistema confirmara o cadastrado realizado com sucesso "Successfully Saved"
