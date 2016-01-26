import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class ContactList{
	public static Scanner in;
	public static void main(String []args){
		Acquaintances contactList = new Acquaintances();
		try
	      {
	         FileInputStream fileIn = new FileInputStream("contactlist");
	         ObjectInputStream input = null;
			try {
				input = new ObjectInputStream(fileIn);
			} catch (IOException e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
			}
	         try {
				 contactList = (Acquaintances) input.readObject();
			} catch (IOException e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
			}
	         try {
				input.close();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
	         try {
				fileIn.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	      }catch(FileNotFoundException a)
	      {
	         System.out.println("OOPs!! File Not Found");
	      }catch(ClassNotFoundException c)
	      {
	         System.out.println("Acquaintances class not found");
	         c.printStackTrace();
	         return;
	      }
		Scanner in = new Scanner(System.in);
		boolean choose = true;
		System.out.println("\nHello!!");
		System.out.println("Welome to your Contact List!!");
		int choice,internalChoice,i;
		String userChoice;
		while(choose){
			System.out.println("\nPlease Enter your Choice");
			System.out.println("1-Create Acquaintance");
			System.out.println("2-Delete Acquaintance");
			System.out.println("3-Display entire List of Acquaintances");
			System.out.println("4-Display specific category of Acqaintances");
			System.out.println("5-Search your list of Acquaintances");
			System.out.println("6-Save and Exit");
			choice = Integer.parseInt(in.nextLine());
			switch(choice){
				case 1: System.out.println("What type of Acquaintance would you like to create?");
						System.out.println("1-Relative");
						System.out.println("2-Personal Friends");
						System.out.println("3-Professional Friends");
						System.out.println("4-Casual Acquaintance");
						System.out.print("Enter your choice : ");
						internalChoice = Integer.parseInt(in.nextLine());
						switch(internalChoice){
							case 1: Relatives newRelative = new Relatives(); 
									newRelative.relativeCreator();
									contactList.relativesList.add(newRelative);
									break;
							case 2: PersonalFriends newPersonalFriend = new PersonalFriends();
									newPersonalFriend.personalCreator();
									contactList.personalFriendsList.add(newPersonalFriend);
									break;
							case 3: ProfessionalFriends newProfessionalFriend = new ProfessionalFriends();
									newProfessionalFriend.professionalCreator();
									contactList.professionalFriendsList.add(newProfessionalFriend);
									break;
							case 4: CasualAcquaintances newCasualAcquaintance = new CasualAcquaintances();
									newCasualAcquaintance.casualCreator();
									contactList.casualAcquaintancesList.add(newCasualAcquaintance);
									break;
							default: System.out.println("Sorry. Invalid Choice.");
									 break;
						}
						try
					      {
					         FileOutputStream fileOut = new FileOutputStream("contactlist");
					         ObjectOutputStream out = new ObjectOutputStream(fileOut);
					         out.writeObject(contactList);
					         out.flush();
					         out.close();
					         fileOut.close();
					         //System.out.println("\nAll Changes have been Saved Succcessfully!!");
					         //System.out.println("Thank You");
					      }catch(IOException exe)
					      {
					          exe.printStackTrace();
					      }
						break;
				case 2: System.out.println("What type of Acquaintance would you like to delete?");
						System.out.println("1-Relative");
						System.out.println("2-Personal Friends");
						System.out.println("3-Professional Friends");
						System.out.println("4-Casual Acquaintance");
						System.out.print("Enter your choice : ");
						internalChoice = Integer.parseInt(in.nextLine());
						switch(internalChoice){
							case 1: System.out.print("Enter the Name of the Relative : ");
									userChoice = in.nextLine();
									i = 0;
									while(i<contactList.relativesList.size())
									{
										if(contactList.relativesList.get(i).relativeName.equals(userChoice)){
											break;
										}
										i++;
									}
									if(i<contactList.relativesList.size()){
										contactList.relativesList.remove(i);
										System.out.println("One entry successfully deleted.");
									}
									else{
										System.out.println("The contact of "+userChoice+" is not in this Contact List");
									}
									break;
							case 2: System.out.print("Enter the Name of the Personal Friend : ");
									userChoice = in.nextLine();
									i = 0;
									while(i<contactList.personalFriendsList.size())
									{
										if(contactList.personalFriendsList.get(i).personalFriendName.equals(userChoice)){
											break;
										}
										i++;
									}
									if(i<contactList.personalFriendsList.size()){
										contactList.personalFriendsList.remove(i);
										System.out.println("One entry successfully deleted.");
									}
									else{
										System.out.println("The contact of "+userChoice+" is not in this Contact List");
									}
									break;
							case 3: System.out.print("Enter the Name of the Professional Friend : ");
									userChoice = in.nextLine();
									i = 0;
									while(i<contactList.professionalFriendsList.size())
									{
										if(contactList.professionalFriendsList.get(i).professionalFriendName.equals(userChoice)){
											break;
										}
										i++;
									}
									if(i<contactList.professionalFriendsList.size()){
										contactList.professionalFriendsList.remove(i);
										System.out.println("One entry successfully deleted.");
									}
									else{
										System.out.println("The contact of "+userChoice+" is not in this Contact List");
									}
									break;
							case 4: System.out.print("Enter the Name of the Casual Acquaintance : ");
									userChoice = in.nextLine();
									i = 0;
									while(i<contactList.casualAcquaintancesList.size())
									{
										if(contactList.casualAcquaintancesList.get(i).casualAcquaintanceName.equals(userChoice)){
											break;
										}
										i++;
									}
									if(i<contactList.casualAcquaintancesList.size()){
										contactList.casualAcquaintancesList.remove(i);
										System.out.println("One entry successfully deleted.");
									}
									else{
										System.out.println("The contact of "+userChoice+" is not in this Contact List");
									}
									break;
							default: System.out.println("Sorry. Invalid Choice.");
									 break;
						}
						try
					      {
					         FileOutputStream fileOut = new FileOutputStream("contactlist");
					         ObjectOutputStream out = new ObjectOutputStream(fileOut);
					         out.writeObject(contactList);
					         out.flush();
					         out.close();
					         fileOut.close();
					         //System.out.println("\nAll Changes have been Saved Succcessfully!!");
					         //System.out.println("Thank You");
					      }catch(IOException exe)
					      {
					          exe.printStackTrace();
					      }
						break;
				case 3: if(contactList.relativesList.size()==0&&contactList.personalFriendsList.size()==0&&contactList.professionalFriendsList.size()==0&&contactList.casualAcquaintancesList.size()==0){
							System.out.println("Your Contact List is currently empty.");
							break;
						}
						System.out.println("Your Contact List currently has the following Contacts :\n");
						i=0;
						while(i<contactList.relativesList.size()){
							if(i==0){
								System.out.println("Contact List of Relatives :");
							}
							System.out.println("	Name: "+contactList.relativesList.get(i).relativeName);
							System.out.println("		Mobile Number: "+contactList.relativesList.get(i).relativeMobileNumber);
							System.out.println("		E-mail Address: "+contactList.relativesList.get(i).relativeEmail);
							System.out.println("		Date of Birth: "+contactList.relativesList.get(i).relativeBirthday);
							System.out.println("		Day of Last Meeting: "+contactList.relativesList.get(i).relativeDateOfLastMeeting);
							i++;
						}
						i=0;
						while(i<contactList.personalFriendsList.size()){
							if(i==0){
								System.out.println("\nContact List of Personal Friends :");
							}
							System.out.println("	Name: "+contactList.personalFriendsList.get(i).personalFriendName);
							System.out.println("		Mobile Number: "+contactList.personalFriendsList.get(i).personalFriendMobileNumber);
							System.out.println("		E-mail Address: "+contactList.personalFriendsList.get(i).personalFriendEmail);
							System.out.println("		Context of Acquaintance: "+contactList.personalFriendsList.get(i).personalFriendContextOfAcqaintance);
							System.out.println("		Date of Acquaintance: "+contactList.personalFriendsList.get(i).personalFriendDateOfAcquaintance);
							System.out.println("		Specific Events: "+contactList.personalFriendsList.get(i).personalFriendSpecificEvents);
							i++;
						}
						i=0;
						while(i<contactList.professionalFriendsList.size()){
							if(i==0){
								System.out.println("\nContact List of Professional Friends :");
							}
							System.out.println("	Name: "+contactList.professionalFriendsList.get(i).professionalFriendName);
							System.out.println("		Mobile Number: "+contactList.professionalFriendsList.get(i).professionalFriendMobileNumber);
							System.out.println("		E-mail Address: "+contactList.professionalFriendsList.get(i).professionalFriendEmail);
							System.out.println("		Specific Common Interest: "+contactList.professionalFriendsList.get(i).professionalFriendSpecificCommonInterest);
							i++;
						}
						i=0;
						while(i<contactList.casualAcquaintancesList.size()){
							if(i==0){
								System.out.println("\nContact List of Casual Acquaintances :");
							}
							System.out.println("	Name: "+contactList.casualAcquaintancesList.get(i).casualAcquaintanceName);
							System.out.println("		Mobile Number: "+contactList.casualAcquaintancesList.get(i).casualAcquaintanceMobileNumber);
							System.out.println("		E-mail Address: "+contactList.casualAcquaintancesList.get(i).casualAcquaintanceEmail);
							System.out.println("		Location and Time of Acquaintance: "+contactList.casualAcquaintancesList.get(i).casualAcquaintanceWhenAndWhere);
							System.out.println("		Circumstances of Acquaintance: "+contactList.casualAcquaintancesList.get(i).casualAcquaintanceCircumstances);
							System.out.println("		Specific Information: "+contactList.casualAcquaintancesList.get(i).casualAcquaintanceSpecificInformation);
							i++;
						}
						System.out.println("");
						break;
				case 4:	System.out.println("Which category of Acquaintances do you want to Display?");
						System.out.println("1-Relative");
						System.out.println("2-Personal Friends");
						System.out.println("3-Professional Friends");
						System.out.println("4-Casual Acquaintance");
						System.out.print("Enter your Choice : ");
						int displayChoice = Integer.parseInt(in.nextLine());
						switch(displayChoice){
							case 1: i=0;
									while(i<contactList.relativesList.size()){
										if(i==0){
											System.out.println("Contact List of Relatives :");
										}
										System.out.println("	Name: "+contactList.relativesList.get(i).relativeName);
										System.out.println("		Mobile Number: "+contactList.relativesList.get(i).relativeMobileNumber);
										System.out.println("		E-mail Address: "+contactList.relativesList.get(i).relativeEmail);
										System.out.println("		Date of Birth: "+contactList.relativesList.get(i).relativeBirthday);
										System.out.println("		Day of Last Meeting: "+contactList.relativesList.get(i).relativeDateOfLastMeeting);
										i++;
									}
									System.out.println("");
									break;
							case 2: i=0;
									while(i<contactList.personalFriendsList.size()){
										if(i==0){
											System.out.println("Contact List of Personal Friends :");
										}
										System.out.println("	Name: "+contactList.personalFriendsList.get(i).personalFriendName);
										System.out.println("		Mobile Number: "+contactList.personalFriendsList.get(i).personalFriendMobileNumber);
										System.out.println("		E-mail Address: "+contactList.personalFriendsList.get(i).personalFriendEmail);
										System.out.println("		Context of Acquaintance: "+contactList.personalFriendsList.get(i).personalFriendContextOfAcqaintance);
										System.out.println("		Date of Acquaintance: "+contactList.personalFriendsList.get(i).personalFriendDateOfAcquaintance);
										System.out.println("		Specific Events: "+contactList.personalFriendsList.get(i).personalFriendSpecificEvents);
										i++;
									}
									System.out.println("");
									break;
							case 3: i=0;
									while(i<contactList.professionalFriendsList.size()){
										if(i==0){
											System.out.println("Contact List of Professional Friends :");
										}
										System.out.println("	Name: "+contactList.professionalFriendsList.get(i).professionalFriendName);
										System.out.println("		Mobile Number: "+contactList.professionalFriendsList.get(i).professionalFriendMobileNumber);
										System.out.println("		E-mail Address: "+contactList.professionalFriendsList.get(i).professionalFriendEmail);
										System.out.println("		Specific Common Interest: "+contactList.professionalFriendsList.get(i).professionalFriendSpecificCommonInterest);
										i++;
									}
									System.out.println("");
									break;
							case 4: i=0;
									while(i<contactList.casualAcquaintancesList.size()){
										if(i==0){
											System.out.println("Contact List of Casual Acquaintances :");
										}
										System.out.println("	Name: "+contactList.casualAcquaintancesList.get(i).casualAcquaintanceName);
										System.out.println("		Mobile Number: "+contactList.casualAcquaintancesList.get(i).casualAcquaintanceMobileNumber);
										System.out.println("		E-mail Address: "+contactList.casualAcquaintancesList.get(i).casualAcquaintanceEmail);
										System.out.println("		Location and Time of Acquaintance: "+contactList.casualAcquaintancesList.get(i).casualAcquaintanceWhenAndWhere);
										System.out.println("		Circumstances of Acquaintance: "+contactList.casualAcquaintancesList.get(i).casualAcquaintanceCircumstances);
										System.out.println("		Specific Information: "+contactList.casualAcquaintancesList.get(i).casualAcquaintanceSpecificInformation);
										i++;
									}
									System.out.println("");
									break;
							default: System.out.println("Sorry. Invalid Choice.");
									 break;
									}
						break;
				case 5: System.out.println("Enter the Name of the Acquaintance whose Contacts you want to Search : ");
						String contactSearch = in.nextLine();
						boolean search = true;
						i=0;
						while(i<contactList.relativesList.size()){
							if(contactList.relativesList.get(i).relativeName.equals(contactSearch)){
								System.out.println("Contact Found!!");
								System.out.println("Name: "+contactList.relativesList.get(i).relativeName);
								System.out.println("Mobile Number: "+contactList.relativesList.get(i).relativeMobileNumber);
								System.out.println("E-mail Address: "+contactList.relativesList.get(i).relativeEmail);
								System.out.println("Date of Birth: "+contactList.relativesList.get(i).relativeBirthday);
								System.out.println("Day of Last Meeting: "+contactList.relativesList.get(i).relativeDateOfLastMeeting);
								search = false;
								break;
							}
							i++;
						}
						if(search==true){
							i=0;
							while(i<contactList.personalFriendsList.size()){
								if(contactList.personalFriendsList.get(i).personalFriendName.equals(contactSearch)){
									System.out.println("Contact Found!!");
									System.out.println("Name: "+contactList.personalFriendsList.get(i).personalFriendName);
									System.out.println("Mobile Number: "+contactList.personalFriendsList.get(i).personalFriendMobileNumber);
									System.out.println("E-mail Address: "+contactList.personalFriendsList.get(i).personalFriendEmail);
									System.out.println("Context of Acquaintance: "+contactList.personalFriendsList.get(i).personalFriendContextOfAcqaintance);
									System.out.println("Date of Acquaintance: "+contactList.personalFriendsList.get(i).personalFriendDateOfAcquaintance);
									System.out.println("Specific Events: "+contactList.personalFriendsList.get(i).personalFriendSpecificEvents);
									search = false;
									break;
								}
								i++;
							}
						}
						if(search==true){
							i=0;
							while(i<contactList.professionalFriendsList.size()){
								if(contactList.professionalFriendsList.get(i).professionalFriendName.equals(contactSearch)){
									System.out.println("Contact Found!!");
									System.out.println("Name: "+contactList.professionalFriendsList.get(i).professionalFriendName);
									System.out.println("Mobile Number: "+contactList.professionalFriendsList.get(i).professionalFriendMobileNumber);
									System.out.println("E-mail Address: "+contactList.professionalFriendsList.get(i).professionalFriendEmail);
									System.out.println("Specific Common Interest: "+contactList.professionalFriendsList.get(i).professionalFriendSpecificCommonInterest);
									search = false;
									break;
								}
								i++;
							}
						}
						if(search==true){
							i=0;
							while(i<contactList.casualAcquaintancesList.size()){
								if(contactList.casualAcquaintancesList.get(i).casualAcquaintanceName.equals(contactSearch)){
									System.out.println("Contact Found!!");
									System.out.println("Name: "+contactList.casualAcquaintancesList.get(i).casualAcquaintanceName);
									System.out.println("Mobile Number: "+contactList.casualAcquaintancesList.get(i).casualAcquaintanceMobileNumber);
									System.out.println("E-mail Address: "+contactList.casualAcquaintancesList.get(i).casualAcquaintanceEmail);
									System.out.println("Location and Time of Acquaintance: "+contactList.casualAcquaintancesList.get(i).casualAcquaintanceWhenAndWhere);
									System.out.println("Circumstances of Acquaintance: "+contactList.casualAcquaintancesList.get(i).casualAcquaintanceCircumstances);
									System.out.println("Specific Information: "+contactList.casualAcquaintancesList.get(i).casualAcquaintanceSpecificInformation);
									search = false;
									break;
								}
								i++;
							}
						}
						if(search==true){
							System.out.println("Sorry. Contacts of "+contactSearch+" not found");
						}
						break;
				case 6: choose = false;
						in.close();
						try
					      {
					         FileOutputStream fileOut = new FileOutputStream("contactlist");
					         ObjectOutputStream out = new ObjectOutputStream(fileOut);
					         out.writeObject(contactList);
					         out.flush();
					         out.close();
					         fileOut.close();
					         System.out.println("\nAll Changes have been Saved Succcessfully!!");
					         System.out.println("Thank You");
					      }catch(IOException exe)
					      {
					          exe.printStackTrace();
					      }
						break;
				default: System.out.println("Sorry. Invalid Choice. Try Again.");
						 break;
			}
		}
	}
}

class Relatives implements java.io.Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2651142845183662233L;
	String relativeName;
	String relativeMobileNumber;
	String relativeEmail;
	String relativeBirthday;
	String relativeDateOfLastMeeting;
	transient private Scanner input;
	public void relativeCreator(){
		System.out.println("You are ready to add another Relative to your Contact List");
		input = new Scanner(System.in);
		System.out.print("Enter the name of your Relative : ");
		this.relativeName = input.nextLine();
		System.out.print("Enter the Mobile Number of "+this.relativeName+" : ");
		this.relativeMobileNumber = input.nextLine();
		System.out.print("Enter the E-mail Address of "+this.relativeName+" : ");
		this.relativeEmail = input.nextLine();
		System.out.print("Enter the Date of Birth of "+this.relativeName+" : ");
		this.relativeBirthday = input.nextLine();
		System.out.print("Enter the Date of your last meeting with "+this.relativeName+" : ");
		this.relativeDateOfLastMeeting = input.nextLine();
	}
}

class PersonalFriends implements java.io.Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -5573598057107864118L;
	String personalFriendName;
	String personalFriendMobileNumber;
	String personalFriendEmail;
	String personalFriendContextOfAcqaintance;
	String personalFriendSpecificEvents;
	String personalFriendDateOfAcquaintance;
	transient private Scanner input;
	public void personalCreator(){
		System.out.println("You are ready to add another Personal Friend to your Contact List");
		input = new Scanner(System.in);
		System.out.print("Enter the name of your Personal Friend : ");
		this.personalFriendName = input.nextLine();
		System.out.print("Enter the Mobile Number of "+this.personalFriendName+" : ");
		this.personalFriendMobileNumber = input.nextLine();
		System.out.print("Enter the E-mail Address of "+this.personalFriendName+" : ");
		this.personalFriendEmail = input.nextLine();
		boolean accept = true;
		while(accept){
			System.out.print("Enter the Context of Aquaintance with "+this.personalFriendName+"(100 chars max) : ");
			this.personalFriendContextOfAcqaintance = input.nextLine();
			if(this.personalFriendContextOfAcqaintance.length()<=100){
				accept = false;
			}
			else{
				System.out.println("Sorry. Input too Long. Please enter again.");
			}
		}
		System.out.print("Enter the Date of your acquaintance with "+this.personalFriendName+" : ");
		this.personalFriendDateOfAcquaintance = input.nextLine();
		accept = true;
		while(accept){
			System.out.print("Enter the Specific events that need to be noted (100 chars max) : ");
			this.personalFriendSpecificEvents = input.nextLine();
			if(this.personalFriendSpecificEvents.length()<=100){
				accept = false;
			}
			else{
				System.out.println("Sorry. Input too Long. Please enter again.");
			}
		}
	}
}

