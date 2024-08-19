import java.time.LocalTime;
import java.util.Scanner;

public class accountLogin {
    static int money = 1000000 ;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;
        Account defaultAccount = new Account("techmaster","hoclacoviec",1000000) ;
        Account yourAccount = new Account() ;
        System.out.println("Enter username: ");
        String userUsername = scanner.nextLine() ;
        System.out.println("Enter password: ");
        String userPassword = scanner.nextLine() ;
        if(userUsername.equals(defaultAccount.getUsername()) && userPassword.equals(defaultAccount.getPassword())){
//            int money = 1000000 ;
            yourAccount.setPassword(userPassword);
            yourAccount.setUsername(userUsername);
            yourAccount.setBalance(money);
            String confirm = "Y" ;
            while(confirm.equals("Y")){
                enterAccount();
                confirm = scanner.nextLine() ;
            }
            System.out.println("Thank you for using our service, we're looking forward to working with you in the future");
        }
        else{
            System.out.println("Error! Username or password is wrong");
            System.out.println("Do you want to try again?");
        }
    }
    public static void enterAccount(){
        Scanner scanner = new Scanner(System.in) ;
        System.out.println();
        System.out.println("Your username: techmaster");
        System.out.println("Your password: hoclacoviec");
        System.out.println("Your balance: " + money);
        System.out.println();
        System.out.println("Enter the amount you want to withdraw: ");
        int withdrawal = scanner.nextInt();
        LocalTime currentTime = LocalTime.now();
        System.out.println("You have withdrawed " + withdrawal + " VND at " + currentTime);
        money -= withdrawal;
        System.out.println("Do you want to continue?");
    }
}
