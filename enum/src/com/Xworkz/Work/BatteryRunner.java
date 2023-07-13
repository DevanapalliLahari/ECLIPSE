package com.Xworkz.Work;

public class BatteryRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Battery battery=new Battery(true);
		battery.setVoltage(5);
		battery.cellType=BatteryCellType.LEAD_ACID;
		battery.display();
		Battery battery1=new Battery(true);
		battery1.setVoltage(10);
		battery1.cellType=BatteryCellType.LIPO;
		battery1.display();

	}

}
