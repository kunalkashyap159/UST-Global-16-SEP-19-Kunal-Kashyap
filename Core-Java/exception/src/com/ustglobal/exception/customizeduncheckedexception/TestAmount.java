package com.ustglobal.exception.customizeduncheckedexception;

public class TestAmount {

	public static void main(String[] args) {
		System.out.println("Main started");
		
		ValidateAmount va = new ValidateAmount();
		try {
			va.checkAmount(20000);
			System.out.println("Withdraw your cash");
		} catch (InvalidAmountException e) {
			e.getMessage();
		}
		System.out.println("Main ended");

	}

}
