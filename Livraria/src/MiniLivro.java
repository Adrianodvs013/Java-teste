public class MiniLivro extends Livro{

    public MiniLivro(Autor autor){
        super(autor);
    }
    public boolean aplicaDescontoDe(double porcentagem){
        return false;
    }
}


/*
Não é nem um pouco complicado trabalhar com classes abstratas, mas existemalgumas
regras que precisamser respeitadas. Apenas para relembrar, são
elas: 

• Uma classe pode ser abstrata sem ter nenhum método abstrato. A partir
do momento em que ela se tornar abstrata, nenhum código poderá
mais instanciá-la.
• Se você declarar ummétodo abstrato, precisará tornar a classe abstrata
também! Você não pode ter métodos abstratos em uma classe que não
é abstrata.
• Uma classe abstrata pode ter métodos abstratos e não abstratos (concretos).
• Toda classe filha (subclasse) precisa implementar os métodos abstratos
da classe pai (superclasse). A não ser que ela também seja abstrata.
*/



