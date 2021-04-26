import java.util.*;
public class CharReverse {
	static Scanner sc=new Scanner(System.in);
public static void main(String[] args) {
	System.out.println("Enter the sentence");
	String sentence=sc.nextLine();
	int wordCount=wordsInSentence(sentence);
	String words[]=new String[wordCount];
	words=arrayOfWords(sentence,wordCount);
	displaySentence(words);
}
private static void displaySentence(String[] words) {
	// TODO Auto-generated method stub
	System.out.println(words[words.length-1]);
	for(int i=0;i<words.length;i++)
	{
		
		int vowelCount=vowlesinWord(words[i]);
		
		if(vowelCount<=2)
		{
			System.out.print(swap(words[i])+" ");
		}
		else {
			System.out.print(words[i]+" ");
		}
	}
	
}
private static String swap(String string) {
	// TODO Auto-generated method stub
	String word="";
	word+=string.charAt(string.length()-1);
	for(int i=1;i<string.length()-1;i++)
	{
		
		
		
			word+=string.charAt(i);
		
	}
	word+=string.charAt(0);
		return word;
}
private static int vowlesinWord(String string) {
	// TODO Auto-generated method stub
	int count=0;
	
	 for (int i = 0; i < string.length(); i++)
       {
		 	char c=string.charAt(i);
		 	if(c=='a'|| c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
		 	{
		 		count++;
		 	}
       }
return count;
	
}
private static int wordsInSentence(String sentence) {
	// TODO Auto-generated method stub
	int count=0;
	for(int i=0;i<sentence.length();i++)
	{
		if((sentence.charAt(i)==' ') && (i>0))
		{
			count++;
		}
	}
	count++;
	return count;
}
public static String[] arrayOfWords(String sentence,int count) {
	String words[]=new String[count];
	int j=0;
	words[j]="";
    
        for (int i = 0; i < sentence.length(); i++)
        {
        	
            if (sentence.charAt(i) == ' ' && (i>0) )
            {
                j++;
                words[j]="";
            }
            else {
            	words[j]+=sentence.charAt(i);
            }
        }
    
    return words;// TODO Auto-generated method stub
}
}
