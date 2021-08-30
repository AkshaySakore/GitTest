package Containment;

public class Pen {
	int caplength;
	String brand;
	Refill r;
	public Pen()
	{
		
	}
	public Pen(int caplength, String brand,Refill r) {
	
		this.caplength = caplength;
		this.brand = brand;
		this.r= r;
	}
	public Refill getR() {
		return r;
	}
	public void setR(Refill r) {
		this.r = r;
	}
	public int getCaplength() {
		return caplength;
	}
	public void setCaplength(int caplength) {
		this.caplength = caplength;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public static void main(String[] args) {
		
		Pen p=new Pen(2, "cello", new Refill("black", 5, new Nib("ball pen", 5)));
		
		Pen p1=new Pen();
		p1.setCaplength(2);
		p1.setBrand("cello");
		p1.setR(new Refill());
		p1.getR().setInkcolor("black");
		p1.getR().setLength(5);
		p1.getR().setN(new Nib());
		p1.getR().getN().setMaterialType("ballpen");
		p1.getR().getN().setWidth(5);
		System.out.println("cap length "+p1.getCaplength()+" brand "+p1.getBrand());
		System.out.println("ink color "+p1.getR().getInkcolor()+"length "+p1.getR().getLength());
		System.out.println("material type "+p1.getR().getN().getMaterialType()+" width "+p1.getR().getN().getWidth());
	}
		

}


class Refill
{
	String inkcolor;
	int length;
	Nib n;
	public Refill()
	{
		
	}
	public Refill(String inkcolor, int length, Nib n) {
		this.inkcolor = inkcolor;
		this.length = length;
		this.n = n;
	}
	public String getInkcolor() {
		return inkcolor;
	}
	public void setInkcolor(String inkcolor) {
		this.inkcolor = inkcolor;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public Nib getN() {
		return n;
	}
	public void setN(Nib n) {
		this.n = n;
	}
	
}

class Nib {
	String materialType;
	int width;
	public Nib()
	{
		
	}
	public Nib(String materialType, int width) {
		this.materialType = materialType;
		this.width = width;
	}
	public String getMaterialType() {
		return materialType;
	}
	public void setMaterialType(String materialType) {
		this.materialType = materialType;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
}