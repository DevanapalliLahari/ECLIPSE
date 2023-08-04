package com.xworkz.android.runner;

import com.xworkz.android.app.SaloonRules;
import com.xworkz.android.app.TempleRules;
import com.xworkz.android.app.implementation.AbcTheaterRule;
import com.xworkz.android.app.implementation.AtpHomeRule;
import com.xworkz.android.app.implementation.CityPubRules;
import com.xworkz.android.app.implementation.CollegeVtuRule;
import com.xworkz.android.app.implementation.DoctorHospitalRules;
import com.xworkz.android.app.implementation.EmployeeWifeRules;
import com.xworkz.android.app.implementation.ExplosiveMetroRule;
import com.xworkz.android.app.implementation.FireAirportRules;
import com.xworkz.android.app.implementation.JohnHusbandRule;
import com.xworkz.android.app.implementation.MokhaHostelRule;
import com.xworkz.android.app.implementation.SbiBankRules;
import com.xworkz.android.app.implementation.ShivaTempleRule;
import com.xworkz.android.app.implementation.ShopSaloonRules;
import com.xworkz.android.app.implementation.SleepyHotelRules;
import com.xworkz.android.app.implementation.UnitArmyRule;
import com.xworkz.android.app.implementation.WiproCompanyRule;


public class ArmyRuleRunner {

	public static void main(String[] args) {

		System.out.println("MAin Method");

		UnitArmyRule army = new UnitArmyRule();
		army.fitness();
		System.out.println(army.NO_OF_SOLDIERS);
		System.out.println(UnitArmyRule.UNIT_NAME);

		ShopSaloonRules saloon = new ShopSaloonRules();
		saloon.waiting();
		System.out.println(ShopSaloonRules.SHOP_NAME);
		System.out.println(saloon.HAIRCUT_PRICE);

		DoctorHospitalRules hospital = new DoctorHospitalRules();
		hospital.silence();
		System.out.println(hospital.NO_OF_SPECIALISTS);
		System.out.println(DoctorHospitalRules.HOSPITAL_NAME);

		ExplosiveMetroRule metro = new ExplosiveMetroRule();
		metro.buyTicket();
		System.out.println(metro.METRO_NAME);
		System.out.println(ExplosiveMetroRule.DESTINATION);

		SleepyHotelRules hotel = new SleepyHotelRules();
		hotel.doNotAllowDrugs();
		System.out.println(hotel.NO_OF_ROOMS);
		System.out.println(SleepyHotelRules.HOTEL_NAME);

		ShivaTempleRule temple = new ShivaTempleRule();
		temple.silence();
		System.out.println(temple.NO_OF_PEOPLE);
		System.out.println(ShivaTempleRule.GOD_NAME);

		FireAirportRules airport = new FireAirportRules();
		airport.doNotBringFireworks();
		System.out.println(airport.PASSINGERS);
		System.out.println(FireAirportRules.location);

		AbcTheaterRule theater = new AbcTheaterRule();
		theater.snackesNotAllowed();
		System.out.println(theater.TICKET_PRICE);
		System.out.println(AbcTheaterRule.THEATER_NAME);
		
		AtpHomeRule home=new AtpHomeRule();
		home.dontGoNightouts();
		System.out.println(AtpHomeRule.LOCATION);
		System.out.println(home.BUDGET);
		
		MokhaHostelRule hostel=new MokhaHostelRule();
		hostel.electricDevicesNotAllowed();
		System.out.println(hostel.NO_OF_ROOMS);
		System.out.println(MokhaHostelRule.HOSTEL_NAME);
		
		JohnHusbandRule husband=new JohnHusbandRule();
		husband.dontArgue();
		System.out.println(husband.HUSBAND_AGE);
		System.out.println(JohnHusbandRule.HUSBAND_NAME);
		
		WiproCompanyRule company=new WiproCompanyRule();
		company.speakInEnglish();
		System.out.println(WiproCompanyRule.COMPANY_NAME);
		
		CollegeVtuRule vtu=new CollegeVtuRule();
		vtu.attendance();
		System.out.println(CollegeVtuRule.COLLEGE_NAME);
		
		EmployeeWifeRules employeeWifeRules = new EmployeeWifeRules();
		employeeWifeRules.shop();
		System.out.println(employeeWifeRules.age);
		System.out.println(EmployeeWifeRules.NAME);
		
		CityPubRules cityPubRules = new CityPubRules();
		cityPubRules.dance();
		System.out.println(CityPubRules.NAME);
		System.out.println(cityPubRules.ownerName);
		
		SbiBankRules sbiBankRules = new SbiBankRules();
		sbiBankRules.loan();
		System.out.println(SbiBankRules.NAME);
		System.out.println(sbiBankRules.location);

	}

}
