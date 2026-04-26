package model;

public class sensor {
	
	private double temp;
	private double umid;
	private boolean vaiChover;
	
	
	public sensor(double temp, double umid, boolean vaiChover) {
		this.temp = temp;
		this.umid = umid;
		this.vaiChover = vaiChover;
	}
	
	public boolean precisaRegar() {
		if (vaiChover) {
            return false;
        }
		return this.temp > 30.0 && this.umid < 50.0;
		
	}
}
