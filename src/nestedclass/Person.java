package nestedclass;

public class Person {

	private String name;
	private String gender;
	private int age;
	
	
	public Person(){}
	public Person(String name,String gender, int age){
		this.name=name;this.gender=gender;this.age=age;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}


	static class Address{
		private String Street;
		private String houseNumber;
		private String commune;
		private String district;
		private String province;
		
		public String getStreet() {
			return Street;
		}
		public void setStreet(String street) {
			Street = street;
		}
		public String getHouseNumber() {
			return houseNumber;
		}
		public void setHouseNumber(String houseNumber) {
			this.houseNumber = houseNumber;
		}
		public String getCommune() {
			return commune;
		}
		public void setCommune(String commune) {
			this.commune = commune;
		}
		public String getDistrict() {
			return district;
		}
		public void setDistrict(String district) {
			this.district = district;
		}
		public String getProvince() {
			return province;
		}
		public void setProvince(String province) {
			this.province = province;
		}

		@Override
		public String toString() {
			
			return "Street : " +this.getStreet() + "\nhouse number : " +this.getHouseNumber()+
					"\ncommune : "+this.getCommune()+ "\ndistrict : " +this.getDistrict()+
					"\nprovince : "+this.getProvince();
		}
	}
	
}
