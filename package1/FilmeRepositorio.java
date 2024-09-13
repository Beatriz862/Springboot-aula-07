package package1;


import java.util.Arraylist;

public class FilmeRepositorio{

    private ArrayList<Filme> filmes;


    public FilmeRepositorio(){

        filmes = new ArrayList<>();

    }

    public void inserirFilme(Filme f){

        filmes.add(f);

    }
    public void ListarFilmes(){

        for(int = 0; i < filmes.size(; i++) ){

           films.get(i).exebirFilme();

        }
    }

}