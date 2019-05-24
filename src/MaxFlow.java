
import java.util.*;

public class MaxFlow {
    public static Random random = new Random();
    private static final int height = random.nextInt(12 - 6 + 1) + 6; //genarate random no of edges between 6,12
    // private static int height = 8;
    static int[][] matrix = new int[height][height]; //define adjancy matrix size
    private static String[] arrayIndexStringEquivalents; //char array to represent node in letters(Residual path)
    public static List<Integer> objArraylist = new ArrayList<>(); //arraylist which used to fill adjancency matrix

    public MaxFlow() {
        //no arg constructor
    }

    public MaxFlow(String[] arrayIndexStringEquivalents) {
        this.arrayIndexStringEquivalents = arrayIndexStringEquivalents;    //pass by reference, but don't care since main doesn't modify this
    }

    public static void init() { //fill the values to arraylist which use to fill adjcency matrix
        for (int k = 0; k < height * height; k++) {

            int myarray = random.nextInt(20 - 5 + 1) + 5;

            objArraylist.add(myarray);
        }
    }

    public static void main(String[] args) {
        long startTime = System.nanoTime();

        System.out.println("NUMBER OF NODES ARE: " + height); //print

        init();

        System.out.println("Genarated Value List: " + objArraylist); //print

      //replacing capacity values with 0 to get non complex graph
        //repalce diagonal,first row,last column and more capacities
        if (height == 10 || height == 12) {
            genarate2DArrayAdvanced();
        } else if (height == 9 || height == 11) {
            genarate2DArrayNew();
        } else if (height == 7 || height == 8) {
            genarate2DArray();
        } else if (height == 6) {
            genarate2DArraySimple();
           // System.out.println("going to 6");
        } else {
            System.out.println("no pattern found");
        }
        //char array to represent node in letters(Residual path)
        String[] arrayIndexStringEquivalents = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L"};

        MaxFlow maxFlowFinder = new MaxFlow(arrayIndexStringEquivalents); //refreshing above array

        System.out.println("The maximum possible flow = " +
                maxFlowFinder.fordFulkerson(matrix, 0, height - 1));

      //measuring runtime
        long endTime = System.nanoTime();
        long totalTime = endTime - startTime;
        System.out.println("time elapsed: " + totalTime);


        switchtoDraw();  //call for gui
    }


