package com.motor.decision.dto;

import java.util.ArrayList;
import java.util.List;

public class PersonDTO {
    private String name;
    private int age;
    private String sex;
    private Boolean isWorking;
    private double income;
	private String maritalStatus;
	private String educationLevel;
	private Boolean hasChildren;
	private int numChildren;
	private String healthCondition;
	private Boolean disabilityStatus;
	private String region;
	private String jobType;
	private int yearsWorked;
	private String housingType;
	private Boolean student;
	private String citizenshipStatus;
	private int creditScore;
	private Boolean retired;
    private List<BenefitDTO> LisBenefit;

    public PersonDTO() {
    	this.LisBenefit = new ArrayList<BenefitDTO>();
    }

    // Getters e Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Boolean getIsWorking() {
        return isWorking;
    }

    public void setIsWorking(Boolean isWorking) {
        this.isWorking = isWorking;
    }
    
    public void addLisBenefit(BenefitDTO dto) {
    	LisBenefit.add(dto);
    }

	public List<BenefitDTO> getLisBenefit() {
		return LisBenefit;
	}

	public void setLisBenefit(List<BenefitDTO> lisBenefit) {
		LisBenefit = lisBenefit;
	}
		
	
    public double getIncome() {
		return income;
	}

	public void setIncome(double income) {
		this.income = income;
	}

	public String getMaritalStatus() {
		return maritalStatus;
	}

	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

	public String getEducationLevel() {
		return educationLevel;
	}

	public void setEducationLevel(String educationLevel) {
		this.educationLevel = educationLevel;
	}

	public boolean isHasChildren() {
		return hasChildren;
	}

	public void setHasChildren(boolean hasChildren) {
		this.hasChildren = hasChildren;
	}

	public int getNumChildren() {
		return numChildren;
	}

	public void setNumChildren(int numChildren) {
		this.numChildren = numChildren;
	}

	public String getHealthCondition() {
		return healthCondition;
	}

	public void setHealthCondition(String healthCondition) {
		this.healthCondition = healthCondition;
	}

	public boolean isDisabilityStatus() {
		return disabilityStatus;
	}

	public void setDisabilityStatus(boolean disabilityStatus) {
		this.disabilityStatus = disabilityStatus;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getJobType() {
		return jobType;
	}

	public void setJobType(String jobType) {
		this.jobType = jobType;
	}

	public int getYearsWorked() {
		return yearsWorked;
	}

	public void setYearsWorked(int yearsWorked) {
		this.yearsWorked = yearsWorked;
	}

	public String getHousingType() {
		return housingType;
	}

	public void setHousingType(String housingType) {
		this.housingType = housingType;
	}

	public boolean isStudent() {
		return student;
	}

	public void setStudent(boolean isStudent) {
		this.student = isStudent;
	}

	public String getCitizenshipStatus() {
		return citizenshipStatus;
	}

	public void setCitizenshipStatus(String citizenshipStatus) {
		this.citizenshipStatus = citizenshipStatus;
	}

	public int getCreditScore() {
		return creditScore;
	}

	public void setCreditScore(int creditScore) {
		this.creditScore = creditScore;
	}

	public boolean isRetired() {
		return retired;
	}

	public void setRetired(boolean isRetired) {
		this.retired = isRetired;
	}

	@Override
	public String toString() {
	    StringBuilder sb = new StringBuilder();
	    sb.append("PersonDTO {")
	      .append("name='").append(name).append('\'')
	      .append(", age=").append(age)
	      .append(", sex='").append(sex).append('\'')
	      .append(", isWorking=").append(isWorking)
	      .append(", income=").append(income)
	      .append(", maritalStatus='").append(maritalStatus).append('\'')
	      .append(", educationLevel='").append(educationLevel).append('\'')
	      .append(", hasChildren=").append(hasChildren)
	      .append(", numChildren=").append(numChildren)
	      .append(", healthCondition='").append(healthCondition).append('\'')
	      .append(", disabilityStatus=").append(disabilityStatus)
	      .append(", region='").append(region).append('\'')
	      .append(", jobType='").append(jobType).append('\'')
	      .append(", yearsWorked=").append(yearsWorked)
	      .append(", housingType='").append(housingType).append('\'')
	      .append(", isStudent=").append(student)
	      .append(", citizenshipStatus='").append(citizenshipStatus).append('\'')
	      .append(", creditScore=").append(creditScore)
	      .append(", isRetired=").append(retired)
	      .append(", LisBenefit=").append(LisBenefit)
	      .append(" }");
	    return sb.toString();
	}

    
}