class ProfessionalFriends implements java.io.Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -3753095340664972746L;
	String professionalFriendName;
	String professionalFriendMobileNumber;
	String professionalFriendEmail;
	String professionalFriendSpecificCommonInterest;
	transient private Scanner input;
	public void professionalCreator(){
		System.out.println("You are ready to add another Professional Friend to your Contact List");
		input = new Scanner(System.in);
		System.out.print("Enter the name of your Professional Friend : ");
		this.professionalFriendName = input.nextLine();
		System.out.print("Enter the Mobile Number of "+this.professionalFriendName+" : ");
		this.professionalFriendMobileNumber = input.nextLine();
		System.out.print("Enter the E-mail Address of "+this.professionalFriendName+" : ");
		this.professionalFriendEmail = input.nextLine();
		boolean accept = true;
		while(accept){
			System.out.print("Enter your Specific common Interests with "+this.professionalFriendName+"(100 chars max) : ");
			this.professionalFriendSpecificCommonInterest = input.nextLine();
			if(this.professionalFriendSpecificCommonInterest.length()<=100){
				accept = false;
			}
			else{
				System.out.println("Sorry. Input too Long. Please enter again.");
			}
		}
	}
	
}

class CasualAcquaintances implements java.io.Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1831821769918907167L;
	String casualAcquaintanceName;
	String casualAcquaintanceMobileNumber;
	String casualAcquaintanceEmail;
	String casualAcquaintanceWhenAndWhere;
	String casualAcquaintanceCircumstances;
	String casualAcquaintanceSpecificInformation;
	transient private Scanner input;
	public void casualCreator(){
		System.out.println("You are ready to add another Casual Acqaintance to your Contact List");
		input = new Scanner(System.in);
		System.out.print("Enter the name of your Casual Acqaintance : ");
		this.casualAcquaintanceName = input.nextLine();
		System.out.print("Enter the Mobile Number of "+this.casualAcquaintanceName+" : ");
		this.casualAcquaintanceMobileNumber = input.nextLine();
		System.out.print("Enter the E-mail Address of "+this.casualAcquaintanceName+" : ");
		this.casualAcquaintanceEmail = input.nextLine();
		boolean accept = true;
		while(accept){
			System.out.print("Enter when and where you got acquainted with "+this.casualAcquaintanceName+"(100 chars max) : ");
			this.casualAcquaintanceWhenAndWhere = input.nextLine();
			if(this.casualAcquaintanceWhenAndWhere.length()<=100){
				accept = false;
			}
			else{
				System.out.println("Sorry. Input too Long. Please enter again.");
			}
		}
		accept = true;
		while(accept){
			System.out.print("Enter the Circumstances under which you got acquainted with "+this.casualAcquaintanceName+"(100 chars max) : ");
			this.casualAcquaintanceCircumstances = input.nextLine();
			if(this.casualAcquaintanceCircumstances.length()<=100){
				accept = false;
			}
			else{
				System.out.println("Sorry. Input too Long. Please enter again.");
			}
		}
		accept = true;
		while(accept){
			System.out.print("Enter the any other Specific information that needs to be noted (100 chars max) : ");
			this.casualAcquaintanceSpecificInformation = input.nextLine();
			if(this.casualAcquaintanceSpecificInformation.length()<=100){
				accept = false;
			}
			else{
				System.out.println("Sorry. Input too Long. Please enter again.");
			}
		}
	}
}

class Acquaintances implements java.io.Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -8722861109099387513L;
	ArrayList<Relatives> relativesList = new ArrayList<Relatives>();
	ArrayList<PersonalFriends> personalFriendsList = new ArrayList<PersonalFriends>();
	ArrayList<ProfessionalFriends> professionalFriendsList = new ArrayList<ProfessionalFriends>();
	ArrayList<CasualAcquaintances> casualAcquaintancesList = new ArrayList<CasualAcquaintances>();
}




















