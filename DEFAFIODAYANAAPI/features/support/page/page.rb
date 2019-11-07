require 'httparty'
class BuscaDados
    require 'httparty'   
    def getDados(url)
       @result =  HTTParty.get(url) 
       puts @result
    end

    def validaCode(exp_code)
        expect(@result.code).to eql(exp_code)
        puts @result.code
    end
end

