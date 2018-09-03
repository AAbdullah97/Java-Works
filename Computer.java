package homework2;

public class Computer 
{
	String Name;
	int SerialNo;
	double version;
	
	
		 public void GetData()
			{
				Name = "ASUS";
				SerialNo = 505;
				version=2.3;
			}
			
		public void DisplaySerial()
			{
			
            System.out.println("Serial Number is : " +SerialNo);
			
			}
					
		public void DisplayName() 
			{
			
			System.out.println(Name);
			
			}
		

		public void DisplayVersion()
		{
		
        
		System.out.println("Version is : " +version);

		}
	}

