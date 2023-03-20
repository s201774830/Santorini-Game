import java.util.*;
import java.io.*;
public class mainProject {            
	public static void main(String[] args) {
		Scanner keys=new Scanner(System.in);
		Scanner kb=null;
		int num=0;int x=0,y=0;
		SantoriniGame game=new SantoriniGame();
		
		try {
			kb=new Scanner(new FileInputStream("P1.txt"));
		}
			catch(FileNotFoundException e) {
				System.out.println("not found");
			}
		String player1=kb.nextLine(),player2=kb.nextLine();
		while(num<4) {
			String temp=kb.next();x=kb.nextInt();y=kb.nextInt();
			game.getWorker(num).placeWorker(x,y, game);
			
			temp=kb.nextLine();
			num++;
		}
	
		System.out.println(game.toString());
		while(!game.hasWon()) {
			String c=kb.next();
			x=kb.nextInt();y=kb.nextInt();
			System.out.println("moving action "+c+"\t"+x+"\t"+y);
			switch(c) {
		case "w11":num=0;break;
		case "w12":num=1;break;
		case "w21":num=2;break;
		case "w22":num=3;break;			
		}
	//String mod=game.getBoard()[game.getWorker(num).getPositionX()][game.getWorker(num).getPositionY()],test="";
	boolean te=false;
			
			if(game.getWorker(num).move(x,y, game)==false) {
			do{
				if(game.getWorker(num).move(x,y, game)==false) {
					System.out.println("enter new x&y");
					x=keys.nextInt();y=keys.nextInt();	
				}
				if(game.getWorker(num).move(x,y, game)==false)
					te=false;
			}while(te==true);}
			
			else if(game.getWorker(num).move(x,y, game)==true) {
				game.getWorker(num).move(x,y,game);
			
				}
			
	
		kb.nextLine();
		System.out.println(game.toString());
		x=kb.nextInt();y=kb.nextInt();
		System.out.println("building"+"\t"+x+"\t"+y);
	
		if(game.build(x, y,c)==false) {
			do{
				if(game.build(x, y,c)==false) {
					System.out.println("enter new x&y");
					x=keys.nextInt();y=keys.nextInt();	
				}
				if(game.build(x, y,c)==false) {
					te=false;}
			}while(te==true);}
			
				
		else if(game.build(x, y,c)&&game.getBoard()[x][y].equals("BBB"))
				game.getBoard()[x][y]+="D";
			else if(game.build(x, y,c)&&game.getBoard()[x][y].equals(".."))
				game.getBoard()[x][y]="B";
			else if(game.build(x, y,c))
				game.getBoard()[x][y]+="B";
		
		
		if(kb.hasNextLine()) {
			kb.nextLine();	}
		game.isTrapped(c);
		System.out.println(game.toString());
		game.printrapped(c,player1,player2);
		game.hasWon(player1, player2);
		

		}
		
			System.out.println("wanna reset? enter 1 if yes or 0 for no");
			int ans=keys.nextInt();
			if(ans==0)
				System.exit(0);
			else if(ans==1) 
				game.reset();
			System.out.println("assume the game is restrated and playable"+"\n"+"sorry we did not write a code to replay"+"\n"+"it was a nice term and corse with both of you <3"+"\t"+"hope to see you in other courses with an easier project even though it was fun" );
			System.out.println("Sincerely,,    AbdullahHassanAbdulmohsen(AHA~) company Ltd");
			
			
		}
	
	
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	




