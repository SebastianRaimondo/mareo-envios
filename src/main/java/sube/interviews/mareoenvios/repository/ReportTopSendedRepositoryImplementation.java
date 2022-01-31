package sube.interviews.mareoenvios.repository;


import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ReportTopSendedRepositoryImplementation implements ReportTopSendedRepository{

    @Autowired
	private EntityManager eM;
	
	@Override
	public List<?> getReport(){
        Query query = eM.createNativeQuery("SELECT\r\n"
        		+ "    p.id, \r\n"
        		+ "    p.description, \r\n"
        		+ "	sum(si.product_count)\r\n"
        		+ "FROM\r\n"
        		+ "    product p\r\n"
        		+ "        INNER JOIN\r\n"
        		+ "    shipping_item AS si ON p.id = si.product_id\r\n"
        		+ "    group by p.id\r\n"
        		+ "	order by sum(si.product_count) desc\r\n"
        		+ "    limit 0,3");
		List<?> reportList = query.getResultList();
        return reportList;
	}

}
