package sube.interviews.mareoenvios.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import sube.interviews.mareoenvios.service.ReportTopSendedService;

@RestController
@RequestMapping("/reports")
public class ReportTopSendedController {
	
	@Autowired
	private ReportTopSendedService reportTopSendedService;
		
	@GetMapping("/topSended")
	public ResponseEntity<List<?>> getReport(){
		List<?> report = this.reportTopSendedService.getReport();
		return new ResponseEntity<List<?>>(report, HttpStatus.OK);
	}
	
}
