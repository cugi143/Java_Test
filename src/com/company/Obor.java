package com.company;

public class Obor {
	boolean hladny;
	int energia;
	
	void odveta(Rytier rytier) {
		if (energia > rytier.energia)
			rytier.energia = (int) (0.9 * rytier.energia);
	}
}









/*
	public class Obor implements Energia {
		boolean hladny;
		int energia;
		
		public void nastavEnergiu(int energia) {
			this.energia = energia;
		}
		public void zvysEnergiu(int energia) {
			this.energia += energia;
		}
		public void znizEnergiu(int energia) {
			this.energia -= energia;
		}
		public int zistiEnergiu() {
			return energia;
		}
		
		void nastav(boolean hladny) {
			this.hladny = hladny;
		}
		
		void nastav(int energia, boolean hladny) {
			this.energia = energia;
			this.hladny = hladny;
		}
		
		void odveta(Rytier rytier) {
			if (energia > rytier.zistiEnergiu())
	//			rytier.energia = (int) (0.9 * rytier.energia);
				// k energii sa uz neda pristupit priamo, lebo je private
				rytier.nastavEnergiu((int) (0.9 * rytier.zistiEnergiu()));
		}
	
	}
*/
