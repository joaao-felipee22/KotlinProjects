class Aluno{

    var nome: String

    var sobrenome: String

    var codigo: Int

    constructor(nome: String, sobrenome: String, codigo: Int){
        this.nome = nome
        this.sobrenome = sobrenome
        this.codigo = codigo
    }


    fun estudar(): String {
        return "Eu " + nome + " estou estudando "
    }


}

