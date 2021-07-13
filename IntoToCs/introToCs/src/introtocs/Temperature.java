package java;

public class Temperature {
	private double temp;

	public Temperature(double t) {
		temp = t;
	}

	public boolean isEthylFreezing(double t) {
		boolean eFreeze;
		if (t <= -173) {
			eFreeze = true;
		} else {
			eFreeze = false;
		}
		return eFreeze;
	}

	public boolean isOxygenFreezing(double t) {
		boolean oFreeze;
		if (t <= -362) {
			oFreeze = true;
		} else {
			oFreeze = false;
		}
		return oFreeze;
	}

	public boolean isWaterFreezing(double t) {
		boolean wFreeze;
		if (t <= 32) {
			wFreeze = true;
		} else {
			wFreeze = false;
		}
		return wFreeze;
	}

	public boolean isEthylBoiling(double t) {
		boolean eBoil;
		if (t >= 172) {
			eBoil = true;
		} else {
			eBoil = false;
		}
		return eBoil;
	}

	public boolean isOxygenBoiling(double t) {
		boolean oBoil;
		if (t >= -306) {
			oBoil = true;
		} else {
			oBoil = false;
		}
		return oBoil;
	}

	public boolean isWaterBoiling(double t) {
		boolean wBoil;
		if (t >= 212) {
			wBoil = true;
		} else {
			wBoil = false;
		}
		return wBoil;
	}

}
