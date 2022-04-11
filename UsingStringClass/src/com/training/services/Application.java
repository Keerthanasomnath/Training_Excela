package com.training.services;

public class Application {

	public static void main(String[] args) {

		StringService service = new StringService();

		int key = 2;
		
		
	switch (key) {
		case 1:
		 service.stringEquals("ram", "ram");	
			break;
		case 2:
			 service.stringObjectEquals();	
				break;
		case 3:
			 service.usingTrim(" ramesh   ");	
				break;
		case 4:
			 service.lengthofString("   ramesh          ");	
				break;
		case 5:
			 service.removeSpaceofString("    rava                 ");	
				break;
		case 6:
			 service.usingSubString("jolly today is friday");	
				break;
		case 7:
			 service.usingCharAtAndIndexof("Break@gmail");	
				break;
		case 8:
			 service.usingReplace("r@abc.com","welcome to chennai");	
				break;
		case 9:
			 service.usingConcat("hi", "Amma");	
				break;
		case 10:
			 service.usingCompareTo("Ram", "Ram");	
				break;
		case 11:
			 service.usingStringFormat("Ram", 89.8989898);	
				break;
		case 12:
			 service.usingStringFormat(89,77);
                    break;
		case 13:
			 service.usingStringFormat("RAM","ram");
                   break;
		case 14:
			 service.usingStringFormat(-42888L);
                   break;		
      
		default:
			break;
		}

	}

}
