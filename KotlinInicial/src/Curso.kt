class Curso {

    var nome: String

    var codigo: Int

    var professorAdjunto: ProfessorAdjunto

    var professorTitular: ProfessorTitular

    val list = listOf<Aluno>()

    constructor(nome: String, codigo: Int, professorTitular: ProfessorTitular, professorAdjunto: ProfessorAdjunto){
        this.codigo = codigo
        this.nome = nome
        this.professorAdjunto = professorAdjunto
        this.professorTitular = professorTitular
    }


    fun adicionarAluno(aluno: Aluno): Boolean {
        return true
    }

    fun excluirAluno(aluno: Aluno): Boolean {
        return true
    }
}