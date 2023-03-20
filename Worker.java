public class Worker {
	private String name;
	private int positionX;
	private int positionY;
	public Worker(String name) {
		this.name = name;
	}
	public void placeWorker(int positionX,int positionY,SantoriniGame game) {

		this.positionX = positionX;

		this.positionY=positionY;

		game.getBoard()[positionX][positionY]=getName();

	}

	public boolean move(int newPositionX, int newPositionY, SantoriniGame game){



		if(game.getBoard()[positionX][positionY].equals(name)&&game.getBoard()[newPositionX][newPositionY].equals("..")){

			game.getBoard()[positionX][positionY]="..";

			game.getBoard()[newPositionX][newPositionY]=name;



			positionX=newPositionX;



			positionY=newPositionY;

			return true;}



		else if (game.getBoard()[positionX][positionY].equals(name)&&game.getBoard()[newPositionX][newPositionY].equals("B")) {

			game.getBoard()[positionX][positionY]="..";

			game.getBoard()[newPositionX][newPositionY]="B"+name;



			positionX=newPositionX;



			positionY=newPositionY;



			//game.getBoard()[positionY][positionX]+=getName();



			return true;}



		else if (game.getBoard()[positionX][positionY].equals("B"+name)&&game.getBoard()[newPositionX][newPositionY].equals("..")) {

			game.getBoard()[positionX][positionY]="B";

			game.getBoard()[newPositionX][newPositionY]=name;

			positionX=newPositionX;
			positionY=newPositionY;



			//game.getBoard()[positionY][positionX]+=getName();



			return true;}

		else if(game.getBoard()[positionX][positionY].equals("B"+name)&&game.getBoard()[newPositionX][newPositionY].equals("B")) {

			game.getBoard()[positionX][positionY]="B";

			game.getBoard()[newPositionX][newPositionY]="B"+name;

			positionX=newPositionX;



			positionY=newPositionY;

			return true;

		}



		else if(game.getBoard()[positionX][positionY].equals("B"+name)&&game.getBoard()[newPositionX][newPositionY].equals("BB")) {

			game.getBoard()[positionX][positionY]="B";

			game.getBoard()[newPositionX][newPositionY]="BB"+name;

			positionX=newPositionX;



			positionY=newPositionY;

			return true;

		}



		else if(game.getBoard()[positionX][positionY].equals("BB"+name)&&game.getBoard()[newPositionX][newPositionY].equals("..")) {

			game.getBoard()[positionX][positionY]="BB";

			game.getBoard()[newPositionX][newPositionY]=name;

			positionX=newPositionX;



			positionY=newPositionY;

			return true;

		}



		else if(game.getBoard()[positionX][positionY].equals("BB"+name)&&game.getBoard()[newPositionX][newPositionY].equals("B")) {

			game.getBoard()[positionX][positionY]="BB";

			game.getBoard()[newPositionX][newPositionY]="B"+name;

			positionX=newPositionX;



			positionY=newPositionY;

			return true;

		}



		else if(game.getBoard()[positionX][positionY].equals("BB"+name)&&game.getBoard()[newPositionX][newPositionY].equals("BB")) {

			game.getBoard()[positionX][positionY]="BB";

			game.getBoard()[newPositionX][newPositionY]="BB"+name;

			positionX=newPositionX;



			positionY=newPositionY;

			return true;

		}



		else if(game.getBoard()[positionX][positionY].equals("BB"+name)&&game.getBoard()[newPositionX][newPositionY].equals("BBB")) {

			game.getBoard()[positionX][positionY]="B";

			game.getBoard()[newPositionX][newPositionY]="BBB"+name;

			positionX=newPositionX;



			positionY=newPositionY;

			return true;

		}



		else

			return false;



	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPositionX() {
		return positionX;
	}
	public void setPositionX(int positionX) {
		this.positionX = positionX;
	}
	public int getPositionY() {
		return positionY;
	}
	public void setPositionY(int positionY) {
		this.positionY = positionY;
	}
	public String toString() {
		return "Worker [name=" + name + ", positionX=" + positionX + ", positionY=" + positionY + "]";
	}

}