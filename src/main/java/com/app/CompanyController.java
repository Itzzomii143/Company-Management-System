package com.app;


import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/companies")

public class CompanyController {

	private final CompanyService companyService;

	public CompanyController(CompanyService companyService) {
		super();	
		this.companyService = companyService;
	}
	
	@GetMapping
	public ResponseEntity<String> getAllCompany(Model model) {
		model.addAttribute("companies" ,companyService.fetchAllCompany());
		return ResponseEntity.ok("companies");

	}
	
	@GetMapping("/{id}")
	public ResponseEntity<String> getAllCompany(@PathVariable Long id) {
		Company company =companyService.getAllCompanyById(id);
		if (company == null) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok("companies");
	}
	
	
	@GetMapping("/add")
	public  ResponseEntity<String> showAddCompanyForm(Model model){
		model.addAttribute("company", new Company()); 
		return ResponseEntity.ok("add-company"); 
	} 
	
	@PostMapping("/save")
	public  ResponseEntity<String> saveCompany(@ModelAttribute Company company) {
		 companyService.addCompany(company);
		 return ResponseEntity.ok("redirect:/companies"); 
	}
	
	@GetMapping("/delete/{id}")
	public  ResponseEntity<String> deleteCompany(@PathVariable Long id) {
		 companyService.deleteCompany(id);
		 return ResponseEntity.ok("redirect:/companies");
	}
	
}
