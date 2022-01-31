package sube.interviews.mareoenvios.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sube.interviews.mareoenvios.repository.ReportTopSendedRepositoryImplementation;

@Service
public class ReportTopSendedService {
	
	@Autowired
	private ReportTopSendedRepositoryImplementation reportTopSendedRepositoryImplementation;
	
	
	public List<?> getReport() {
		return this.reportTopSendedRepositoryImplementation.getReport();
	}
	


}
