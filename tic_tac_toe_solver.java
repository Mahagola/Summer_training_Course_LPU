import java.util.*;
public class tic_tac_toe{
    static String[] board;
    static String turn;

    static String find_winner(){
        String line=null;
        for(int a=0;a<8;a++){
            switch(a){
                // cases for rows
                case 0:
                    line=board[0]+board[1]+board[2]; 
                    break;
                case 1:
                    line=board[3]+board[4]+board[5];
                    break;
                case 2:
                    line=board[6]+board[7]+board[8];
                    break;
                // cases for columns
                case 3:
                    line=board[0]+board[3]+board[6];
                    break;
                case 4:
                    line=board[1]+board[4]+board[7];
                    break;
                case 5:
                    line=board[2]+board[5]+board[8];
                    break;
                //cases for diagonals
                case 6: 
                    line=board[0]+board[4]+board[8];
                    break;
                case 7: 
                    line=board[2]+board[4]+board[6];
                    break;
            }
            if(line.equals("XXX")){
                return "X";
            }
            else if(line.equals("000")){
                return "0";
            }
        }
        for(int i=0;i<9;i++){
            if(Arrays.asList(board).contains(String.valueOf(i+1))){
                break;
            }
            else if(i==8){
                return "draw";
            }
        }
        System.out.println(turn+" 's turn : enter a slot to place "+turn+" in : ");
        return null;
    }
    static void board_layout(){
        System.out.println("| "+board[0]+" | " +board[1]+" | "+board[2]+" | ");
        System.out.println("-------------");
        System.out.println("| "+board[3]+" | " +board[4]+" | "+board[5]+" | ");
        System.out.println("-------------");
        System.out.println("| "+board[6]+" | " +board[7]+" | "+board[8]+" | ");
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        board=new String[9];
        turn="X";
        String winner=null;
        for(int i=0;i<9;i++){
            board[i]=String.valueOf(i+1);
        }
        System.out.println("Welcome to 3X3 TIC TAC TOE");
        board_layout();
        System.out.println("X will play ! Enter slot number to place in : ");
        while(winner==null){
            int numInput;
            try{
                numInput=sc.nextInt();
                if(!(numInput>0&&numInput<=9)){
                    System.out.println("Invalid Input!, Re-enter slot Number : ");
                    continue;
                }
            }
            catch(InputMismatchException e){
                System.out.println("Invalid Input : Re-enter slot Number : ");
                continue;
            }
            if(board[numInput-1].equals(String.valueOf(numInput))){
                board[numInput-1]=turn;
                if(turn.equals("X")){
                    turn="0";
                }
                else{
                    turn="X";
                }
                board_layout();
                winner=find_winner();
            }
            else{
                System.out.println("Slot already taken!! Re-Enter slot number ");
            }
        }
        if(winner.equals("draw")){
            System.out.println("It's a draw !! Thank you for playing");
        }
        else{
            System.out.println("Congratulations "+ winner+" have won ! Thanks for playing ");
        }
        sc.close();
    }

}
