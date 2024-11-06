package ArenaDosHerois;

public class Guerreiro extends Personagem {
	public Guerreiro (String nome) {
		 super(nome,150,30);
	 }
	 public void atacar(Personagem oponente) {
		 int distancia = calcularDistancia(oponente);
		 if (distancia <= 1) {
			 
			 oponente.receberDano(this.getDanoBase());
			 
			 System.out.println(getNome()+ " atacou" + oponente.getNome() + " com sua espada.");
		 }else {
			 System.out.println(getNome()+ " Não tem mana para atacar!");
		 }
	 }
}
