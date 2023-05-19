public class Restaurante {

    public String nome;
    public int cep;
    public String comidaTipica;

    public void exibirInformacoes(){
     System.out.println("nome: " + nome + "\ncep: " + cep + "\nComida Tipica: " + comidaTipica);
}
    public void  local(int localAtual) {
        if (this.cep == localAtual) {
            System.out.println("Esta no local");
        }else{
            System.out.println("não está no local");
        }
    }
}
