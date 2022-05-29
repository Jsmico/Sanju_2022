package employee.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import employee1.bean.employeeDetails;
@Repository
public interface EmployeeDetails extends JpaRepository<employeeDetails, Long>{

}
