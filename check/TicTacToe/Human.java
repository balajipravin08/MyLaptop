public class Human{
   	private String name;
   	private char mark;  
   	private int row,col;
   	
   	private static final Scanner ob=new Scanner(System.in);
   
   		public Human(String name,char mark){
      			this.name=name;
      			this.mark=mark;
      		}
   
   		public void makemove(){
    			do{
      				System.out.println("ENter the row and column:");
     				row=ob.nextInt();
      				col=ob.nextInt();
   			}while(!isvalidmove(row,col));
   				tictactoe.placemark(row,col,mark);
   		}
   
   		public boolean isvalidmove(int row,int col){
    			if(row>=0 && row<=2 &&col>=0 && col<=2){
       				if(tictactoe.board[row][col]==' '){
          				tictactoe.count++;
          				return true;
 				}
      			}
       			return false;
    		}
    
  		public static void main(String[] args){
     			Board t=new Board();
     			System.out.println("ENter the first player name:");
     			String name1=ob.next();
     			System.out.println("Enter the sign for first person:");
     			char c1=ob.next().charAt(0);
     			System.out.println("ENter the second player name:");
     			String name2=ob.next();
     			System.out.println("Enter the sign for second person:");
     			char c2=ob.next().charAt(0);
     			Human p1=new Human(name1,c1);
     			Human p2=new Human(name2,c2);
     			Human cp;
     			cp=p1;
     			while(true){
     				System.out.println(cp.name+"  turn");
     				cp.makemove();
     				tictactoe.display();
     					if(tictactoe.checkcolwin()||tictactoe.checkrowwin()||tictactoe.checkdiawin()){
     						System.out.println(cp.name+"Has Won");
     						break;
     					}else if(tictactoe.count==9){
     						System.out.println("Match draw ");
     						break;
     					}else{	
       						if(cp==p1){cp=p2;}
       						else{cp=p1;}
     					}
   			}
  		}
}
