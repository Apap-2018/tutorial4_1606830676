package com.apap.tutorial4.service;

import java.util.List;
import java.util.Optional;
import com.apap.tutorial4.model.DealerModel;

/**
 * DealerService
 */
public interface DealerService {
	List<DealerModel> getAllDealer();
	Optional<DealerModel> getDealerDetailById(Long id);
	
	void addDealer(DealerModel dealer);
	void deleteDealerById(Long dealerId);
	void updateDealer(Long dealerId, DealerModel newDealer);
}