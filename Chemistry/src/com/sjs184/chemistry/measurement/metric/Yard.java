package com.sjs184.chemistry.measurement.metric;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Yard {

	private double num;
	
	private Inch oneInch = new Inch(12);
	private Foot oneFoot = new Foot(1);
	private Mile oneMile = new Mile(0.000568182);
	public Yard(double num) {
		// TODO Auto-generated constructor stub
		this.num = num;
	}

	public Inch YardToInch(){
		double temp = 0;
		
		int in = (int) num;
		System.out.println(in);
		for(int i=0; i<in; i++){
			temp += oneInch.getNumber();
		}	
		return new Inch(round(temp));
	}
	
	public Foot YardToFeet(){
		double temp = 0;
		
		int in = (int) num;
		System.out.println(in);
		for(int i=0; i<in; i++){
			temp += oneFoot.getNumber();
		}	
		return new Foot(round(temp));
	}
	
	public Mile YardToMile(){
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
