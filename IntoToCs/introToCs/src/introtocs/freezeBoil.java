package introtocs;


public class freezeBoil {
	private double temp;
	
	public freezeBoil(double t) {
		temp = t;
	}
	public void setTemp(double t){
		temp = t;
	}

	public boolean isEthylFreezing() {
		boolean eFreeze;
		if (temp <= -173) {
			eFreeze = true;
		} else {
			eFreeze = false;
		}
		return eFreeze;
	}

	public boolean isOxygenFreezing() {
		boolean oFreeze;
		if (temp <= -362) {
			oFreeze = true;
		} else {
			oFreeze = false;
		}
		return oFreeze;
	}

	public boolean isWaterFreezing() {
		boolean wFreeze;
		if (temp <= 32) {
			wFreeze = true;
		} else {
			wFreeze = false;
		}
		return wFreeze;
	}

	public boolean isEthylBoiling() {
		boolean eBoil;
		if (temp >= 172) {
			eBoil = true;
		} else {
			eBoil = false;
		}
		return eBoil;
	}

	public boolean isOxygenBoiling() {
		boolean oBoil;
		if (temp >= -306) {
			oBoil = true;
		} else {
			oBoil = false;
		}
		return oBoil;
	}

	public boolean isWaterBoiling() {
		boolean wBoil;
		if (temp >= 212) {
			wBoil = true;
		} else {
			wBoil = false;
		}
		return wBoil;
	}

}