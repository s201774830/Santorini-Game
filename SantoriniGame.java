import java.util.Arrays;

public class SantoriniGame {

	private String[][] Board=new String[5][5];
	private Worker[] Worker = new Worker [4];{
	Worker[0]=new Worker("w11");
	Worker[1]=new Worker("w12");
	Worker[2]=new Worker("w21");
	Worker[3]=new Worker("w22");}

	public SantoriniGame() {
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				Board[i][j]="..";
			}
		}
		Worker[] W=new Worker[4];
		for(int i=0;i<Worker.length;i++) {
			W[i]=Worker[i];}
	}

	
		public void printrapped(String x,String p1,String p2) {
			int index=0,in=0;
			switch(x) {
			case "w11":index=0;in=1;break;
			case "w12":index=1;in=0;break;
			case "w21":index=2;in=3;break;
			case "w22":index=3;in=2;break;
			}
			if(isTrapped(getWorker(index).getName())&&isTrapped(getWorker(in).getName())&&(in==0||in==1))
			System.out.println(p1 + " has trapped");
			if(isTrapped(getWorker(index).getName())&&isTrapped(getWorker(in).getName())&&(in==2||in==3))
				System.out.println(p2 + " has trapped");
			
		}

	public boolean build(int positionX,int positionY,String a ) {
		int index=0;
		boolean x=false;
		switch(a) {
		case "w11":index=0;break;
		case "w12":index=1;break;
		case "w21":index=2;break;
		case "w22":index=3;break;
		}
		if(Board[positionX][positionY].equals("..")||Board[positionX][positionY].equals("B")||Board[positionX][positionY].equals("BB")) {
			if(positionX-Worker[index].getPositionX()==0 || positionX-Worker[index].getPositionX()==1||positionX-Worker[index].getPositionX()==-1
				||positionY-Worker[index].getPositionY()==0||positionY-Worker[index].getPositionY()==1||positionY-Worker[index].getPositionY()==-1) 
				//Board[positionX][positionY] = "B";
			return true;}

		else	if(Board[positionX][positionY].equals("BBB")) {
				if(positionX-Worker[index].getPositionX()==0 || positionX-Worker[index].getPositionX()==1||positionX-Worker[index].getPositionX()==-1
						||positionY-Worker[index].getPositionY()==0||positionY-Worker[index].getPositionY()==1||positionY-Worker[index].getPositionY()==-1) 
					//Board[positionX][positionY] = "D";
				return true;
			}
			else 
				return false;
	return false;	}
	
	public boolean isTrapped(String a) {
		int index=0,x=0;
		switch(a) {
		case "w11":index=0;break;
		case "w12":index=1;break;
		case "w21":index=2;break;
		case "w22":index=3;break;
		}
		boolean trap=true;
		if(Worker[index].getPositionX()!=0&&Worker[index].getPositionY()==0&&Worker[index].getPositionX()!=4)
		{for(int i=-1;i<2;i++){
			for(int j=0;j<2;j++){
				if(Board[Worker[index].getPositionX()+i][Worker[index].getPositionY()+j].equals("..")&&Board[Worker[index].getPositionX()+i][Worker[index].getPositionY()+j].equals("B"))
					return false;
			}
		}
		}
		else	if(Worker[index].getPositionX()!=0&&Worker[index].getPositionY()==4&&Worker[index].getPositionX()!=4)
		{for(int i=-1;i<2;i++){
			for(int j=-1;j<1;j++){
				if(Board[Worker[index].getPositionX()+i][Worker[index].getPositionY()+j].equals("..")&&Board[Worker[index].getPositionX()+i][Worker[index].getPositionY()+j].equals("B"))
					return false;
			}
		}}
		else if(Worker[index].getPositionY()!=0&&Worker[index].getPositionX()==0&&Worker[index].getPositionY()!=4)
		{for(int i=0;i<2;i++){
			for(int j=-1;j<2;j++){
				if(Board[Worker[index].getPositionX()+i][Worker[index].getPositionY()+j].equals("..")||Board[Worker[index].getPositionX()+i][Worker[index].getPositionY()+j].equals("B"))
					return false;
			}
		}}
		if(Worker[index].getPositionY()!=0&&Worker[index].getPositionX()==4&&Worker[index].getPositionY()!=4)
		{for(int i=-1;i<1;i++){
			for(int j=-1;j<2;j++){
				if(Board[Worker[index].getPositionX()+i][Worker[index].getPositionY()+j].equals("..")||Board[Worker[index].getPositionX()+i][Worker[index].getPositionY()+j].equals("B"))
					return false;
			}
		}}
		else if(Worker[index].getPositionY()==0&&Worker[index].getPositionX()==0) {
			for(int i=0;i<2;i++){
				for(int j=0;j<2;j++){
					if(Board[Worker[index].getPositionX()+i][Worker[index].getPositionY()+j].equals("..")||Board[Worker[index].getPositionX()+i][Worker[index].getPositionY()+j].equals("B"))
						return false;
				}
				}		}
		else if(Worker[index].getPositionY()==0&&Worker[index].getPositionX()==4) {
			for(int i=-1;i<1;i++){
				for(int j=0;j<2;j++){
					if(Board[Worker[index].getPositionX()+i][Worker[index].getPositionY()+j].equals("..")||Board[Worker[index].getPositionX()+i][Worker[index].getPositionY()+j].equals("B"))
						return false;
				}
				}		}
		else if(Worker[index].getPositionY()==4&&Worker[index].getPositionX()==0) {
			for(int i=0;i<2;i++){
				for(int j=-1;j<1;j++){
					if(Board[Worker[index].getPositionX()+i][Worker[index].getPositionY()+j].equals("..")||Board[Worker[index].getPositionX()+i][Worker[index].getPositionY()+j].equals("B"))
						return false;
				}
				}		}
		else if(Worker[index].getPositionY()==4&&Worker[index].getPositionX()==4) {
			for(int i=-1;i<1;i++){
				for(int j=-1;j<1;j++){
					if(Board[Worker[index].getPositionX()+i][Worker[index].getPositionY()+j].equals("..")||Board[Worker[index].getPositionX()+i][Worker[index].getPositionY()+j].equals("B"))
						return false;
				}
				}		}

		else if((Board[Worker[index].getPositionX()][Worker[index].getPositionY()].equals(Worker[index].getName())||
				Board[Worker[index].getPositionX()][Worker[index].getPositionY()].equals("B"+Worker[index].getName())||
				Board[Worker[index].getPositionX()][Worker[index].getPositionY()].equals("BBB"+Worker[index].getName())&&
				Board[Worker[index].getPositionX()][Worker[index].getPositionY()].equals("BB"+Worker[index].getName()))&&
				Worker[index].getPositionX()>=1&&Worker[index].getPositionX()<=3&&Worker[index].getPositionY()>=1&&Worker[index].getPositionY()<=3) {
			for(int i=-1;i<2;i++){
				for(int j=-1;j<2;j++){//return it
			
					if(Board[Worker[index].getPositionX()+i][Worker[index].getPositionY()+j].equals("..")||Board[Worker[index].getPositionX()+i][Worker[index].getPositionY()+j].equals("B"))
						return false;
				}
				}		}
		

		return true;}
	
	public String[][] getBoard() {
		return Board;
	}
	public Worker getWorker(int i) {
		return Worker[i];
	}
	
	public Worker[] getWorker() {
		return Worker;
	}
	
	public String toString() {
		String prin="";

		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				prin=prin+Board[i][j]+"\t";      
			}
			prin+="\n";}
		return prin ;}
		
		
		public boolean hasWon() {
			if(Board[Worker[0].getPositionX()][Worker[0].getPositionY()].equals("BBBw11") ||Board[Worker[1].getPositionX()][Worker[1].getPositionY()].equals("BBBw12") ){
				//System.out.println("Player1 has won");
				return true;
				}
			
			else if(Board[Worker[2].getPositionX()][Worker[2].getPositionY()].equals("BBBw21") ||Board[Worker[3].getPositionX()][Worker[3].getPositionY()].equals("BBBw22") ){
			//	System.out.println("Player2 has won");
				return true;}
			else if(isTrapped("w11")&&isTrapped("w12")) {
				//System.out.println("Player2 has won");
				return true;}
		else if(isTrapped("w21")&&isTrapped("w22")) {
			//System.out.println("Player1 has won");
			return true;}
else return false;

		}
		public void hasWon(String p1,String p2) {
			if(Board[Worker[0].getPositionX()][Worker[0].getPositionY()].equals("BBBw11") ||Board[Worker[1].getPositionY()][Worker[1].getPositionX()].equals("BBBw12") ){
				System.out.println(p1+" has won");
				
				}
			
			else if(Board[Worker[2].getPositionX()][Worker[2].getPositionY()].equals("BBBw21") ||Board[Worker[3].getPositionX()][Worker[3].getPositionY()].equals("BBBw22") ){
				System.out.println(p2+" has won");
				}
			else if(isTrapped("w11")&&isTrapped("w12")) {
				System.out.println(p2+" has won");
				}
		else if(isTrapped("w21")&&isTrapped("w22")) {
			System.out.println(p1+" has won");
			}


		}
			
		public void reset() {
			for(int i=0;i<5;i++) {
				for(int j=0;j<5;j++) {
					Board[i][j]="..";
				}
			}
			for(int i=5;i<5;i++) {
			Worker[i].setPositionX(0);	
			Worker[i].setPositionY(0);
				
			}
		}
		
}