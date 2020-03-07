package com.project.loginservice.service;

import java.util.List;
import com.project.loginservice.pojo.BuyerSignupPojo;

public interface BuyerSignupService {

	
	BuyerSignupPojo validateBuyerSignup(BuyerSignupPojo buyerSignupPojo);
	BuyerSignupPojo getBuyer(Integer buyerId );
}
