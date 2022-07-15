package midbreak;

public class MainApplicaton {
    static java.util.Scanner sc = new java.util.Scanner(System.in);
    static MobilePhoneApplication app = new MobilePhoneApplication();
    static Users newUser;

    public static void main(String[] args) {
        app = new MobilePhoneApplication();

      mainMenu();
    }


    static public void mainMenu() {
        String prompt = """
                Welcome
                1 --> create an account
                2 --> login to the application
                3 --> print out information about your account
                4 --> log out   from the application
                """;

        System.out.println(prompt);

        boolean quit = false;
        int choice = 0;
        while (!quit) {
            System.out.println("Enter your choice");
            choice = sc.nextInt();
            sc.nextLine();


            switch (choice) {

                case 1:

                    System.out.println("Please enter your Name");
                    String name = sc.nextLine();

                    System.out.println("Please enter your email address");
                    String email = sc.nextLine();
                    System.out.println("Please set your password");
                    String password = sc.next();
                    newUser = new Users(name, email, password);
                    app.addUser(newUser);

                    break;
                case 2:
                    System.out.println("Please enter your email address");
                    email = sc.nextLine();
                    System.out.println("Please set your password");
                    password = sc.next();
                    if (newUser.login(email, password)) {
                        System.out.println("Login ing successful");
                        successfullogin();
                    }


                    break;


                case 5:
                    quit = true;
                    break;

            }
        }
    }
    private static void successfullogin() {
        String prompt = """
                Welcome
                0 --> Enter 0 for adding contact
                1 --> Enter 1 for removing every contact
                2 --> Enter 2 for searching contact
                3 --> Enter 3 for updating contact
                4 --> Enter 4 for viewing the contact list
                5 --> Enter 5 log out
                6 --> Enter 6 to see the instrusctions again
                """;
        System.out.println(prompt);
        int choice = 0;
        boolean quit = false;

        while (!quit) {
            System.out.println("PhoneBook menu Enter your choice");
            choice = sc.nextInt();
            sc.nextLine();


            switch (choice) {
                case 0:
                    System.out.println("Enter the number of Contacts");
                    int count = sc.nextInt();
                    for (int i = 0; i < count; i++) {
                        System.out.println("Enter number");
                        String phoneNumber = sc.nextLine();
                        System.out.println("Enter Name");
                        sc.nextLine();
                        String name = sc.nextLine();
                        Contact newcontact = Contact.createContact(phoneNumber, name);
                        newUser.addContact(newcontact);
                    }
                    break;

                case 1:
                    int size = newUser.getContacts().size();
                    System.out.println(size);
                    for (int i = size - 1; i >= 0; i--) {
                        newUser.removeContact(newUser.getContacts().get(i));
                    }
                    System.out.println(newUser.getContacts().isEmpty());
                    break;

                case 2:

                    for (int i = 0; i < newUser.getContacts().size(); i++) {
                        System.out.println(newUser.searchContact(newUser.getContacts().get(i)));
                    }
                    break;

                case 3:


                    System.out.println("Enter the Contact name you want to update");
                    String oldContactName = sc.nextLine();

                    for (int j = 0; j < newUser.getContacts().size(); j++) {
                        if (newUser.getContacts().get(j).getName().equals(oldContactName)) {
                            System.out.println("Enter the new Contact name");
                            String newName = sc.nextLine();
                            System.out.println("Enter the new Contact number");
                            String newNumber = sc.nextLine();
                            newUser.updateContact(newUser.getContacts().get(j), Contact.createContact(newNumber, newName));
                        } else {
                            System.out.println("You are looking for the wrong contact");
                        }

                    }


                    for (int i = 0; i < newUser.getContacts().size(); i++) {
                        System.out.println(newUser.getContacts().get(i).getName() + "," + newUser.getContacts().get(i).getNumber());
                    }
                    break;

                case 4:
                    if (newUser.getContacts().isEmpty()) {
                        System.out.println("Empty contact list");

                    } else {
                        System.out.println("Contact list");
                        for (int i = 0; i < newUser.getContacts().size(); i++) {
                            System.out.println("Name: " + newUser.getContacts().get(i).getName() + ",Phone Number: " + newUser.getContacts().get(i).getNumber());
                        }
                    }
                    break;

                case 6:
                  System.out.println(prompt);
                    break;
                case 5:
                    quit = true;
                    mainMenu();
                    break;


            }

        }
    }
}
































