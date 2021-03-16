import java.util.*;
import java.util.concurrent.TimeUnit;

public class Client 
{
	public static void main(String[] args) throws InterruptedException 
	{
		
		ArrayList<Book> book = new ArrayList<Book>();
		ArrayList<JournalPaper> journalpaper = new ArrayList<JournalPaper>();
		ArrayList<Video> video = new ArrayList<Video>();
		ArrayList<CD> cd = new ArrayList<CD>();
		
		book.add(new Book(123, "Book-123", 5, "Book 123 Author"));
		book.add(new Book(234, "Book-234", 4, "Book 234 Author"));
		book.add(new Book(345, "Book-345", 3, "Book 345 Author"));
		book.add(new Book(456, "Book-456", 2, "Book 456 Author"));
		book.add(new Book(567, "Book-567", 1, "Book 567 Author"));
		
		journalpaper.add(new JournalPaper(1234, "Journal Paper-1234", 3, "Journal Paper 1234 Author", 2012));
		journalpaper.add(new JournalPaper(2345, "Journal Paper-2345", 2, "Journal Paper 2345 Author", 2017));
		journalpaper.add(new JournalPaper(4567, "Journal Paper-4567", 1, "Journal Paper 4567 Author", 2020));
	
		video.add(new Video(11, "Video-11", 1, 111.11, "Video-11 director", "Video-11 genre", 1999));
		video.add(new Video(22, "Video-22", 2, 222.22, "Video-22 director", "Video-22 genre", 2020));
		
		cd.add(new CD(1, "CD-1", 4, 11.11, "CD-1 artist", "CD-1 genre"));
		cd.add(new CD(2, "CD-2", 3, 22.22, "CD-2 artist", "CD-2 genre"));
			
		// System.out.println("User Menu:");
		while(true)
		{
			@SuppressWarnings("resource")
			Scanner myObj = new Scanner(System.in);
			System.out.println("User Menu:\n" 
						+ "Option 1:(AddNewItem),\r\n"
						+ "Option 2: (BorrowItem),\r\n"
						+ "Option 3: (ReturnItem),\r\n"
						+ "Option 4: (DisplayAllLibraryItems),\r\n"
						+ "Option 5: (exit).");
				
			int option = myObj.nextInt();
				
			switch(option)
			{
			case 1:
				System.out.println("Option 1: Book,\r\n"
							+ "Option 2: Journal Paper,\r\n"
							+ "Option 3: Video,\r\n"
							+ "Option 4: CD.\n");
					
				int AddOption = myObj.nextInt();
					
				switch(AddOption)
				{		
				case 1:
					System.out.println("Input ID, Titles, Author");
					int Id = myObj.nextInt();
					String Titles = myObj.nextLine();
					// int Copy = myObj.nextInt();
					String Author = myObj.nextLine();
						
					Book addbook = new Book(Id, Titles, 1, Author);
					book.add(addbook);
					break;
					
				case 2:
					System.out.println("Input ID, Titles, Author, Publish Year");
					int JPid = myObj.nextInt();
					String JPtitle = myObj.nextLine();
					// int JPcopy = myObj.nextInt();
					String JPauthor = myObj.nextLine();
					int PublishYear = myObj.nextInt();
						
					JournalPaper addjournalpaper = new JournalPaper(JPid, JPtitle, 1, JPauthor, PublishYear);
					journalpaper.add(addjournalpaper);
					break;
					
				case 3:
					System.out.println("Input ID, Titles, Director, Genre, Runtime, Year Released");
					int Vid = myObj.nextInt();
					String Vtitle = myObj.nextLine();
					// int Vcopy = myObj.nextInt();
					String Vdirector = myObj.nextLine();
					String Vgenre = myObj.nextLine();
					double Vruntime = myObj.nextDouble();
					int YearReleased = myObj.nextInt();
						
					Video addvideo = new Video(Vid, Vtitle, 1, Vruntime, Vdirector, Vgenre, YearReleased);
					video.add(addvideo);
					break;
					
				case 4:
					System.out.println("Input ID, Titles, Artist, Genre, Runtime");
					int Cid = myObj.nextInt();
					String Ctitle = myObj.nextLine();
					// int Ccopy = myObj.nextInt();
					String Cartist = myObj.nextLine();
					String Cgenre = myObj.nextLine();
					double Cruntime = myObj.nextDouble();
						
					CD addcd = new CD(Cid, Ctitle, 1, Cruntime, Cartist, Cgenre);
					cd.add(addcd);
					break;
				}
				break;
					
			case 2:
				System.out.println("Input id of the item you want to borrow:");
				int BorrowID = myObj.nextInt();
						
				for (Book b : book)
				{
					if (b.getID() == BorrowID)
					{
						b.Borrow();
					}
				}
				for (JournalPaper b : journalpaper)
				{
					if (b.getID() == BorrowID)
					{
						b.Borrow();
						}
				}
				for (Video b : video)
				{
					if (b.getID() == BorrowID)
					{
						b.Borrow();
					}
				}
				for (CD b : cd)
				{
					if (b.getID() == BorrowID && b.getAvailability() == true)
					{
						b.Borrow();
					}
				}
				break;
					
			case 3:
				System.out.println("Input type of item you want to return:");
				String ReturnType = myObj.nextLine();
					
				if (ReturnType.equals("Book"))
				{
					System.out.println("Input ID, Titles, Author");			
					int Id = myObj.nextInt();
					String Titles = myObj.nextLine();
					String Author = myObj.nextLine();
						
					Book addbook = new Book(Id, Titles, 1, Author);
					book.add(addbook);
					}
				else if (ReturnType.equals("Journal Paper"))
				{
					System.out.println("Input ID, Titles, Author, Publish Year");
					int JPid = myObj.nextInt();
					String JPtitle = myObj.nextLine();
					String JPauthor = myObj.nextLine();
					int PublishYear = myObj.nextInt();
					
					JournalPaper addjournalpaper = new JournalPaper(JPid, JPtitle, 1, JPauthor, PublishYear);
					journalpaper.add(addjournalpaper);
				}
				else if (ReturnType.equals("Video"))
				{
					System.out.println("Input ID, Titles, Director, Genre, Runtime, Year Released");
					int Vid = myObj.nextInt();
					String Vtitle = myObj.nextLine();
					String Vdirector = myObj.nextLine();
					String Vgenre = myObj.nextLine();
					double Vruntime = myObj.nextDouble();
					int YearReleased = myObj.nextInt();
					
					Video addvideo = new Video(Vid, Vtitle, 1, Vruntime, Vdirector, Vgenre, YearReleased);
					video.add(addvideo);
				}
				else if (ReturnType.equals("CD"))
				{
					System.out.println("Input ID, Titles, Artist, Genre, Runtime");
					int Cid = myObj.nextInt();
					String Ctitle = myObj.nextLine();
					String Cartist = myObj.nextLine();
					String Cgenre = myObj.nextLine();
					double Cruntime = myObj.nextDouble();
						
					CD addcd = new CD(Cid, Ctitle, 1, Cruntime, Cartist, Cgenre);
					cd.add(addcd);
				}
				break;
				
			case 4:
				System.out.println("Books:");
				for (Book b : book)
				{
					b.display();
				}
				
				System.out.println("Journal Paper:");
				for (JournalPaper b : journalpaper)
				{
					b.display();
				}
					
				System.out.println("Video:");
				for (Video b : video)
				{
					b.display();
				}
					
				System.out.println("CD:");
				for (CD b : cd)
				{
					b.display();
				}
					
				break;
					
			case 5:
				System.out.println("Exiting Program in 3 seconds...");
				TimeUnit.SECONDS.sleep(3);
				System.out.println("Exit Program!");
				System.exit(0);
			}
		}
	}
}
