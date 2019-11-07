require 'httparty'

Dado("que envio um GET request para a API {string}") do |url|
    @result =  HTTParty.get(url) 
end
  
Então("o retorno Http code deve ser {int}") do |exp_code|
    expect(@result.code).to eql(exp_code)
    puts @result.code
end
