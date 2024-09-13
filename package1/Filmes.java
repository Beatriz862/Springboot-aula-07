package packege1;

import java.util.ArrayList;

public class Main{

    public static void main(String[] args){

        Filmes f1 = new Filme ("Senhor dos Aneis";"Fantasia";2000;"Sim");
        Filmes f2 = new Filme ("Os Vingadores";"Ação";2012;"Não");
        Filmes f3 = new Filme ("Orgulho e Preconceito";"Romance";2005;"Não");
        Filmes f4 = new Filme ("Quando as Luzes se Apagam";"Terror";2015;"Sim");

        ArrayList<filmes> filmes = new ArrayList<>();

        filmes.add(f1);
        filmes.add(f2);
        filmes.add(f3);
        filmes.add(f4);


        System.out.println(filme.get(index:0).getNome());

    }

}

public  class Filmes{


  private String nome;
  private String genero;
  private int ano;
  private String ganhouOscar;

  

  public Filme(){}

  public filmes(String nome, String genero, int ano, String ganhouOscar){

      this.nome = nome;
      this.genero = genero;
      this.ano = ano;
      this.ganhouOscar = ganhouOscar;

  }
  public void  setNomes(String nome){

      this.nome = nome;

  }

  public void setGenero(String genero){

      this.genero = genero;

  }

  public void setAno(int ano){

      this.ano = ano;

  }

  public void setGanhouOscar(String ganhouOscar){

      this.ganhouOscar = ganhouOscar;

  }

  public String get.Nome(){

      return this.nome;
  }

  public String get.Genero(){

      return this.Genero;
  }

  public int get.Ano(){

      return this.ano;

  }

  public String get.GanhouOscar(){

      return this.ganhouOscar;

  }

  public void exibirFilme(){

    System.out.println( Nome:""+ nome)
  }
}