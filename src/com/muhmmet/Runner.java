package com.muhmmet;

import com.muhmmet.entity.Hizmetli;
import com.muhmmet.entity.Mudur;
import com.muhmmet.entity.Mutemet;
import com.muhmmet.entity.Personel;


public class Runner {

	public static void main(String[] args) {
		Mutemet mutemet = new Mutemet();
		/**
		 * abstract class -> new keyword ile nesne türetme iþlemi yapamaz
		 */
		// Personel personelabs = new Personel();
		//mutemet.MaasHesapla(new Personel()); // compiler(derleme) hata -> Cannot instantiate the type Personel
		mutemet.MaasHesapla(new Mudur());
		mutemet.MaasHesapla(new Hizmetli());
		/**
		 * Polimorhism
		 */
		Personel personel = new Mudur();
		mutemet.MaasHesapla(personel);
	}
}
