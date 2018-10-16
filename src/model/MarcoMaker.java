package model;

public class MarcoMaker
{
	private double legCount;
	private int eyeCount;
	private int armCount;
	private boolean whereSupreme;

	public MarcoMaker()
	{
	}

	public MarcoMaker(double legCount, int eyeCount, int armCount,
			boolean whereSupreme)
	{
		this.legCount = legCount;
		this.eyeCount = eyeCount;
		this.armCount = armCount;
		this.whereSupreme = whereSupreme;
	}

	public double getLegCount()
	{
		return legCount;
	}

	public int getEyeCount()
	{
		return eyeCount;
	}

	public int getArmCount()
	{
		return armCount;
	}

	public boolean getWhereSupreme()
	{
		return whereSupreme;
	}

	public void setLegCount(double legs)
	{
		this.legCount = legs;
	}
	
	public void setEyeCount(int eyes)
	{
		this.eyeCount = eyes;
	}
	
	public void setArmCount(int arms)
	{
		this.armCount = arms;
	}
	
	public void setWhereSupreme(boolean supreme)
	{
		this.whereSupreme = supreme;
	}

}