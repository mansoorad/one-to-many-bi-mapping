package com.in.onetomanybi1.controller;

import java.util.ArrayList;
import java.util.List;

import com.ty.onttomanybi1.dao.PhoneDao;
import com.ty.onttomanybi1.dto.Phone;
import com.ty.onttomanybi1.dto.Sim;

public class SimMain {
	public static void main(String[] args) {
		Phone phone = new Phone();
		phone.setName("Raghu");
		phone.setBrand("Vivo");
		phone.setPrice(15000);
		
		Sim sim1 = new Sim();
		sim1.setName("raj");
		sim1.setCompany("Airtel");
		sim1.setPrice(100);
		sim1.setPhone(phone);
		
		
		Sim sim2 = new Sim();
		sim2.setName("rags");
		sim2.setCompany("Jio");
		sim2.setPrice(80);
		sim2.setPhone(phone);
		
		List<Sim> sims = new ArrayList();
		sims.add(sim1);
		sims.add(sim2);
		
		phone.setSims(sims);
		
		PhoneDao dao = new PhoneDao();
		dao.savePhone(phone);
	}
}
