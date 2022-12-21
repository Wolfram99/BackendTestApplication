package com.example.BackendTestApplication.PatternDecorator;

import com.example.BackendTestApplication.Models.Check;

public class DecoratorCheck implements CheckRender{
	CheckRender checkRender;

	public DecoratorCheck(CheckRender checkRender) {
		this.checkRender = checkRender;
	}

	@Override
	public String chekRenderMethod(Check check) {
			return checkRender.chekRenderMethod(check);
	}
	
	
}
