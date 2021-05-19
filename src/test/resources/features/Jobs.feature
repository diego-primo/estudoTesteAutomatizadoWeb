#language: pt
#@enconding: UFT-8

@CadJob
Funcionalidade: Acessar Sistema, ja logado, e realizar cadastro de Jobs

  Contexto: 
    Quando mover o mouse para Admin
    E mover o mouse para Aba Job

  @CadJobComSucesso
  Cenario: Cadastro de Job - Com Sucesso
    Quando clicar a aba Job titles
    E clicar no btn Add
    E informar o nome do job no campo Job Title "QA Test"
    E informar a descricao do job no campo Job Description "Lorem Ipsum is simply dummy text of the printing and typesetting industry."
    E informar a nota no campo Note "It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum."
    E clicar no botao Save
    Entao o sistema confirma a inclusao mostranto o Nome do Job na lista "QA Test"
    
  @CadJobSemSucesso @CadJobJaExistente
  Cenario: Cadastro de Job ja existente -  Sem Sucesso
    Quando clicar a aba Job titles
    E clicar no btn Add
    E informar o nome do job no campo Job Title "QA Test"
    E informar a descricao do job no campo Job Description "Lorem Ipsum is simply dummy text of the printing and typesetting industry."
    E informar a nota no campo Note "It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum."
    E clicar no botao Save
    Entao o sistema alerta que o cadastro do titulo do job ja existe "Already exists"
    E clicar no botao Cancel
    
    @CadJobSemSucesso @CadJobEmBranco
  Cenario: Cadastro de Job Campos em branco -  Sem Sucesso
    Quando clicar a aba Job titles
    E clicar no btn Add
    E clicar no botao Save
    Entao o sistema alerta que campo Job Title e obrigatorio "Required"
    E clicar no botao Cancel
 