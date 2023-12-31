package com.ucuncubinyil.reflection;

public class Ornek {

private int sayi;
	
	public void goster() {
		System.out.println("goster() aldığı parametre yok");
	}
	
	public String gosterString(String temp) {
		System.out.println("gosterString() String parametre : " +temp);
		return temp;
	}
	
	public int gosterInteger(int temp) {
		System.out.println("gosterInteger() Integer paramtre: " +temp);
		return temp;
	}
	
	public void setSayi(int sayi)
	{
		this.sayi = sayi;
		System.out.println("setSayi() setlenen sayi : " +sayi);
	}
	
	public void gosterSayi()
	{
		System.out.println("gosterSayi() : " +this.sayi);
	}

}


