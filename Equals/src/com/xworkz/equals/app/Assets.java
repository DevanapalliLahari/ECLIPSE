package com.xworkz.equals.app;

public class Assets {
	
	private String owner;
	private long marketDemand;
	private String type;
	public Assets(String owner, long marketDemand, String type) {
		super();
		System.out.println("Running int boolean consts in Assets..");
		this.owner = owner;
		this.marketDemand = marketDemand;
		this.type = type;
	}
	
	@Override
	public String toString() {
		return "owner "+this.owner +" marketDemand "+this.marketDemand + " type "+this.type;
	}
	
	public String getOwner() {
		return owner;
	}
	public long getMarketDemand() {
		return marketDemand;
	}
	public String getType() {
		return type;
	}
	
	@Override
	public boolean equals(Object obj) {
		System.out.println("invoking Object method");
		if(obj!=null)
		{
			System.out.println("Argument is not null,Do comparision");
			if(obj instanceof Assets)
			{
			System.out.println(this);
			System.out.println(obj);
			Assets casted=(Assets)obj;
			if(this.owner==casted.owner&&this.marketDemand==casted.marketDemand&&type==casted.type)
			{
				System.out.println("Both  are same...");
				return true;
			}else {
				System.out.println("Both  are not same...");
			}
			}
			else {
				System.out.println("Assets...");
			}
		}
		else {
			System.err.println("Argument is null,Skip comparision");
		}
		return false;
		
}

		
}

