package exception;

public class Student {
	
	private float score;
	private String gender;
	
	Student(float s) throws ScoreWrongFormatException {
		if(0<s && s>100){
			throw new ScoreWrongFormatException();
		}
	}
	
	public void setScore(float s){
		this.score=s;
	}
	public float getScore(){
		return this.score;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) throws WrongFormatException {
		if("male".equalsIgnoreCase(gender) | "female".equalsIgnoreCase(gender) ){
			this.gender=gender;
		}else throw new WrongFormatException("you enter gender : \""+gender+"\" wrong format");;
	}
	
	
	
}
