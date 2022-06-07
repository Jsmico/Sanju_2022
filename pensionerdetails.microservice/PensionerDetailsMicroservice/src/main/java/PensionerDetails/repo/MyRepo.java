package PensionerDetails.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import PensionerDetails.bean.PensionerDetails;
@Repository
public interface MyRepo extends JpaRepository<PensionerDetails, Long>{


	}
