package PensionerDetails.services;

import PensionerDetails.bean.PensionerDetails;

public interface PensionerService {
	
	//GET PensionerDetailss service
	PensionerDetails getPensionerDetailsByAaddhar(long aadharcardid);

	
	//post
	Integer pensionCalculator(double basicsalary,double dearnessallowance,int workedageinorganization);

}

