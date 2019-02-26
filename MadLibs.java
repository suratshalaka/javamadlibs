import java.util.Random;
import java.util.Scanner;

public class MadLibs {
	
	  Scanner scanner = new Scanner(System.in);
	  String story;
	  String name;
	  String sillyWord;
	  String adjective1;
	  String profession;
	  String techOf80s;
	  String product;
	  String reaction;
	  String relative;
	  String femaleName;
	  String number;
	  String pluralObjects;
	  String badWord;
	  String fictionCharacter;
	  String fromKitchen;
	  String randomNums; 
	  Random rand = new Random();
	  String celebrityName;
	  String verbEndingInIng1;
	  String adjective2;
	  String pluralTypeOfAnimal;
	  String verbEndingInIng2;
	  String songLyrics;
	  
	  
	  //Getters
	 
	  public String getStory() {
		  return story;
	  }
	  
	  public String getName() {
		  return name;
	  }
	  
	  public String getSillyWord() {
		  return sillyWord;
	 }
	
	  public String getAdjective1() {
		  return adjective1;
	  }
	   
	  public String getProfession() {
		  return profession;
	  }
	  
	  public String getTechOf80s() {
		  return techOf80s;
	  }	  
	  
	  public String getProduct() {
		  return product;
	  }
	  
	  public String getReaction() {
		  return reaction;
	  }
	  
	  public String getRelative() {
		  return relative;
	  }
	  
	  public String getFemaleName() {
			 return femaleName;
		  }
	  
	  public String getNumber() {
		  return number;
	  }
	  
	  public String getPluralObjects() {
		  return pluralObjects;
	  }
	  
	  public String getBadWord() {
		  return badWord;
	  }	
	  
	  public String getFictionCharacter() {
		  return fictionCharacter;
	  }
	  
	  public String getFromKitchen() {
		  return fromKitchen;
	  }
	  	  
	  public String getRandomNums() {
		  return randomNums;
	  }
     
	  public String getCelebrityName() {
		  return celebrityName;
	  }
	  
	  public String getVerbEndingInIng1() {
		  return verbEndingInIng1;
	  }
	  
	  public String getAdjective2() {
		  return adjective2;
	  }
	  
	  public String getPluralTypeOfAnimal() {
		  return pluralTypeOfAnimal;
	  }
	  
	  public String getVerbEndingInIng2() {
		  return verbEndingInIng2;
	  }
	  
	  public String getSongLyrics() {
		  return songLyrics; 
	  }
	  
	  //Setters
	  
	  public void setStory(String newStory) {
		  this.story = newStory;
	  }
	  
	  public void setName(String newName) {
		  this.name = newName;
	 }
	  
	  public void setSillyWord(String newSillyWord) {
		  this.sillyWord = newSillyWord;
	 }
	  
	  public void setAdjective1(String newAdj1) {
		  this.adjective1 = newAdj1;
	  }
	  
	  public void setProfession(String newProfession) {
		  this.profession = newProfession;
	  }
	  
	  public void setTechOf80s(String newTech) {
		  this.techOf80s = newTech;
	  }
	   
	  public void setProduct(String newProduct) {
		  this.product = newProduct;
	  }
	  
	  public void setReaction(String newReaction) {
		  this.reaction = newReaction;
	  }
	  
	  public void setRelative(String newRelative) {
			 this.relative = newRelative;
	  }
		
	  public void setFemaleName(String newFemaleName) {
		  this.femaleName = newFemaleName;
	  }
	  
	  public void setNumber(String newNumber) {
		  this.number = newNumber;
	  }
	  
	  public void setPluralObjects(String newObjects) {
		  this.pluralObjects = newObjects;
	  }
	  
	  public void setBadWord(String newBadWord) {
		  this.badWord = newBadWord;
	  }
	  
	  public void setFicationCharacter(String newCharacter) {
		  this.fictionCharacter = newCharacter;
	  }
	  
	  public void setFromKitchen(String newFromKitchen) {
		  this.fromKitchen = newFromKitchen;
	  }
	  	 	 	  	  
	  public void setRandomNums() {
		  int num = Math.abs(rand.nextInt()) % 100;
		  int index = 0;
		  int[] numberHolder = new int[3];
		  while (index < numberHolder.length){
		   numberHolder[index] = num + index;
		   index++;
		  }
		  randomNums = "not" +numberHolder[0]+", not"+numberHolder[1]+", but "+numberHolder[2];

		  
	  }
	  
	  public void setCelebrityName(String newName) {
		  this.celebrityName = newName;
	  }
	  
	  public void setVerbEndingInIng1(String newVerb1) {
		  this.verbEndingInIng1 = newVerb1;
	  }
	  
	  public void setAdjective2(String newAdj2) {
			 this.adjective2 = newAdj2;
		  }
	  
	  public void setPluralTypeOfAnimal(String newAnimal) {
		  this.pluralTypeOfAnimal = newAnimal;
	  }
	 
	  public void setVerbEndingInIng2(String newVerb2) {
		  this.verbEndingInIng2 = newVerb2;
	  }
	  	
	  public void setSongLyrics(String newSong) {
		 this.songLyrics = newSong;
	  }
	  
	  public void instructions() {
		  System.out.println("Welcome to MadLibs Game! Type in some words and lets have fun!"
		  		+ "Start by typing a name for a cute puppy.");
	  }
	  
	  
	  public void enterName() {
		  setName(scanner.nextLine());
	  }
	  
