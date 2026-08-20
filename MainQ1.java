public class MainQ1 {
    public static void main(String[] args) {
       Filme filmeUm = new Filme("Interestelar", "Ficção Cientifica", 2014);
       System.out.println("O Título do Filme 1 é: "+ filmeUm.titulo);
       System.out.println("O Gênero do Filme 1 é: " + filmeUm.genero);
       System.out.println("O Ano de lançamento do Filme 1 é: " + filmeUm.anoLancamento);
      

       Filme filmeDois = new Filme("Toy Story", "Animação", 1995);
       System.out.println("O Título do Filme 2 é: "+ filmeDois.titulo);
       System.out.println("O Gênero do Filme 2 é: " + filmeDois.genero);
       System.out.println("O Ano de lançamento do Filme 2 é: " + filmeDois.anoLancamento);

    }
}