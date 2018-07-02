package pl.coderslab.exercise5;
  

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Downloader.savePopularWordsForWebsiteToFile("http://www.onet.pl/","/home/grzegorzjarocki/IdeaProjects/Warsztaty1/src/pl/coderslab/exercise5/popular_words.txt");
		Downloader.savePopularWordsForWebsiteToFile("http://www.wp.pl/","/home/grzegorzjarocki/IdeaProjects/Warsztaty1/src/pl/coderslab/exercise5/popular_words.txt");
		Downloader.savePopularWordsForWebsiteToFile("http://www.interia.pl/","/home/grzegorzjarocki/IdeaProjects/Warsztaty1/src/pl/coderslab/exercise5/popular_words.txt");
		Downloader.getMostPopularWordsAndSave("/home/grzegorzjarocki/IdeaProjects/Warsztaty1/src/pl/coderslab/exercise5/popular_words.txt", "/home/grzegorzjarocki/IdeaProjects/Warsztaty1/src/pl/coderslab/exercise5/most_popular_words.txt");
	}
	
}
