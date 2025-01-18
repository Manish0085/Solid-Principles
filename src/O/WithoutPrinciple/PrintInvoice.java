package O.WithoutPrinciple;

import java.util.Scanner;

public class PrintInvoice {

    Invoice invoice;

    public PrintInvoice(){
        invoice = new Invoice();
    }

    public void printInvoice(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the format of invoice in which you want to print the invoice ");
        String format = sc.next();
        if(format.equalsIgnoreCase("PDF")){
            System.out.println("Print invoice in the PDF form ");
        }
        else if(format.equalsIgnoreCase("excel")){
            System.out.println("Print invoice in the excel form");
        }
        else {
            System.out.println("The formate you entered is not correct");
        }
    }



    /*
    Problem :
            suppose if you add the functionality to print the invoice in the form of
            word file also then you should not change the already working code
     */
}
