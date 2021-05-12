#language: pt
#@enconding: UFT-8
@login
Funcionalidade: Acessar Sistema

  Contexto: 
    #Dado que eu estou acessando o sistema - classe hooks
    Quando na tela de login

  @loginInvalido
  Cenario: Login invalido
    Quando eu informar usuario "xpto"
    E informar a senha "xpto"
    E clicar no botao login
    Entao o sistema apresenta msg de credenciais invalidas "Invalid credentials"

  @loginInvalidoCamposUsenameEPasswordVazios
  Cenario: Login invalido Campos UserName e Password vazios
    E clicar no botao login
    Entao o sistema apresenta msg de campo Username vazio "Username cannot be empty"

  @loginInvalidoCampoPasswordVazio
  Cenario: Login invalido Campo Password vazio
    Quando eu informar usuario "xpto"
    E clicar no botao login
    Entao o sistema apresenta msg de campo Password vazio "Password cannot be empty"

  @loginValido
  Cenario: Login valido
    Quando eu informar usuario "Admin"
    E informar a senha "admin123"
    E clicar no botao login
    Entao o sistema exibe o usuario logado

  @RecuperarSenha
  Cenario: Recuperar Senha
    E acessar o link "Forgot your password?" para recuperar senha
    E o site enviar para pagina "Forgot Your Password?"
    E eu informar no campo UserName "AdminTeste"
    E clicar no botao Reset Passoword
    Entao o site apresenta um alerta "Please contact HR admin in order to reset the password"
    E clica no botao Cancelar para voltar a pagina inicial

  @RecuperarSenhacampoUsernamevazio
  Cenario: Recuperar Senha com o campo Username vazio
    E acessar o link "Forgot your password?" para recuperar senha
    E o site enviar para pagina "Forgot Your Password?"
    E clicar no botao Reset Passoword
    Entao o site apresenta um alerta de campo vazio "Could not find a user with given details"
    E clica no botao Cancelar para voltar a pagina inicial
