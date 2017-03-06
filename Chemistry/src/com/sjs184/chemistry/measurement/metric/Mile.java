package com.sjs184.chemistry.measurement.metric;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Mile {
	
	private double num;
	
	private Inch oneInch = new Inch(63360);
	private Foot oneFoot = new Foot(5280);
	private Yard oneYard = new Yard(1760);
	
	public Mile(double num) {
		// TODO Auto-generated constructor stub
		this.num = num;
	}
	
	public Inch MileToInch(){
		double temp = 0;
		
		int in = (int) num;
		System.out.println(in);
		for(int i=0; i<in; i++){
			temp += oneInch.getNumber();
		}
		return new Inch(round(temp));
	}
	
	public Foot MileToFeet(){
		double temp = 0;
		
		int in = (int) num;
		System.out.println(in);
		for(int i=0; i<in; i++){
			temp += oneFoot.getNumber();
		}
		return new Foot(round(temp));
	}
	
	public Yard MileToYard(){
		double temp = 0;
		
		int in = (int) num;
		System.out.println(in);
		for(int i=0; i<in; i++){
			temp += oneYard.getNumber();
		}
		return new Yard(round(temp));
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
