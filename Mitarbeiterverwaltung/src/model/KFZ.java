package model;

import mitarbeiter.Fahrer;

public abstract class KFZ {
	private double tankSize;
	private double tankInhalt;
	private double speed;
	private int maxSpeed;
	private Fahrer fahrer;
	private boolean motorAn;

	protected KFZ(double tankGroesse, int maxSpeed) {
		this.maxSpeed = maxSpeed;
		this.tankSize = tankGroesse;
		this.fahrer = null;
		this.motorAn = false;
		this.speed = 0.0;
		this.tankInhalt = this.tankSize / 2;
	}

	public void tanken(double liter) throws Exception {
		if (this.tankInhalt + liter > this.tankSize) {
			this.tankInhalt = this.tankSize;
			throw new Exception("Tank ist übergelaufen!");
		} else {
			this.tankInhalt += liter;
		}
	}

	public void bremsen(double BremsFaktor) {
		this.speed *= BremsFaktor;
	}

	public void beschleunigen(double accelerationFaktor) {
		if (this.speed * (1.00 + accelerationFaktor) > (double) this.maxSpeed) {
			this.speed = (double) this.maxSpeed;
		} else {
			this.speed *= accelerationFaktor;
		}
	}

	public void fahren(double km) throws Exception {
		if (this.tankInhalt < km) {
			throw new Exception("Tank Inhalt ist nicht ausrecihend");
		} else {
			this.tankInhalt -= km;
		}
	}

	public boolean einsteigen(Fahrer fahrer) {
		if (this.fahrer != null) {
			return false;
		} else {
			this.fahrer = fahrer;
			return true;
		}
	}

	public String stammDatenToString() {
		return "Maximaler Inhalt des Tanks :" + this.tankSize + " Maximale Gewschwindigkeit : " + this.maxSpeed;
	}

	public String bewegungsDatenToString() {
		// TODO
		return "";
	}

	public double getTankSize() {
		return tankSize;
	}

	public void setTankSize(double tankSize) {
		this.tankSize = tankSize;
	}

	public double getTankInhalt() {
		return tankInhalt;
	}

	public void setTankInhalt(double tankInhalt) {
		this.tankInhalt = tankInhalt;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public Fahrer getFahrer() {
		return fahrer;
	}

	public void setFahrer(Fahrer fahrer) {
		this.fahrer = fahrer;
	}

	public boolean isMotorAn() {
		return motorAn;
	}

	public void setMotorAn(boolean motorAn) {
		this.motorAn = motorAn;
	}

}
