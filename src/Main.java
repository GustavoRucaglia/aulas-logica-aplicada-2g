public class Main {
    public static void main(String[] args) {

        //aula introdutoria de POO

        Pessoa adao = new Pessoa();
        adao.name = "adao";
        adao.sobrenome = "jesus";

        adao.falar();
        adao.falar(" alto");

        Restaurante padaria = new Restaurante();

        Produto petisco = new Produto();
        Produto racao = new Produto(1);
        Produto remedio = new Produto(2);
        petisco.setNome("biscoito");
      }
    }
