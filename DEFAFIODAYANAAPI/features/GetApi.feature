#language: pt

Funcionalidade: Validacao de uma consulta em uma API
    Como um usuário do sistema
    Eu quero fazer uma busca via API
    Para que eu possa validar o retorno do Http code


@get_validacampos
Cenário: Validar o retorno do campo Http code como 200
  Dado que envio um GET request para a API 'https://reqres.in/api/users?page=2'
  Então o retorno Http code deve ser 200
    