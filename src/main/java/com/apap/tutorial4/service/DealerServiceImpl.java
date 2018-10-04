package com.apap.tutorial4.service;

import java.util.Optional;
import java.util.List;
import javax.transaction.Transactional;
import com.apap.tutorial4.model.DealerModel;
import com.apap.tutorial4.repository.DealerDb;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * DealerServiceImpl
 */
@Service
@Transactional
public class DealerServiceImpl implements DealerService {
	@Autowired
	private DealerDb dealerDb;
	
	@Override
	public List<DealerModel> getAllDealer(){
		return dealerDb.findAll();
	}
	
	@Override
	public Optional<DealerModel> getDealerDetailById(Long id) {
		return dealerDb.findById(id);
	}
	
	@Override
	public void addDealer(DealerModel dealer) {
		dealerDb.save(dealer);
	}
	
	@Override
	public void deleteDealerById(Long dealerId) {
		dealerDb.delete(this.getDealerDetailById(dealerId).get());
	}
	
	@Override
	public void updateDealer(Long dealerId, DealerModel newDealer) {
		DealerModel oldDealer = this.getDealerDetailById(dealerId).get();
		oldDealer.setAlamat(newDealer.getAlamat());
		oldDealer.setNoTelp(newDealer.getNoTelp());
	}
}