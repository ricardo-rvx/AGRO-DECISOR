package controller;

import model.sensor;
public class decisaoController {
	
	public decisaoController() {
		super();
	}
	
	public String avaliarSensor(String info) {
		String[] infos = info.split(" ");
		
		boolean vaiChover = Integer.parseInt(infos[2]) == 1;
		double temp = Double.parseDouble(infos[0]);
		double umid = Double.parseDouble(infos[1]);
		
		sensor s = new sensor(temp, umid, vaiChover);
		
		if (s.precisaRegar()) {
            return "REGAR";
        } else {
            return "NAO REGAR";
        }
	}
	
	
}
