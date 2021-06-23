package kodlamaio.demo.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.demo.business.abstracts.JobTitleService;
import kodlamaio.demo.entities.concretes.JobTitle;

@RestController
@RequestMapping("/api/jops")
public class JobTitleControllers {

	private JobTitleService jobTitleServices;

	@Autowired
	public JobTitleControllers(JobTitleService jobTitleServices) {
		super();
		this.jobTitleServices = jobTitleServices;
	}
	
	@GetMapping("/getall")
	public List<JobTitle> getAll(){
		return this.jobTitleServices.getAll();
	}
}
