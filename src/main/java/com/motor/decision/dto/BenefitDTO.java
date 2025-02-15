package com.motor.decision.dto;

public class BenefitDTO {
	private String benefit;
	private Boolean hasBenefit;
	private String rule;
	
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
	
    public String getRule() {
		return rule;
	}
	public void setRule(String rule) {
		this.rule = rule;
	}
	public void setHasBenefit(Boolean hasBenefit) {
		this.hasBenefit = hasBenefit;
	}
    @Override
    public String toString() {
        return "TiString{" +
                "benefit='" + benefit + '\'' +
                ", hasBenefit=" + hasBenefit +
                ", rule='" + rule + '\'' +
                '}';
    }

}
