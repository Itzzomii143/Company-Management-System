package com.app;

import java.util.List;

import org.springframework.stereotype.Service;

interface Companyrequests{
	public List<Company> fetchAllCompany();
	Company addCompany(Company company);
	Company getCompanyById(Long id);
	 void deleteCompany(Long id);
}
@Service
public class CompanyService implements Companyrequests{
	
	private final CompanyRepository companyRepo ;

	
	public CompanyService(CompanyRepository companyRepo) {
		super();
		this.companyRepo = companyRepo;
	}

	@Override
	public List<Company> fetchAllCompany() {
		return companyRepo.findAll();
	}
	
	@Override 
	public Company getCompanyById(Long id) {
		return companyRepo.findById(id).orElseThrow(() -> new RuntimeException("Company not found"));
	}
	

	@Override
	public Company addCompany( Company company) {
		return companyRepo.save(company);
	}
	
	
	@Override 
	 public void deleteCompany(Long id) {
		 companyRepo.deleteById(id);
	}
	
	
	
	

}
