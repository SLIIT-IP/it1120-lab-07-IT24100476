import java.util.Scanner;

public class IT24100476Lab7Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final double DISCOUNT_RATE = 0.05;
        
        // Loop for 5 customers
        for (int customer = 1; customer <= 5; customer++) {
            System.out.println("Customer " + customer);

            // Enter total bill amount
            System.out.print("Enter total bill amount: ");
            double totalBill = input.nextDouble();
            
            // Enter payment mode
            System.out.print("Enter mode of payment (C for cash, O for other): ");
            char paymentMode = input.next().charAt(0);
            
            // Check if the payment mode is valid
            if (paymentMode == 'C' || paymentMode == 'c') {
                

                // Apply 5% discount
                double discount = totalBill * DISCOUNT_RATE;
                
                double amountToPay = totalBill - discount;
                System.out.println("Discount is: " + discount);
                System.out.println("Amount to be paid: " + amountToPay);
           
              }
          
               else if (paymentMode == 'O' || paymentMode == 'o') {
                // No discount for non-cash payments
                System.out.println("No discount applicable");
                System.out.println("Amount to be paid: " + totalBill);
            } 
         
           else {

                System.out.println("Payment Mode is Not Valid");
            }
            
            System.out.println(); 
        }
        
    
    }
}
