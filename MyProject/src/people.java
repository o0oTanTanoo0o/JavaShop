
public class people {
	public final String name;
	public final int age;
	
	public static class Builder{
		private String name = "Tan";

		private int age = 20;
		
		private Builder() {}
		
		public Builder Name(String name) {
			this.name = name;
			return this;
		}
		public Builder Age(int age) {
			this.age = age;
			return this;
		}
	}
	
}