    private static void genarate2DArraySimple() {
        int listindex = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {  //filling adjacency matrix
                matrix[i][j] = objArraylist.get(listindex++);
                // use arrray index conditions to reduce complexity  & replacing them with zero
                if ((i == j) || (j == 0) || (i == height - 1) || j - i == height - 1 || (i + 3 == j) || (i - j > 3) || (j - i > 3) || (i - 1 == j) || (i - 2 == j) || (i - 3 == j))
                    matrix[i][j] = 0;
            }

        }
        System.out.println("\n"); //print
        System.out.println(Arrays.deepToString(matrix).replace("], ", "]\n").replace("[[", "[").replace("]]", "]"));

    }

    private static void genarate2DArray() {
        int listindex = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = objArraylist.get(listindex++);
                // use arrray index conditions to reduce complexity  & replacing them with zero
                if ((i == j) || (j == 0) || (i == height - 1) || j - i == height - 1 || (i + 3 == j) || (i - j > 3) || (j - i > 3) || (i - 1 == j) || (i - 2 == j))
                    matrix[i][j] = 0;
            }

        }
        System.out.println(" \n"); //print
        System.out.println(Arrays.deepToString(matrix).replace("], ", "]\n").replace("[[", "[").replace("]]", "]"));

    }

    private static void genarate2DArrayNew() {
        int listindex = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = objArraylist.get(listindex++);
                // use arrray index conditions to reduce complexity  & replacing them with zero
                if ((i == j) || (j == 0) || (i == height - 1) || j - i == height - 1 || (i + 3 == j) || (i - j > 3) || (j - i > 3) || (i - 1 == j) || (i - 2 == j) || (i + 1) == (height - j))
                    matrix[i][j] = 0;
            }

        }
        System.out.println("\n");
        System.out.println(Arrays.deepToString(matrix).replace("], ", "]\n").replace("[[", "[").replace("]]", "]"));

    }

    private static void genarate2DArrayAdvanced() {

        int listindex = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = objArraylist.get(listindex++);
                //use arrray index conditions to reduce complexity  & replacing them with zero
                if ((i == j) || (j == 0) || (i == height - 1) || j - i == height - 1 || (i + 3 == j) || (i - j > 3) || (j - i > 3) || (i - 1 == j) || (i - 2 == j) || (i + 1) == (height - j) || (i + 3) == (height - j))
                    matrix[i][j] = 0;
                //  if ((i == j ) || (j==0) || (i==height-1) || j-i == height-1 )
                //      matrix[i][j] = 0;
            }

        }
        System.out.println(" \n");
        System.out.println(Arrays.deepToString(matrix).replace("], ", "]\n").replace("[[", "[").replace("]]", "]"));

    }


    private static int fordFulkerson(int[][] graph, int s, int t) {

        int u, v;    //create residual graph and fill the residual graph with randomly generated capacities
        int rGraph[][] = new int[height][height];
        for (u = 0; u < height; u++)
            for (v = 0; v < height; v++)
                rGraph[u][v] = graph[u][v];


        int parent[] = new int[height]; //store path of parent nodes

        int max_flow = 0;  //there is no flow

        while (bfs(rGraph, s, t, parent)) {     //Augment the flow while there is a path s to t s=source node, t=target node
            String pathString = ""; //String of residual path

            //find the maximum flow through founded path
            int path_flow = Integer.MAX_VALUE;
            for (v = t; v != s; v = parent[v]) {
                u = parent[v];
                path_flow = Math.min(path_flow, rGraph[u][v]);

                pathString = " --> " + arrayIndexStringEquivalents[v] + pathString; //add node string to path
            }
            //  pathString= "S"+pathString;		//loop stops before it gets to S, so add S to the beginning
            System.out.println("Augmentation path \n A" + pathString);
            System.out.println("(min flow on path added to max flow) = " + path_flow + "\n");

            for (v = t; v != s; v = parent[v]) {  //update residual capacities
                u = parent[v];
                rGraph[u][v] -= path_flow;
                rGraph[v][u] += path_flow;
            }
            max_flow += path_flow; //sum of path flow is maxflow
        }
        return max_flow;


    }


    private static boolean bfs(int[][] rGraph, int s, int t, int[] parent) {  //if there is a path from source to sink return true
        boolean visited[] = new boolean[height]; //store visited nodes
        for (int i = 0; i < height; ++i)
            visited[i] = false;  //mark all nodes a not visited
        LinkedList<Integer> queue = new LinkedList<Integer>();  //queue and dequeue source,queue and remove nodes according to visiting nodes
        queue.add(s);
        visited[s] = true; // set source node as visited
        parent[s] = -1;    //parent node of source node is -1

        while (queue.size() != 0) {  //searching new paths while queue makes empty
            int u = queue.poll();

            for (int v = 0; v < height; v++) {
                if (visited[v] == false && rGraph[u][v] > 0) {
                    queue.add(v);
                    parent[v] = u;
                    visited[v] = true;
                }
            }
        }

        return (visited[t] == true);  //return true if reached to the target node,else false
    }


    public static void switchtoDraw() {

        switch (height) {

            case 6:

                System.out.println("goto 6 sketch");
                Graphcreator.graphDraw6();
                break;
            case 7:
                System.out.println("goto 7 sketch");
                Graphcreator.graphDraw7();
                break;
            case 8:
                System.out.println("goto 8 sketch");
                Graphcreator.graphDraw8();
                break;
            case 9:
                System.out.println("goto 9 sketch");
                Graphcreator.graphDraw9();
                break;
            case 10:
                System.out.println("goto 10 sketch");
                Graphcreator.graphDraw10();
                break;
            case 11:
                System.out.println("goto 11 sketch");
                Graphcreator.graphDraw11();
                break;
            case 12:
                System.out.println("goto 12 sketch");
                Graphcreator.graphDraw12();
                break;
            default:
                // matrix = new int[6][6];
                System.out.println("out of range");
                break;
        }

    }
}

