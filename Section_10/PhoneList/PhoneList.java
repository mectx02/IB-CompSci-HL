package HL_1.Section_10.PhoneList;

import java.util.*;
import static java.lang.System.*;

/**
 *
 * @author 660741
 */
public class PhoneList
{
   private ArrayList<Contact> phoneList = new ArrayList<Contact>();
   Scanner keyboard = new Scanner(in);
   
   public void getContactInfo()
   {
       String answer = "";
       String name;
       String phone;
       Contact contact;
       
       while (!answer.equalsIgnoreCase("n")) {
           
           out.print("Enter a name: ");
           name = keyboard.nextLine();
           
           out.print("Enter a phone number: ");
           phone = keyboard.nextLine();
           
           contact = new Contact(name, phone);
           phoneList.add(contact);
           
           out.print("Continue? [y/n]: ");
           answer = keyboard.next();
           keyboard.nextLine();
           out.println();
           
       }
       
       keyboard.close();
       
   }
   
   public void printContactInfo()
   {
       for (Contact c : phoneList) {
           out.printf("%-16s%s%n",c.getName(), c.getPhone());
       }
   }
   
   public static void main(String[] args)
   {
      PhoneList app = new PhoneList();
      app.getContactInfo();
      app.printContactInfo();
   }
}