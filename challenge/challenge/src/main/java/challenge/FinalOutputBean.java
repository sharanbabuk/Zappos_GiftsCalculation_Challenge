package src.main.java.challenge;

import java.io.Serializable;
import java.util.List;

public class FinalOutputBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5707191583149141087L;
	private List<Results> results;
	private int statusCode;
	private String term;
	private String originalTerm;
	private int currentResultCount;
	private int totalResultCount;

	public FinalOutputBean() {
	}

	public List<Results> getResults() {
		return results;
	}

	public void setResults(List<Results> results) {
		this.results = results;
	}

	public int getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}

	public String getTerm() {
		return term;
	}

	public void setTerm(String term) {
		this.term = term;
	}

	public String getOriginalTerm() {
		return originalTerm;
	}

	public void setOriginalTerm(String originalTerm) {
		this.originalTerm = originalTerm;
	}

	public int getCurrentResultCount() {
		return currentResultCount;
	}

	public void setCurrentResultCount(int currentResultCount) {
		this.currentResultCount = currentResultCount;
	}

	public int getTotalResultCount() {
		return totalResultCount;
	}

	public void setTotalResultCount(int totalResultCount) {
		this.totalResultCount = totalResultCount;
	}

}
