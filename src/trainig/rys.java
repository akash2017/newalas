package trainig;

public class rys {
	
		 
	     public static void main(String[] args){
	 
	           String string = "A perfect square is a positive integer";
	 
	           String[] words = string.trim().replaceAll("\\s+", " ").split(" ");
	 
	              String shortest = words[0];
	 
	              String longest =  words[0];
	 
	              for(String word : words){
	 
	                if(word.length() < shortest.length()){
	 
	                      shortest = word;
	 
	                  }
	 
	                if(word.length() > longest.length()){
	 
	                      longest = word;
	 
	                  }
	 
	              }
	 
	              System.out.println("The Shortest Word = "+shortest);  
	 
	              System.out.println("The Longest Word = "+ longest);
	 
	      }
	 
	}
