package com.app;

import java.util.List;

import org.springframework.stereotype.Service;

interface Companyrequests{
	public List<Company> fetchAllCompany();
	Company addCompany(Company company);
	Company getAllCompanyById(Long id);
	public void deleteCompany(Long id);
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
	
	public Company getAllCompanyById(Long id) {
		return companyRepo.findById(id).orElseThrow(() -> new RuntimeException("Company not found"));
	}
	

	@Override
	public Company addCompany( Company company) {
		return companyRepo.save(company);
	}
	
	public 

	@Override
	void deleteCompany(Long id) {
		 companyRepo.deleteById(id);
	}
	
	
	
	

}
