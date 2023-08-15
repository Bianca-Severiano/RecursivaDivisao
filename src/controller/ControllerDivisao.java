package controller;

public class ControllerDivisao {

	public ControllerDivisao() {
		super();
	}

	public int DivisaoResto (int dividendo, int divisor) {
		if (dividendo < divisor) {
			return dividendo;
		} else {
		  return DivisaoResto ((dividendo-divisor), divisor);	
		}		
	}
}

/*
 *f(18,5) = f(13,5)
 *f(13,5) = f(8,5)
 *f(8,5) = f(3,5)
 *f(3,5) = 3 <-- PARADA */
 