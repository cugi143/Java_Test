package com.company;

public class ZlyObor extends Obor {
//	boolean hladny;
	
	void odveta(Rytier rytier) {
		if (hladny)
			zjedz(rytier);
	}
	void zjedz(Rytier rytier) {
		rytier.energia = 0;
	}
}
