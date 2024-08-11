package Assignment;

import java.util.Scanner;

public class Question1 {
	public static void main(String[] args) {
		
		String title;
        String author;
        String  price;
        String publisher;
        String isbn;
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Write the number of books you want to add:  ");
        int size=sc.nextInt();
        String[] books=new String[size];
        
        for(int i=0;i<books.length;i++) {
        	System.out.println("Enter the title of the book :");
        	String Booktitle=sc.next();
        	
        	System.out.println("Enter the name of author: ");
        	String Authorname=sc.next();
        	
        	System.out.println("Enter the price of the book :");
        	String Bookname=sc.next();
        	
        	System.out.println("Enter the name of the publisher: ");
        	String publishername=sc.next();
        	
        	System.out.println("Enter the isbn");
        	String Bookisbn=sc.next();
        	
        	
        	String bookdetails=Booktitle+","+Authorname+","+Bookname+","+publishername+","+Bookisbn;
        	books[i]=bookdetails;
        	
        }
        	
        	
        	 System.out.print("    "+"Title"+"      ");
             System.out.print("    "+"Author"+"    ");
             System.out.print("    "+"Price"+"    ");
             System.out.print("    "+"Publisher"+"    ");
             System.out.print("    "+"ISBN"+"    \n");
             System.out.print("   "+"========"+"  ");
             System.out.print("   "+"========"+"  ");
             System.out.print("   "+"========"+"  ");
             System.out.print("   "+"========"+"  ");
             System.out.print("   "+"========"+"    \n");
             
             
             for(String book:books){
                 String[] singleBook=book.split(",");
                 System.out.print("    "+singleBook[0]+"    ");
                 System.out.print("    "+singleBook[1]+"    ");
                 System.out.print("    "+"£"+singleBook[2]+"    ");
                 System.out.print("    "+singleBook[3]+"    ");
                 System.out.print("    "+singleBook[4]+"    \n");
             }

             
             double totalCost=0;
             double maximum=0;
             double minimum=0;

             for(String book:books){
                 String[] singleBook=book.split(",");
                 double bookPrice=Double.parseDouble(singleBook[2]);

                 totalCost+=bookPrice;

                 if(bookPrice>maximum){
                     maximum=bookPrice;
                 }

                 minimum=bookPrice;
                 if(bookPrice<minimum){
                     minimum=bookPrice;
                 }

             }
             
             
             
        	
        

        System.out.println("========Totals Stocks===========");

        System.out.println("Total number of books: "+books.length);
        System.out.println("Total cost of books: "+"£"+totalCost);
        System.out.println("Maximum cost of a book: "+"£"+maximum);
        System.out.println("Minimum cost of book: "+"£"+minimum);
        System.out.println("Average cost of book: "+"£"+totalCost/books.length);	
	}
	}


