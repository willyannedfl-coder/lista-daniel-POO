public class MainQ2 {
    public static void main(String[] args) {
        Autor autorUm = new Autor("George Orwell" , "Britânico");
        Autor autorDois = new Autor("Machado de Assis" ,"Brasileiro");
        Livro LivroCasoUm = new Livro("1984", 1949, autorUm);
        Livro LivroCasoDois = new Livro("Dom Casmurro", 1899, autorDois);


        System.out.println("===== caso 1 =====");
        System.out.println(LivroCasoUm);
        
        System.out.println("===== caso 2 =====");
        System.out.println(LivroCasoDois);

    } 
}
