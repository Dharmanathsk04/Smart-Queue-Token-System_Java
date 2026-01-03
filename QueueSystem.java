import java.util.ArrayList;
import java.util.Scanner;

public class QueueSystem {

    
    static ArrayList<Integer> queue = new ArrayList<>();
    static int token = 1;


    static void addCustomer() {

        queue.add(token);
        System.out.println("Token"+token+"added to queue");
        token++;
    }


    static void serveCustomer() {

        if(queue.isEmpty()) {

            System.out.println("no customer in queue");
        }

        else {

            int served = queue.remove(0);
            System.out.println("serving token: "+served);
        }
    }

    static void showQueue() {

        if(queue.isEmpty()) {

            System.out.println("Queue is empty");
        }

        else {

            System.out.println("Current queue"+queue);
        }
    }

    public static void main(String[] args) {
        

        Scanner sc = new Scanner(System.in);

        while(true) {

            System.out.println("\n1.Add customer");
            System.out.println("2.serve customer");
            System.out.println("3.show Queue");
            System.out.println("4.Exit");
            System.out.print("Choose option:");

            int choice = sc.nextInt();

            switch(choice) {

                case 1:
                    addCustomer();
                    break;

                case 2:
                    serveCustomer();
                    break;
                    
                case 3:
                    showQueue();
                    break;
                    
                case 4:
                    System.out.println("system closed");
                    return;
                    
                default:
                    System.out.println("invalid choice");    
            }

            
        }

        
    }
}
