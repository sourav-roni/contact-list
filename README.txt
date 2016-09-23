The project ContactList contains the various files requuired for
creating the Project. The java file is named ContactList.java. 
The various classes created are that of relatives, personalfreinds,
professionalFriends, casualAcquaintances, Acquaintances apart 
from the main class named ContactList. The relatives class has fields
such as relativeName, relativeMobileNumber, relativeEmail,
relativeBirthday, relativeDateOfLastMeeting all of which are strings.
The personalfriends class has fields of personalFriendName,
personalFriendMobileNumber, personalFriendEmail, 
personalFriendContextOfAcqaintance, personalFriendSpecificEvent, 
personalFriendDateOfAcquaintance all of which are strings. The professional
Friends class has fields of professionalFriendName, professional
FriendMobileNumber, professionalFriendEmail, professionalFriend
SpecificCommonInterest all of which are stored as strings. The class of 
casualAcquaintances has fields of the type string namely casual
AcquaintanceName, casualAcquaintanceMobileNumber, casualAcquaintanceEmail, 
casualAcquaintanceWhenAndWhere, casualAcquaintanceCircumstances, 
casualAcquaintanceSpecificInformation. The Acquaintance class has 
arraylists for storing the various types of acquaintances. In the main 
class we have an instance of the Acquaintane class. While taking input from 
the user for various dates checks are made whether it can be parsed
or not.For every class where there is need to enter mobile number it is checked using
Regular Expressions.

Each class has certain methods which are implemented, all of them
have a classnameCreator method used to  initialize with user inputs.
the Acquaintance class has no such method. The main class has the main 
method it also creates an instance of the class Acquaintances. Apart 
the acquaintances class all classes have a transient scanner for taking 
user input.

At the beginnning the data is read from the stored file named contactlist
and finally it is written back to it. Even after every insertion or
modification the data is written back to the file. The above mentioned
file is named "contactlist".
 
