package exercise11;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Client {
    String name;
    String email;
    Date birthDate;

    public Client(String name, String email, Date birthDate) {
        this.name = name;
        this.email = email;
        this.birthDate = birthDate;
    }
    public String dateFormatted(){
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        return format.format(birthDate);
    }

    @Override
    public String toString(){
        return name + " (" + dateFormatted() + ")" + " - " + email;
    }
}
