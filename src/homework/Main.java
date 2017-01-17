package homework;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        FileInputStream inFile = new FileInputStream("A:\\JavaProject\\JSON1\\src\\homework\\json.txt");
        byte[] str = new byte[inFile.available()];
        inFile.read(str);
        String result = new String(str);
        Gson gson = new GsonBuilder().create();
        Person person = gson.fromJson(result, Person.class);

        System.out.println("Name : " + person.getName());
        System.out.println("Surname : " + person.getSurname());

        String[] phones = person.getPhones();
        for(String phone : phones){
            System.out.println("Phone : " + phone);
        }

        String[] sites = person.getSites();
        for(String site : sites){
            System.out.println("Site : " + site);
        }

        System.out.println("Country : " + person.address.getCountry());
        System.out.println("City : " + person.address.getCity());
        System.out.println("Street : " + person.address.getStreet());
    }
}
