package net.antra.design.dynamicproxy;

import net.antra.design.staticproxy.DepartmentService;

public class DepartmentServiceImpl implements DepartmentService {

	@Override
	public void saveDept() {
		System.out.println("Do save department logic.");
	}

}
