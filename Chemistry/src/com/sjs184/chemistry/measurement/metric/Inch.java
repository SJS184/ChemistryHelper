package com.sjs184.chemistry.measurement.metric;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Inch {

	private double num;
	
	private Foot oneFoot = new Foot(0.08333333);
	private Yard oneYard = new Yard(0.0277778);
	private Mile oneMile = new Mile(1.5783e-5);
	
	public Inch(double num) {
		// TODO Auto-generated constructor stub
		this.num = num;
	}

	public Foot InchToFeet(){
		double temp = 0;
		
		int in = (int) num;
		System.out.println(in);
		for(int i=0; i<in; i++){
			temp += oneFoot.getNumber();
		}
		return new Foot(round(temp));
	}

	public Yard InchToYard(){
		double temp = 0;
		
		int in = (int) num;
		System.out.println(in);
		for(int i=0; i<in; i++){
			temp += oneYard.getNumber();
		}
		return new Yard(round(temp));
	}
	
	public Mile InchToMile(){
		double temp = 0;
		
		int in = (int) num;
		System.out.println(in);
		for(int i=0; i<in; i++){
			temp += oneMile.getNumber();
		}
		return new Mile(round(temp));
	}
	
	public double getNumber(){
		return num;
	}
	
	private Double round(double num){
		BigDecimal bd = new BigDecimal(num);
		bd = bd.setScale(2, RoundingMode.HALF_EVEN);
		DecimalFormat df = new DecimalFormat("###.####");
		return Double.valueOf(df.format(bd.doubleValue()));
	}
}
