package fr.dauphine.javavance.td2;

/**
 * @author Ndriana Randrianandrasana
 * TP2 java Avance
**/



 public class Expr {
	 /**
	  * La methode instance eval() renvoie la valeur "réelle" du calcul effectué
	  * Elle est redéfinie dans chacune des classes heritières car elle s'adapte au nouveau type créé 
	  * @param aucun
	  * @return double
	  */
	public double eval() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
 
 /**
  * chaque classe hérite de Expr
  * Elle sont composées:
  * - d'un attribut double 
  * - d'un getter pour cet attribut
  * - d'un constructeur
  * - de la methode eval()
  * **/
 
class Value extends Expr {  
	private double valeur;
	

	public Value(double d) {
		this.valeur = d; 
	}
	
	public double getValeur() {
		return valeur;
	}
	
	public double eval() {
		return this.valeur;
	}
	
	
}

class Add extends Expr {
	private double addition;
	
	public double getAddition() {
		return this.addition;
	}

	public Add(Expr ex1, Expr ex2) {
		this.addition = ex1.eval()+ex2.eval();
			
	}
	
	public double eval() {
		return this.addition;
	}
	
}

class Mult extends Expr {
	private double produit;
	
	public Mult(Expr e1, Expr e2) {
		this.produit = e1.eval()*e2.eval();
	}
	
	public double getProduit() {
		return this.produit;
	}
	
	public double eval() {
		return this.produit;
	}
}

class SquareRoot extends Expr {
	private double rac;
	
	public double getRac() {
		return this.rac;
	}
	
	public SquareRoot(Expr e) {
		this.rac = Math.sqrt(e.eval());
	}
	
	public double eval() {
		return this.rac;
	}
}