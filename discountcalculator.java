// // A shopping mall offers a discount on purchased products.

// Write a Java program to accept:
// - Product price (double)
// - Discount percentage (double)
// Calculate and display the discount amount and final price.

class main{
    public static void main (String[]args){
        Scanner sc=new Scanner (System.in);
        double price= sc.nextDouble();
        double percentage =sc.nextDouble();
        
        double discount= (price * percentage)/100;
        System.out.println("final price after discount"+(price-discount));
    }
}
