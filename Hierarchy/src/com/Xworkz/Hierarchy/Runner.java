package com.Xworkz.Hierarchy;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Court court4=new Court();
		court4.justice();
		
		
		Court court3=new SupremeCourt();
		court3.justice();
		
		SupremeCourt supremeCourt3=new SupremeCourt();
		supremeCourt3.justice();
		supremeCourt3.importantCase();
		
		
		
		Court court2=new HighCourt();
		court2.justice();
		
		SupremeCourt supremeCourt2=new HighCourt();
		supremeCourt2.justice();
		supremeCourt2.importantCase();
		
		HighCourt highCourt2=new HighCourt();
		highCourt2.justice();
		highCourt2.importantCase();
		highCourt2.criminalCase();
		highCourt2.forgeryCase();
		
		
		
		
		Court court1=new CivilCourt();
		court1.justice();
		
		SupremeCourt supremeCourt1=new CivilCourt();
		supremeCourt1.justice();
		supremeCourt1.importantCase();
		
		HighCourt highCourt1=new CivilCourt();
		highCourt1.justice();
		highCourt1.importantCase();
		highCourt1.criminalCase();
		highCourt1.forgeryCase();
		
		CivilCourt civilCourt1=new CivilCourt();
		civilCourt1.justice();
		civilCourt1.importantCase();
		civilCourt1.criminalCase();
		civilCourt1.forgeryCase();
		civilCourt1.propertyCase();
		civilCourt1.theftCase();
		
		Court court=new FamilyCourt();
		court.justice();
		 
		SupremeCourt supremeCourt=new FamilyCourt();
		supremeCourt.justice();
		supremeCourt.importantCase();
		
		HighCourt highCourt=new FamilyCourt();
		highCourt.justice();
		highCourt.importantCase();
		highCourt.criminalCase();
		highCourt.forgeryCase();
		
		 
		CivilCourt civilCourt=new FamilyCourt();
		civilCourt.justice();
		civilCourt.importantCase();
		civilCourt.criminalCase();
		civilCourt.forgeryCase();
		civilCourt.propertyCase();
		civilCourt.theftCase();
		
		
		
		FamilyCourt familyCourt=new FamilyCourt();
		
		familyCourt.justice();
		familyCourt.importantCase();
		familyCourt.forgeryCase();
		familyCourt.divorce();
		familyCourt.criminalCase();
		familyCourt.propertyCase();
		familyCourt.theftCase();
		
		
				
		

	}

}
