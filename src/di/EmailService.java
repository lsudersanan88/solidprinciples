package di;


import java.util.ArrayList;
import java.util.List;

public class EmailService {
  ContactListServiceImpl contactListServiceImpl;

   /* public EmailService() {
        this.contactListService = new ContactListService();
    }  */
    public EmailService(ContactListServiceImpl contactListServiceImpl) {
        this.contactListServiceImpl = contactListServiceImpl;
    }

     void  sendEmail()
    {
        contactListServiceImpl.getContacts().forEach(System.out::println);
    }

    public static void main(String[] args) {
        //sendEmail();
    }
}




interface  ContactListService{
    public  List<Contact> getContacts();
}

 class ContactListServiceImpl implements ContactListService {

     public  List<Contact> getContacts()
     {
         List list = new ArrayList();
         Contact contact1 = new Contact("kv1","kv1@gmail.com");
         Contact contact2 = new Contact("kv2","kv2@gmail.com");
         list.add(contact1);
         list.add(contact2);
         return list;
     }

     void sendEmail()
     {

     }
 }