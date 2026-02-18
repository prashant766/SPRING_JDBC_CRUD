import dao.PatientDao;
import model.Patient;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.util.Scanner;

import java.lang.reflect.Parameter;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

        PatientDao dao = context.getBean(PatientDao.class);

        System.out.println("1. Add Patient");
        System.out.println("2. Update Patient");
        System.out.println("3. Delete Patient");
        System.out.println("ENTER YOUR CHOICE: ");

        int choice = sc.nextInt();
        sc.nextLine();

        //insert
        switch (choice) {
            case 1:
                System.out.print("Enter ID: ");
                int id = sc.nextInt();
                sc.nextLine(); // consume newline

                System.out.print("Enter Name: ");
                String name = sc.nextLine();

                System.out.print("Enter Health: ");
                String health = sc.nextLine();

                System.out.print("Enter City: ");
                String city = sc.nextLine();

                Patient p = new Patient(id, name, health, city);
                dao.create(p);

                System.out.println("Patient added successfully");
                break;
            case 2:
                //update
                System.out.println("ENTER ID TO UPDATE");
                int u=sc.nextInt();
                sc.nextLine();

               System.out.println("ENTER NEW NAME");
               String n=sc.nextLine();

               System.out.println("ENTER UPDATED HEALTH");
               String h=sc.nextLine();

               System.out.println("ENTER NEW CITY");
               String c=sc.nextLine();

               Patient i=new Patient(u,n,h,c);
               dao.update(i);


                System.out.println("UPDATED SUCCESSFULLY");
                break;

            case 3:
                //delete
                System.out.println("ENTER ID TO DELETE");
                int d=sc.nextInt();
                sc.nextLine();

                dao.delete(d);
                System.out.println("DELETED");

                break;

        }
    }
}
