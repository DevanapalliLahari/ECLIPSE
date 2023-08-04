package com.xworkz.robot.runner;

import com.xworkz.rocket.implementation.AccountBankRule;
import com.xworkz.rocket.implementation.ArmySelecctions;
import com.xworkz.rocket.implementation.BotherringHusbandRule;
import com.xworkz.rocket.implementation.CinemaTheaterRules;
import com.xworkz.rocket.implementation.DancerPubRules;
import com.xworkz.rocket.implementation.DesignPatentRule;
import com.xworkz.rocket.implementation.EmployeeCompanyRules;
import com.xworkz.rocket.implementation.GannavaramAirport;
import com.xworkz.rocket.implementation.HospitalDepartment;
import com.xworkz.rocket.implementation.HostelWarden;
import com.xworkz.rocket.implementation.HotelManager;
import com.xworkz.rocket.implementation.HouseWifeRules;
import com.xworkz.rocket.implementation.MetroTrain;
import com.xworkz.rocket.implementation.ParentHomeRules;
import com.xworkz.rocket.implementation.PeopleSaloonRules;
import com.xworkz.rocket.implementation.PeopleTempleRules;
import com.xworkz.rocket.implementation.StudentVtuRules;

public class ApplicationRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArmySelecctions selection = new ArmySelecctions();
		selection.timesence();
		System.out.println(ArmySelecctions.ARMY_LOCATION);

		PeopleSaloonRules saloon = new PeopleSaloonRules();
		saloon.dressing();
		HostelWarden rules = new HostelWarden();
		rules.timings();

		HospitalDepartment department = new HospitalDepartment();
		department.treatment();

		MetroTrain train = new MetroTrain();
		train.travel();

		HotelManager manager = new HotelManager();
		manager.serving();

		PeopleTempleRules temple = new PeopleTempleRules();
		temple.prayer();

		GannavaramAirport plane = new GannavaramAirport();
		plane.carry();

		CinemaTheaterRules rule = new CinemaTheaterRules();
		rule.watching();

		ParentHomeRules home = new ParentHomeRules();
		home.silent();

		BotherringHusbandRule bothering = new BotherringHusbandRule();
		bothering.cooking();

		HouseWifeRules wife = new HouseWifeRules();
		wife.noDrinking();

		DancerPubRules pub = new DancerPubRules();
		pub.entryPass();

		EmployeeCompanyRules company = new EmployeeCompanyRules();
		company.timings();

		DesignPatentRule patent = new DesignPatentRule();
		patent.draw();

		AccountBankRule bank = new AccountBankRule();
		bank.transaction();

		StudentVtuRules vtu = new StudentVtuRules();
		vtu.teaching();

	}

}
