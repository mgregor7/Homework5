
public class BibleBook
{
	private String name;
	private int chapters;
	private String sum;
	
	public BibleBook(String bookName, int numberOfChapters, String summary)
	{
		name = bookName;
		chapters = numberOfChapters;
		sum = summary;
	}
	
	public void display()
		{
		System.out.println("Book Name: " + this.name);
		System.out.println("Chapters: "+ this.chapters);
		System.out.println("Summary: " + this.sum);
		System.out.println("");
		
		}
	
}
