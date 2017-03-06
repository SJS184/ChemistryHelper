package com.sjs184.chemistry.measurement.metric;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Foot {

	private double num;
	
	private Inch oneInch = new Inch(12);
	private Yard oneYard = new Yard(0.333333);
	private Mile oneMile = new Mile(0.00018939375);
	
	public Foot(double num) {
		// TODO Auto-generated constructor stub
		this.num = num;
	}

	public Inch FootToInch(){
		double temp = 0;
		
		int in = (int) num;
		System.out.println(in);
		for(int i=0; i<in; i++){
			temp += oneInch.getNumber();
		}
		return new Inch(round(temp));
	}
	
	public Yard FootToYard(){
		double temp = 0;
		
		int in = (int) num;
		System.out.println(in);
		for(int i=0; i<in; i++){
			temp += oneYard.getNumber();
		}
		return new Yard(round(temp));
	}
	
	public Mile FootToMile(){
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
