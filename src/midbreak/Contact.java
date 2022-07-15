
package midbreak;


public class Contact {
    private String name;
    private String number;

    public Contact(String name, String number) {
        this.name = name;
        this.number = number;
    }
    public Contact() {

    }

    public String getName() {git
        return name;
    }

    public String getNumber() {
        return number;
    }

    public static Contact createContact(String number, String name){
        return new Contact(name, number);
    }



}