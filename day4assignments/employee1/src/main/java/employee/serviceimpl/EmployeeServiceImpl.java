package employee.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import employee.repository.EmployeeDetails;
import employee.service.EmployeeService;
import employee1.bean.employeeDetails;

@Service
public class EmployeeServiceImpl implements EmployeeService {
@Autowired
EmployeeDetails employeeDetails;
	public employeeDetails addemployee(employeeDetails employee) {
		// TODO Auto-generated method stub
		employeeDetails addemployee = employeeDetails.save(employee);
				
		return addemployee;//returning to the controller
	}

}