	  public void enterSillyWord() {
		  System.out.println("Give me a silly word.");
		  setSillyWord(scanner.nextLine());
	  }
	  
	  public void enterAdjective1() {
		  System.out.println("Give me an adjective!");
		  setAdjective1(scanner.nextLine());
	  }
	  
	  public void enterProfession() {
		  System.out.println("Tell a Plural type of Profession.");
		  setProfession(scanner.nextLine());
	  }
	  
	  public void enterTechOf80s() {
		  System.out.println("Tell a technolgy from 80's");
		  setTechOf80s(scanner.nextLine());
	  }
	  
	  public void enterProduct() {
		  System.out.println("A product you can buy online?");
		  setProduct(scanner.nextLine());
	  }
	  
	  public void enterReaction() {
		  System.out.println("What will be your reaction if you see a spider crawling up your leg?!");
		  setReaction(scanner.nextLine());
	  }
	  
	  public void enterRelative() {
		  System.out.println("A type of relative.");
		  setRelative(scanner.nextLine());
	  }
	  
	  public void enterFemaleName(){
		  System.out.println("A Femenine name.");
		  setFemaleName(scanner.nextLine());
	  }
	  
	  public void enterNumber() {
		  System.out.println("FAST! A random number");
		  setNumber(scanner.nextLine());
	  }
	  
	  public void enterPluralObjects() {
		  System.out.println("A Plural type of object");
		  setPluralObjects(scanner.nextLine());
	  }
	  
	  public void enterBadWord() {
		  System.out.println("A bad word that a kid would say?");
		  setBadWord(scanner.nextLine());
	  }
	  
	  public void enterFicationCharacter() {
		  System.out.println("A fiction character");
		   setFicationCharacter(scanner.nextLine());
	  }
	  
	  public void enterFromKitchen() {
		  System.out.println("Something that you find in a kitchen");
		  setFromKitchen(scanner.nextLine());
	  }
	   
	  public void enterCelebrityName() {
		  System.out.println("Name of celebrity.");
		  setCelebrityName(scanner.nextLine());
	  }
	  
	  public void enterVerbEndingInIng1() {
		  System.out.println("A verb ending in ing");
		  setVerbEndingInIng1(scanner.nextLine());
	  }
	  
	  public void enterAdjective2() {
		  System.out.println("Give me  another adjective");
		  setAdjective2(scanner.nextLine());
	  }
	  
	  public void enterPluralTypeOfAnimal() {
		  System.out.println("A Plural type of animal");
		  setPluralTypeOfAnimal(scanner.nextLine());
	  }
	  
	  public void enterVerbEndingInIng2() {
		  System.out.println("Another verb ending in ing");
		  setVerbEndingInIng2(scanner.nextLine());
	  }
	  
	  
	  public void enterSongLyrics() {
		  System.out.println("Give be some lyrics of a song.");
		  setSongLyrics(scanner.nextLine());
	  }
	  
	  
	  
	  public void putTogetherTheStory() {
		String story = " Plot:In a train.A sceret agent and his director having a conversation.  Director: Good evening!" +getName()+ " Agent: Special Director " +getSillyWord()+ " Its good to see you again. "
		 		+ " Director:I'm here with your next mission. A criminal organization of the world's most " +getAdjective1()+ " " +getProfession()+ " hacked into the goverment's " +getTechOf80s()+ " stealing their top secret report on " +getProduct()+ " . "
		 				+ " Agent: " +getReaction()+ " Director: I understand your reaction.The group also kidnaped your " +getRelative()+ "  "  +getFemaleName()+ " and is holding her for a ransom of " +getNumber()+ " " +getPluralObjects()+ " . "
		 						+ " Agent:Where the " +getBadWord()+ " are we gonna get " +getNumber()+ " " +getPluralObjects()+ " ? Director: I dont know! But we have to move fast. Agent: I have a plan. I'll meet up with the group disgusing myself as " +getFictionCharacter()+" . "
		 								+ " Director: So far, I'm on board. Agent: If they attack, I'll fight with a " +getFromKitchen()+ " . Director: This disk contains a sensitive information that might help. Agent: What's on the disk? " +getRandomNums()+ " photos of " +getCelebrityName()+ " " +getVerbEndingInIng1()+" ."
		 										+ " Agent: "+getReaction()+" . I have already contacted my team of highly " +getAdjective2()+ "  " +getPluralTypeOfAnimal()+ " to help. Director: You're the best agent we have. How do you prepare for such tense missions? "
		 												+ " Agent: By waking up every morning, going up on the roof and "+getVerbEndingInIng2()+" and by reapeating my own personal mantra "+getSongLyrics()+" .";
       setStory(story);
	  }
	  
	  public void play() {
		  enterName();
		  enterSillyWord();
		  enterAdjective1();
		  enterProfession();
		  enterTechOf80s(); 
		  enterProduct();
		  enterReaction(); 
	      enterRelative();
		  enterFemaleName();
		  enterNumber(); 
		  enterPluralObjects();
		  enterBadWord(); 
		  enterFicationCharacter(); 
		  enterFromKitchen(); 
		  setRandomNums();
		  enterCelebrityName(); 
		  enterVerbEndingInIng1();
		  enterAdjective2(); 
		  enterPluralTypeOfAnimal();
	      enterVerbEndingInIng2(); 
		  enterSongLyrics(); 	 
		  putTogetherTheStory();
		  System.out.println(getStory());
		  
	  }
	  

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        MadLibs game = new MadLibs();
         game.instructions();
         game.play();
	}

}
