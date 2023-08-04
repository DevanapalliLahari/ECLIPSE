package com.xworkz.android.runner;

import com.xworkz.android.app.implementation.AbcTheaterRule;
import com.xworkz.android.app.implementation.AtpHomeRule;
import com.xworkz.android.app.implementation.CollegeVtuRule;
import com.xworkz.android.app.implementation.DoctorHospitalRules;
import com.xworkz.android.app.implementation.ExplosiveMetroRule;
import com.xworkz.android.app.implementation.FireAirportRules;
import com.xworkz.android.app.implementation.JohnHusbandRule;
import com.xworkz.android.app.implementation.MokhaHostelRule;
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
		System.out.println(army.UNIT_NAME);

		ShopSaloonRules saloon = new ShopSaloonRules();
		saloon.waiting();
		System.out.println(saloon.SHOP_NAME);
		System.out.println(saloon.HAIRCUT_PRICE);

		DoctorHospitalRules hospital = new DoctorHospitalRules();
		hospital.silence();
		System.out.println(hospital.NO_OF_SPECIALISTS);
		System.out.println(hospital.HOSPITAL_NAME);

		ExplosiveMetroRule metro = new ExplosiveMetroRule();
		metro.buyTicket();
		System.out.println(metro.METRO_NAME);
		System.out.println(metro.DESTINATION);

		SleepyHotelRules hotel = new SleepyHotelRules();
		hotel.doNotAllowDrugs();
		System.out.println(hotel.NO_OF_ROOMS);
		System.out.println(hotel.HOTEL_NAME);

		ShivaTempleRule temple = new ShivaTempleRule();
		temple.silence();
		System.out.println(temple.NO_OF_PEOPLE);
		System.out.println(temple.GOD_NAME);

		FireAirportRules airport = new FireAirportRules();
		airport.doNotBringFireworks();
		System.out.println(airport.PASSINGERS);
		System.out.println(airport.location);

		AbcTheaterRule theater = new AbcTheaterRule();
		theater.snackesNotAllowed();
		System.out.println(theater.TICKET_PRICE);
		System.out.println(theater.THEATER_NAME);
		
		AtpHomeRule home=new AtpHomeRule();
		home.dontGoNightouts();
		System.out.println(home.LOCATION);
		System.out.println(home.BUDGET);
		
		MokhaHostelRule hostel=new MokhaHostelRule();
		hostel.electricDevicesNotAllowed();
		System.out.println(hostel.NO_OF_ROOMS);
		System.out.println(hostel.HOSTEL_NAME);
		
		JohnHusbandRule husband=new JohnHusbandRule();
		husband.dontArgue();
		System.out.println(husband.HUSBAND_AGE);
		System.out.println(husband.HUSBAND_NAME);
		
		WiproCompanyRule company=new WiproCompanyRule();
		company.speakInEnglish();
		System.out.println(company.COMPANY_NAME);
		
		CollegeVtuRule vtu=new CollegeVtuRule();
		vtu.attendance();
		System.out.println(vtu.COLLEGE_NAME);

	}

}
