package com.training.services;

import com.training.model.Function;
import com.training.model.*;


//A class can only extend another class ,but it can many interfaces

public class CurrencyConverter implements Function,ConditionCheck {

	@Override
	public boolean test(int value) {
		// TODO Auto-generated method stub
		return value>500;
	}

	@Override
	public double apply(double value) {
		// TODO Auto-generated method stub
		return value*100;
	}

}
