package com.ucuncubinyil.reflection;

import java.lang.reflect.Method;

public class ReflectionTest {
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			try
			{
				//refleciton type ını bilmemize gerek kalmadan 
				//program çalışırken runtime da nesne oluşturmamızı sağlar
				Class cls = Class.forName("com.ucuncubinyil.reflection.Ornek");	
				for(Method method : cls.getDeclaredMethods())
				{
					System.out.println("Metod adı : " +method.getName()+ "\n"
					           +" Metod Dönüş Tipi : " +method.getReturnType()+ "\n"
					           + " Parametre Sayısı : "+ method.getParameterCount());
				}
			}
			catch(Exception ex)
			{
				
			}

		}
	}

