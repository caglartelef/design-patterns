package com.caglartelef.behavioral.chainofresponsibility;

public abstract class Is {
	
protected Is	 sonrakiIs;
	
	
	public void nextIs(Is sonrakiIs)
	{
		this.sonrakiIs = sonrakiIs;
	}
	
	
	public final void isYap()
	{
		this.yap();
		if(this.getSonrakiIs()!=null)
		{
			this.sonrakiIs.isYap();
		}
		else
		{
			System.out.println("Ýþler bitti.");
		}
	}
	
	public abstract void yap();


	public Is getSonrakiIs() {
		return sonrakiIs;
	}


	public void setSonrakiIs(Is sonrakiIs) {
		this.sonrakiIs = sonrakiIs;
	}
	
}
