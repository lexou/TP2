package fr.dauphine.javavance.td2;

/**
 * 
 * @author Ndriana Randrianandrasana
 * TP2 java Avance
 */

public class Main {
	
	public static void main(String[] args) throws Exception {
		Expr val = new Value(1337.0);
		System.out.println(val.eval()); 
		Expr add = new Add(new Value(327.0), val);
		System.out.println(add.eval()); 
	    Expr e = new Add(new Value(350.0), add);
		System.out.println(e.eval()); 
		
		Expr val2 = new Value(11);
		Expr multi = new Mult(val2, val2);
		System.out.println(multi.eval());
		Expr root = new SquareRoot(multi);
		System.out.println(root.eval());

	 }
}


