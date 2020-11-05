package com.vk.test;

import java.util.List;

public class LocationStats {

    private String state;
    private String country;
    private int latestTotalCases;
    private int diffFromPrevDay;
    private List<String> cases;
    private Integer sNo;
    
    public void setsNo(Integer sNo) {
		this.sNo = sNo;
	}
    
    public Integer getsNo() {
		return sNo;
	}

    public int getDiffFromPrevDay() {
        return diffFromPrevDay;
    }

    public void setDiffFromPrevDay(int diffFromPrevDay) {
        this.diffFromPrevDay = diffFromPrevDay;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getLatestTotalCases() {
        return latestTotalCases;
    }

    public void setLatestTotalCases(int latestTotalCases) {
        this.latestTotalCases = latestTotalCases;
    }
    
    public void setCases(List<String> cases) {
		this.cases = cases;
	}
    
    public List<String> getCases() {
		return cases;
	}

	@Override
	public String toString() {
		return "LocationStats [sNo=" + sNo + ", country=" + country + ", latestTotalCases=" + latestTotalCases
				+ ", diffFromPrevDay=" + diffFromPrevDay + ", cases=" + cases + ", state=" + state + "]";
	}

	
    
}

