#language: pt
#@enconding: UFT-8

@CadastroUsuario
Funcionalidade: Acessar Sistema ja logado

  @CadastroComSucesso
  Cenario: Cadastrado de Usuario com Sucesso 
    Quando mover o mouse para Aba Admin
    E mover o mouse para Aba User Management
    E mover o mouse para Aba User e depois clicar nele
    E clicar no botao Add
    E confirmar se o campo o User Role esta selecionado com "ESS"
    E informar o Employee Name "Dominic Chase"
    E informar Username "TesteAdmin"
    E confirmar se o campo o  Status esta selecionado "Enabled"
    E informar o Password "1234567a"
    E informar o Confirm Password "1234567a"
    E clicar botao Save
    Entao o sistema confirmara o cadastrado realizado com sucesso "Successfully Saved"
