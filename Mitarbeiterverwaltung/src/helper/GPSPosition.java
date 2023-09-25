package helper;

public class GPSPosition {
	private double laengengrad;
	private double breitengrad;
	
	public GPSPosition(double laengengrad, double breitengrad) {
		this.setLaengengrad(laengengrad);
		this.setBreitengrad(breitengrad);
	}

	public double getLaengengrad() {
		return laengengrad;
	}

	public void setLaengengrad(double laengengrad) {
		this.laengengrad = laengengrad;
	}

	public double getBreitengrad() {
		return breitengrad;
	}

	public void setBreitengrad(double breitengrad) {
		this.breitengrad = breitengrad;
	}
}
