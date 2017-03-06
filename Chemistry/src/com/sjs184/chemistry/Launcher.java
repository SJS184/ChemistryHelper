package com.sjs184.chemistry;

import com.sjs184.chemistry.measurement.metric.Inch;

public class Launcher {

	public Launcher() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Inch i = new Inch(8);
		System.out.println(i.InchToYard().getNumber());
	}

}
