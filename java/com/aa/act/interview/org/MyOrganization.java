package com.aa.act.interview.org;

import com.aa.act.interview.org.HRInformation.HRInformation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MyOrganization extends Organization {

	@Override
	protected HashMap<String,Position> createOrganization() {
		HashMap<String,Position> list = new HashMap<>();
		Position ceo = new Position("CEO");

		Position pres = new Position("President");
		ceo.addDirectReport(pres);

		Position vpm = new Position("VP Marketing");
		pres.addDirectReport(vpm);
		Position vps = new Position("VP Sales");
		pres.addDirectReport(vps);
		Position vpf = new Position("VP Finance");
		pres.addDirectReport(vpf);
		Position coo = new Position("COO");
		pres.addDirectReport(coo);
		Position cio = new Position("CIO");
		ceo.addDirectReport(cio);
		Position vpt = new Position("VP Technology");
		cio.addDirectReport(vpt);
		Position vpi = new Position("VP Infrastructure");
		cio.addDirectReport(vpi);
		Position dea = new Position("Director Enterprise Architecture");
		vpt.addDirectReport(dea);
		Position dct = new Position("Director Customer Technology");
		vpt.addDirectReport(dct);
		Position s = new Position("Salesperson");
		vps.addDirectReport(s);
		list.put(ceo.getTitle(),ceo);
		list.put(pres.getTitle(),pres);
		list.put(vpm.getTitle(),vpm);
		list.put(vps.getTitle(),vps);
		list.put(vpf.getTitle(),vpf);
		list.put(coo.getTitle(),coo);
		list.put(vpt.getTitle(),vpt);
		list.put(vpi.getTitle(),vpi);
		list.put(dea.getTitle(),dea);
		list.put(dct.getTitle(),dct);
		list.put(s.getTitle(),s);
		return list;
	}

	public static final void main(String... args) {
		MyOrganization myOrg = new MyOrganization();
		List<HRInformation> hireInfo= new ArrayList<>();
		HRInformation hr = myOrg.hire(new Name("Doug", "Parker"), "CEO");
		hireInfo.add(hr);
		hr = myOrg.hire(new Name("Robert", "Isom"), "President");
		hireInfo.add(hr);
		hr = myOrg.hire(new Name("Gandalf", "Gray"), "Director Enterprise Architecture");
		hireInfo.add(hr);
		hr = myOrg.hire(new Name("Head", "Geek"), "Director Customer Technology");
		hireInfo.add(hr);
		hr = myOrg.hire(new Name("Jane", "Smith"), "VP Marketing");
		hireInfo.add(hr);
		hr = myOrg.hire(new Name("Jim", "Jones"), "VP Sales");
		hireInfo.add(hr);
		hr = myOrg.hire(new Name("Bean", "Counter"), "VP Finance");
		hireInfo.add(hr);
		hr = myOrg.hire(new Name("Maya", "Liebman"), "CIO");
		hireInfo.add(hr);
		hr = myOrg.hire(new Name("Danielle", "Hoover"), "VP Technology");
		hireInfo.add(hr);
		hr = myOrg.hire(new Name("Scape", "Goat"), "VP Infrastructure");
		hireInfo.add(hr);
		hr = myOrg.hire(new Name("Slick", "Willie"), "Salesperson");
		hireInfo.add(hr);
		hireInfo.forEach(a -> {
			        System.out.println("Hired Employees:" );
			        System.out.println("   Title:" + a.getPositionTitle());
			        System.out.println("         Employee:" + a.getEmployee().getIdentifier());
					System.out.println("         Employee: Last Name:" + a.getEmployee().getName().getLast() +" First Name:"+ a.getEmployee().getName().getFirst());
					System.out.println("         HireDate:" + a.getHiredate());
			        System.out.println("         StartDate:" + a.getStartdate());
			        System.out.println("         Salary:" + a.getSalary());
					System.out.println("         Benifits : ");
					a.getBenifitsList().forEach(b->{ System.out.println("                    " +b.getBenifits().getBenifitName());
						                             System.out.println("                    " +b.getPercentageDollerQualifier());
						                             System.out.println("                    " +b.getPercentageDollerValue());} );
		            });
	}
}
