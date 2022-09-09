// A program to display longest word//

package ThursdayLab;
import java.io.FileWriter;
import java.io.Writer;

public class TestLongestWord {
	// display "longest word"  in your text file
		public static void main(String[] args) {

			try
			{
				Writer w=new FileWriter("D:\\Anudip prgs\\Thursday Text.txt");
				String Content="Longest Word";
				w.write(Content);
				w.close();
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
			


		}

}
