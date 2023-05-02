package com.aa.act.interview.org;

import com.aa.act.interview.org.HRInformation.HRInformation;
import com.aa.act.interview.org.HRInformation.PositionBenifits;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;

import java.util.List;
import java.util.Map;
import java.util.Optional;

public abstract class Organization {

	private String organizationName;

	private HashMap<String,Position> root;

	public Organization() {
		root = createOrganization();
	}

	protected abstract HashMap<String,Position> createOrganization();

	/**
	 * hire the given person as an employee in the position that has that title
	 *
	 * @param person
	 * @param title
	 * @return the newly filled position or empty if no position has that title
	 */
	public HRInformation hire(Name person, String title) {
		//your code here
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/MM/yyyy");
		String date = LocalDate.now().format(formatter);

		//convert String to LocalDate
		LocalDate localDate = LocalDate.parse(date, formatter);
		Employee emp = new Employee(person);
		HRInformation hrInformation = new HRInformation().HireInformation(emp,title,localDate,localDate,10000000.00
				,new MyHRBenifits().MyHRBenifits(new Position(title)));
		return hrInformation;
	}

	@Override
	public String toString() {
		return printOrganization(root);
	}

	private String printOrganization(HashMap<String, Position> pos) {
		StringBuffer sb = new StringBuffer();

		for(Map.Entry<String,Position> p : pos.entrySet()) {
			 sb.append(p.getKey() +"-"+ p.getValue().toString());
			 p.getValue().getDirectReports().forEach(a -> System.out.println(" Employee:" + a.getEmployee()+ " Title:" + a.getTitle() + " Other Info:" ));
		}
		return sb.toString();
	}
}
