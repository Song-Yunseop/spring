package com.example.ex00.dependency.qualofier;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Qualifier("vips") @Primary
public class Vips implements Restaurant {

	@Override
	public boolean hasSalad() {
		// TODO Auto-generated method stub
		return true;
	}

}
