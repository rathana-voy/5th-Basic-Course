package javavariable;

public class មនុស្ស  {
	private String ឈ្នេាះ;
	private String ភេទ;
	private String ថ្ងៃខែឆ្នាំកំណើត;
	public String getឈ្នេាះ() {
		return ឈ្នេាះ;
	}
	public void setឈ្នេាះ(String ឈ្នេាះ) {
		this.ឈ្នេាះ = ឈ្នេាះ;
	}
	public String getភេទ() {
		return ភេទ;
	}
	public void setភេទ(String ភេទ) {
		this.ភេទ = ភេទ;
	}
	public String getថ្ងៃខែឆ្នាំកំណើត() {
		return ថ្ងៃខែឆ្នាំកំណើត;
	}
	public void setថ្ងៃខែឆ្នាំកំណើត(String ថ្ងៃខែឆ្នាំកំណើត) {
		this.ថ្ងៃខែឆ្នាំកំណើត = ថ្ងៃខែឆ្នាំកំណើត;
	}
	
	public String toString(){
		
		return "name : "+this.getឈ្នេាះ() +"  \ngender : "+ this.getភេទ() +" \ndate of birht : "+this.getថ្ងៃខែឆ្នាំកំណើត();
	}
}
