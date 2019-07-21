package Algorithm;

public class mouseInaMaze_backtracking {



    private boolean isSafe(int[][] maze, int x, int y,int [][]sol){

        return (x>=0 && x<maze.length && y>=0 & y<maze.length && maze[x][y]==1&&sol[x][y]!=1);

    }
    private void printSol(int[][] sol) {

        for (int i = 0; i < sol.length; i++) {
            for (int j = 0; j < sol.length; j++) {
                System.out.print(" " + sol[i][j] + " ");
            }
            System.out.print("\n");
        }
    }

    public boolean solveMaze(int[][]maze) {
        int[][] sol = new int[maze.length][maze.length];


        if(! coreSolver(maze,0,0,sol)){
            printSol(sol);
            return false;
        }
        printSol(sol);
        return true;

    }

    private boolean coreSolver(int[][]maze,int x,int y,int[][]sol){

        if(x==(maze.length-1)&&y==(maze.length-1)){
            sol[x][y] =1;
            return true;
        }

        if(isSafe(maze,x,y,sol)){
            sol[x][y]=1;

            if(coreSolver(maze,x+1,y,sol)){
                return true;
            }
            if(coreSolver(maze,x,y+1,sol)){
                return true;
            }

            if(coreSolver(maze,x-1,y,sol)){
                return true;
            }

            if(coreSolver(maze,x+1,y,sol)){
                return true;
            }

            sol[x][y]=0;

        }
        return false;



    }

    public static void main (String[]args){
        int [][] maze = {
                { 1, 0, 1, 1, 1 },
                { 1, 1, 1, 0 ,1 },
                { 0, 1, 0, 0, 1},
                { 0, 1, 0, 0, 1},
                { 0, 0, 0, 0, 1}
         };

        mouseInaMaze_backtracking mazeSolver = new mouseInaMaze_backtracking();
        System.out.println(mazeSolver.solveMaze(maze));





}







}
