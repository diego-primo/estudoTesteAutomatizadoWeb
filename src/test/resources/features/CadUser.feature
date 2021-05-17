#language: pt
#@enconding: UFT-8
@CadastroUsuario
Funcionalidade: Acessar Sistema ja logado

  Contexto: 
    Quando mover o mouse para Aba Admin
    E mover o mouse para Aba User Management
    E mover o mouse para Aba User e depois clicar nele

  @CamposEmBranco
  Cenario: Cadastrado de Usuario - Campos em branco
    E clicar no botao Add
    E clicar botao Save
    Entao o site apontara erro no campo employeeName
    Entao o site apontara erro no campo userName
    Entao o site apontara erro no password
    Entao o ususario clica no botao Cancelar

  @EmployeeNaoExiste
  Cenario: Cadastrado de Usuario - Nao existe o EmployeeName
    E clicar no botao Add
    E confirmar se o campo o User Role esta selecionado com "ESS"
    E informar o Employee Name "Face"
    Entao o site informa que o usuario nao existe "Employee does not exist"

  @RealizarCastro @CadastroComSucesso
  Esquema do Cenario: Cadastrado de Usuario - com Sucesso
    E clicar no botao Add
    E confirmar se o campo o User Role esta selecionado com "<userRole>"
    E informar o Employee Name "<employee>"
    E informar Username "<usuario>"
    E confirmar se o campo o  Status esta selecionado "<enabled>"
    E informar o Password "<senha>"
    E informar o Confirm Password "<confirmaSenha>"
    E clicar botao Save
    Entao o sistema confirmara o cadastrado constanto o nome do usuario na lista "<usuario>"

    Exemplos: 
      | usuario    | userRole | employee      | enabled | senha    | confirmaSenha |
      | TesteAdmin | ESS      | Dominic Chase | Enabled | 1234567a | 1234567a      |
