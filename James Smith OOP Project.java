import java.util.Scanner;
import java.util.Random;
import java.math.*;
//James Anthony Smith


class Main {//




	
	public static class libraryBook extends book{

		String callNum = makeCallNum();



		private static int random(){
			Random r =  new Random();
			int result = r.nextInt(100-1)+1;
			return result;
		}


		private String makeCallNum(){
			 String s1;
			 if(random() >= 10){
			 	s1 = ""+random();
			 }
			 else{
				 s1 = "0"+random();
			 }
				 if(author.length()<3){
			 	String call = s1+"."+author.substring(0,author.length())+"."+ISBN.substring(ISBN.length()-1);
				 return call;
			 }
			 else{
				 String call2 = s1+"."+author.substring(0,3)+"."+ISBN.substring(ISBN.length()-1);
				 return call2;
			 } 	
			 
		 }





		public void setTitle(String input){
			this.title = input;
		}
		public String getTitle(){
			return title;
		}
		public void setISBN (String input){
			this.ISBN = input;
		}
		public String getISBN(){
			return ISBN;
		}
		public void setAuthor (String input){
			this.author = input;
		}
		public String getAuthor(){
			return author;
		}




		
		
		public libraryBook(String title, String author, String ISBN){
			super(title, author, ISBN);
		}



		
		public void setCallNum (String input){
			this.callNum = input;
		}
		public String getCallNum(){
			return callNum;
		}

		
		public void toString(){
			String s8 = "["+ISBN+"-"+title+" by "+ author + "-" + makeCallNum()+"]";
			System.out.println(s8);
			 
		 }
	}




	
	public static abstract class book{

		String title;
		String author;
		String ISBN;

		
		
		
		public book(String title, String author, String ISBN) {
      this.title = title;
      this.author = author;
			this.ISBN = ISBN;
    }



		//constructors
		public book() {
      this.title = "";
      this.author = "";
			this.ISBN = "";
    }
		public libraryBook(String author, String ISBN){
			this.author = author;
			this.title = "NULL";
			this.ISBN = ISBN;
		}

		


		//setters and getters
		public void setTitle(String input){
			this.title = input;
		}
		public String getTitle(){
			return title;
		}
		public void setISBN (String input){
			this.ISBN = input;
		}
		public String getISBN(){
			return ISBN;
		}
		public void setAuthor (String input){
			this.author = input;
		}
		public String getAuthor(){
			return author;
		}



		public abstract void print();
		
	}




	
	 static class libraryBook{

		private String author;
		private String title;
		private String ISBN;
		private String callNum;
		private static int bookCount;
	
		private static int random(){
			Random r =  new Random();
			int result = r.nextInt(100-1)+1;
			return result;
		}

		 private String makeCallNum(){
			 String s1;
			 if(random() >= 10){
			 	s1 = ""+random();
			 }
			 else{
				 s1 = "0"+random();
			 }
				 if(author.length()<3){
			 	String call = s1+"."+author.substring(0,author.length())+"."+ISBN.substring(ISBN.length()-1);
				 return call;
			 }
			 else{
				 String call2 = s1+"."+author.substring(0,3)+"."+ISBN.substring(ISBN.length()-1);
				 return call2;
			 }
			 
		 }
		 
		 public String toString(){
			String s8 = "["+ISBN+"-"+title+" by "+ author + "-" + makeCallNum()+"]";
			return s8;
			 
		 }
		 public void setCallNum (String input){
			this.callNum = input;
		}
		public String getCallNum(){
			return callNum;
		}

		public void setTitle(String input){
			this.title = input;
		}
		public String getTitle(){
			return title;
		}

		public void setISBN (String input){
			this.ISBN = input;
		}
		public String getISBN(){
			return ISBN;
		}

		public void setAuthor (String input){
			this.author = input;
		}
		public String getAuthor(){
			return author;
		}

		public static void bookCount (int input){
			bookCount = input;
		}
		public int getbookCount(){
			return bookCount;
		}
		
		public libraryBook(){
			this.author = "NULL";
			this.title = "NULL";
			this.ISBN = "NULL";
		}
		
		public libraryBook(String author, String ISBN){
			this.author = author;
			this.title = "NULL";
			this.ISBN = ISBN;
		}

		 public libraryBook(String author,String title, String ISBN){
			this.author = author;
			this.title = title;
			this.ISBN = ISBN;
		}
		
		 
	}

	static class bookStoreBook{

		private String title;
		private String ISBN;
		private String author;
		private double discount;
		private double price;
		private boolean sale;
		private double newPrice;
		static private int bookCount;

	
		public void setTitle(String input){
			this.title = input;
		}
		public String getTitle(){
			return title;
		}

	
		public void setAuthor(String input){
			this.author = input;
		}
		public String getAuthor(){
			return author;
		}

		public void setISBN (String input){
			this.ISBN = input;
		}
		public String getISBN(){
			return ISBN;
		}

		public void setDiscount (double input){
			this.discount = input;
		}
		public double getDiscount(){
			return discount;
		}

		public void setPrice (double input){
			this.price = input;
		}
		public double getPrice(){
			return price;
		}

		public void setSale (boolean input){
			this.sale = input;
		}
		public boolean getSale(){
			return sale;
		}
  

		public static void bookCount (int input){
			bookCount = input;
		}
		public int getbookCount(){
			return bookCount;
		}


		public bookStoreBook(String author, String title, String ISBN){
			this.author = author;
			this.title = title;
			this.ISBN = ISBN;
			discount = 0;
			price = 0;
			
		}

