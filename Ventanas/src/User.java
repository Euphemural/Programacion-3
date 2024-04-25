import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
class User{
			private String id;
			private String firstName;
			private String lastName;
			private String maidenName;
			private int age;
			private String gender;
			private String email;
			private String phone;
			private String username;
			private String password;
			private String birthDate;
			
		    public String getId() 
		    { 
		    	return id; 
		    }
		    public void setId(String id) 
		    { 
		    	this.id = id; 
		    }
		    
		    public String getfirstName() 
		    { 
		    	return firstName; 
		    }
		    public void setfirstName(String firstName) 
		    { 
		    	this.firstName = firstName; 
		    }
		    
		    public String getlastName() 
		    { 
		    	return lastName; 
		    }
		    public void setlastName(String lastName)
		    {
		        this.lastName = lastName;
		    }
		    
		    public String getmaidenName() 
		    { 
		    	return maidenName; 
		    }
		    public void setmaidenName(String maidenName)
		    {
		        this.maidenName = maidenName;
		    }
		    
		    public int getage() 
		    { 
		    	return age; 
		    }
		    public void setage(int age)
		    {
		        this.age = age;
		    }
		    
		    public String getgender() 
		    { 
		    	return gender; 
		    }
		    public void setgender(String gender)
		    {
		        this.gender = gender;
		    }
		    			
		    public String getemail() 
		    { 
		    	return email; 
		    }
		    public void setemail(String email)
		    {
		        this.email = email;
		    }
		    			
		    public String getphone() 
		    { 
		    	return phone; 
		    }
		    public void setphone(String phone)
		    {
		        this.phone = phone;
		    }
		    			
		    public String getusername() 
		    { 
		    	return username; 
		    }
		    public void setusername(String username)
		    {
		        this.username = username;
		    }
			
		    public String getpassword() 
		    { 
		    	return password; 
		    }
		    public void setpassword(String password)
		    {
		        this.password = password;
		    }
			
		    public String getbirthDate() 
		    { 
		    	return birthDate; 
		    }
		    public void setbirthDate(String birthDate)
		    {
		        this.birthDate = birthDate;
		    }
		    
		    
		    @Override public String toString()
		    {
		        return "Employee [id=" + id + ", first name=" + firstName + 
		        		", last Name=" + lastName + ", maiden Name=" + maidenName + 
		        		", age=" + age + ", gender=" + gender + ", email=" + email + 
		        		", phone=" + phone + ", username=" + username + 
		        		", password=" + password + ", birthDate=" + birthDate +"]";
		    }
		}

