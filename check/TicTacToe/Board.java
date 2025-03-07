public class Board{
	 private static int count=0;
  	 private static char[][] board;
   		public Board(){
         			board=new char[3][3];
         			initboard();
   		}
   		private void initboard(){
       			for(int i=0;i<board.length;i++){
          			for(int j=0;j<board[i].length;j++){
             				board[i][j]=' ';
          			}
        			}
    		}
    		
    		public static void display(){
      			System.out.println("---------------");
      				for(int i=0;i<board.length;i++){
        					System.out.print("| ");
        					for(int j=0;j<board[i].length;j++){
           					System.out.print(board[i][j]+" |  ");
        					}System.out.println();
        			System.out.println("---------------");
    				}
   		}
   		
   		public static void placemark(int row,int column,char mark){
     			if(row>=0 && row<=2 && column>=0 && column<=2){board[row][column]=mark;}
     			else{System.out.println("Invalid input");}
   		}
   		
   		public static boolean checkcolwin(){ 
     			for(int j=0;j<=2;j++){
     				if(board[0][j]!=' ' && board[0][j]==board[1][j] &&board[1][j]==board[2][j]){return true;}

    			}
         			return false;
  		}
  		
   		public static boolean checkrowwin(){
     			for(int i=0;i<=2;i++){
        				if(board[i][0]!=' ' && board[i][0]==board[i][1] && board[i][1]==board[i][2]){return true;}
      			}
    			return false;
  		}
  		
  		public static boolean checkdiawin(){
     			if(board[0][0] !=' ' && board[0][0]==board[1][1] && board[1][1]==board[2][2] ||
     			board[0][2]!=' ' && board[0][2]==board[1][1] &&board[1][1]==board[2][0]){return true;}
   			return false;
  		}
}