		public bookStoreBook(String author, String title, String ISBN, double discount){
			this.author = author;
			this.title = title;
			this.ISBN = ISBN;
			sale = false;
			this.discount = discount;
			price = 0;
			
		}
		
		public bookStoreBook(String author, String title, String ISBN, double discount, double price, boolean sale){
			this.title = title;
			this.ISBN = ISBN;
			this.author = author;
			this.discount = discount;
			this.price = price;
			this.sale = sale;
			
		}



		public double discountedPrice(){
			newPrice = price * (1 - (discount/100));
			newPrice = Math.round(newPrice*100)/100.00d;
			return newPrice;
			
		}


		public String toString(){
			String s2 = "" +price;
			String s3 = "" +discountedPrice();
			String s4 = "["+ISBN+"-"+title+" by "+author+", $"+s2+" listed for $" + s3+"]";
			return s4;
		}

		
	}

  public static void main(String[] args) {
    System.out.println("Welcome to the book program!\n");
		
		libraryBook LBooks[] = new libraryBook[200];
		bookStoreBook BBooks[] = new bookStoreBook[100];

		Scanner StringInput = new Scanner(System.in);

		String Input;
		
		String Input2;
		
		String choice;

		int LBcount = 0;

		
		int BBcount = 0;

		boolean cont = true;
		
		while(cont == true){
			System.out.println("\nWould you like to create a new book object? (yes/no)");
			

			
			while(true){
				Input = StringInput.nextLine();
				if(Input.trim().equalsIgnoreCase("no")){cont = false; break;}
				if(Input.trim().equalsIgnoreCase("yes")){break;}
				if(Input.trim().equalsIgnoreCase("yeah")){System.out.println("I'm sorry but yeah isn't a valid answer. Please enter either yes or no: ");}
				else{System.out.println("Oops! That’s not a valid entry. Please try again: ");}
			}
			if(cont == false){break;}

			//System.out.println("");

			Scanner secondInput = new Scanner(System.in);
			String ATI[] = new String[3];

			System.out.println("\nPlease enter the author, title, and the isbn of the book separated by /: ");
			
			while(true){


				
				Input2 = secondInput.nextLine();
				Input2 = Input2.toUpperCase().trim();
				ATI = Input2.split("/");
				if(ATI.length != 3 || ATI[0].length() == 0|| ATI[1].length()==0 ||ATI[2].length() ==0){
					
						System.out.println("Oops! That’s not a valid entry. Please try again: ");
					
				}
					
				else{break;}
	
			}
			
			String author = ATI[0].trim();
			String title = ATI[1].trim();
			String ISBN = ATI[2].trim();
			//System.out.println("");

			
			System.out.println("Got it!\nNow, tell me if it is a bookstore book or a library book (enter BB for bookstore book or LB for library book): ");
			
			
			while(true){

				Input = StringInput.nextLine();
				if(Input.trim().equalsIgnoreCase("bb")){ 
					choice = Input;
					break;
				}
				else if(Input.trim().equalsIgnoreCase("lb")){
					choice = Input;
					break;
				}
				else{
					System.out.println("Oops! That’s not a valid entry. Please try again: ");
				}
			}
			
			//System.out.println("");


			Scanner priceScan = new Scanner(System.in);
			double price;
			boolean sale;
			double discount=0;
			String tempDiscount;

			
			if(choice.equalsIgnoreCase("bb")){
				
						System.out.println("Got it!\nPlease enter the list price of "+title+" by "+ author+ ": ");
						
							price = priceScan.nextDouble();
								
						System.out.println("Is it on sale? (y/n)");
							while(true){
								Input = StringInput.nextLine();
								if(Input.trim().equalsIgnoreCase("n")){
									sale = false;
									break;
								}
								if(Input.trim().equalsIgnoreCase("y")){
									sale = true;
									System.out.println("\nDeduction Percentage: ");
									  tempDiscount = StringInput.nextLine().replaceAll("[^0-9]", "");
									  discount = Double.parseDouble(tempDiscount);
										while(true){
											if(discount > 0){break;}
											else{System.out.println("Oops! That’s not a valid entry. Please try again: ");}
										}
									
									break;
								}
								else{System.out.println("Oops! That’s not a valid entry. Please try again: ");}
							}
						//System.out.println(discount);
						//(String author, String title, String ISBN, double discount, double price, boolean sale)
						BBooks[BBcount] = new bookStoreBook(author, title, ISBN, discount, price, sale);
						System.out.println("\nGot it!\n\nHere is your bookstore information\n\n");
		
							System.out.println(BBooks[BBcount].toString());
						BBcount++;
			}

			if(choice.equalsIgnoreCase("lb")){

				LBooks[LBcount] = new libraryBook(author, title, ISBN);
				System.out.println("Got it!\nHere is your library book information\n\n ");
				
				System.out.println(LBooks[LBcount].toString());
				LBcount++;

			}
		}	

		System.out.println("\n\n\nSure!\n\n\nHere are all of your books...\n\n");
				

		System.out.println("Library Books ("+LBcount+")\n");
		
				while(LBcount>0){
					System.out.println(LBooks[LBcount-1].toString());
					LBcount--;
				}

		System.out.println("\n----\n\nLibrary Books ("+BBcount+")\n");
		
				while(BBcount>0){
					System.out.println(BBooks[BBcount-1].toString());
					BBcount--;
				}
		
				System.out.println("\n----\n\n\nTake care now!\n");

  }

}



