package com.motor.decision.dto;

public class BenefitDTO {
	private String benefit;
	private Boolean hasBenefit;
	
	
	public String getBenefit() {
		return benefit;
	}
	public void setBenefit(String benefit) {
		this.benefit = benefit;
	}
	public Boolean getHasBenefit() {
		return hasBenefit;
	}
	public void setHasBenefit(boolean hasBenefit) {
		this.hasBenefit = hasBenefit;
	}
	
    @Override
    public String toString() {
        return "BenefitDTO [benefit=" + benefit + ", hasBenefit=" + hasBenefit + "]";
    }

}
