package view;
import controller.ControllerDivisao;

public class PrincipalDivisao {

	public static void main(String[] args) {
		int dividendo =  18;
		int divisor = 5;
		
        ControllerDivisao cd = new ControllerDivisao();
        
        int res = cd.DivisaoResto(dividendo, divisor);
        System.out.println(res); 

	}

}
