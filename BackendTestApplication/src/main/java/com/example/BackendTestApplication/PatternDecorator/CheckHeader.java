package com.example.BackendTestApplication.PatternDecorator;


import com.example.BackendTestApplication.Models.Check;

public class CheckHeader  extends DecoratorCheck{

	public CheckHeader(CheckRender checkRender) {
		super(checkRender);
	}
	public String createHeader(Check check) {
		return String.format("%s\n%30s\n%29s\n%40s\n%-10s%-10s\t%20.10s\n%42.10s\n%s\n","-".repeat(55), check.getName().strip(), check.getNameOrg(), check.getPlace(), "Number: #",check.getNumber(), check.getDate(), check.getTime(), "-".repeat(55));
		 
	}
	
	
	@Override
	public String chekRenderMethod(Check check) {
		return createHeader(check)+super.chekRenderMethod(check);
	}
}
