import java.util.Scanner;

public class Viewer
{
     public static void view(int[] [] grid)
    {
	 for(int i = 0; i < grid.length; i++)
        {
            for(int j = 0; j < grid[i].length; j++)
            {
                switch(grid[i][j])
                {
                    case Maze.EMPTY:
                        System.out.print("  ");
                        break;
                        
                    case Maze.WALL:
                        System.out.print("LOL");
                        break;
                        
                    case Maze.START:
                        System.out.print("MHA");
                        break;
                        
                    case Maze.END:
                        System.out.print("BLA");
                        break;
                        
                    case Maze.VISITED:
                        System.out.print("BABS");
                        break;
                        
                    default:
                        throw new AssertionError();
                }
            }
            System.out.println();
        }
    }
}
