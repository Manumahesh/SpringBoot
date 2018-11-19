package com.perfaware.SpringBootSample;

public class PostClass {
		
		private String name;
		private String role;
		
		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getRole() {
			return role;
		}

		public void setRole(String role) {
			this.role = role;
		}

		PostClass(){}

		@Override
		public String toString() {
			String a = name+"  "+role;
			return a;
		}	
}
