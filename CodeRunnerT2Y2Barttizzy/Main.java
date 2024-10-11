import java.util.ArrayList;
//import java.util.Collections;
import java.util.Random;

public class Main {


	public static int Q1_ValidMatrix(int[][] matrix) {

		if(matrix == null) {
			return -1; 
		}
		
				
		int numRows = matrix.length;
	    int numColumns = matrix[0].length; 
	    for (int i = 1; i < numRows; i++) {
	        if (matrix[i].length != numColumns) {
	            return -2; // Not square
	        }
	    }

		for(int i = 0; i < matrix.length; i++) {

			for(int j = i + 1; j < matrix.length; j++) {

				if(matrix[i][j] != matrix[j][i]) {

					return -3; 
				}
			};

		};

		for(int i = 0; i < matrix.length; i ++) {

			if(matrix[i][i] != 0) {
				return -4; 
			}

		};


		for(int i = 0; i < matrix.length; i++) {

			for(int j = 0; j < matrix.length; j++) {

				if(matrix[i][j] != 0 && matrix[i][j] != 1) {

					return -5; 
				}
			};

		};


		return 1; 

	}
	
	
	public static ArrayList<Integer> Q2_InitialStartingPoint(int n) {
		
		if( n < 1) {
			return null;
		}
		Random rnd = new Random();
		ArrayList<Integer> Arrangement = new ArrayList<Integer>(n);
 		
		for(int i = 0; i < n; i++) {
			
			int clr = rnd.nextInt(4) + 1; 
			
			Arrangement.add(clr);
		}
		
		return Arrangement;
		
	}
	

	
	public static int Q3_ColourClashes(int node, int[][] graph, ArrayList<Integer> solution) {
	    
		int clashCount = 0;
		
		if(!(node < graph.length) || (node < 0)) {
			return -1;
		}
		
		if(solution.size() != graph.length) {
			return -2;
		}
		
		for(int i = 0; i <solution.size(); i++) {
			
			
			if(   ((solution.get(i) == 1))    ) {
				
				
			}else {
				if(   ((solution.get(i) == 2))    ) {
					
					
				}else {
					if(   ((solution.get(i) == 3))    ) {
						
						
					}else {
						if(   ((solution.get(i) == 4))    ) {
							
							
						}
						else {
							return -3;
						}
					}
				}
			}
		}
		
		

	    for (int neighbor = 0; neighbor < graph.length; neighbor++) {
	        if (graph[node][neighbor] == 1) {
	            if (solution.get(node).equals( solution.get(neighbor))) {
	                clashCount++;
	            }
	        }
	    }

	    return clashCount;
	}
	
		
	
		
	public static int Q4_Fitness(int[][]graph, ArrayList<Integer> solution) {
		
		int clashCount = 0;
		
		if(solution.size() != graph.length) {
			return -1;
		}
		
for(int i = 0; i <solution.size(); i++) {
			
			
			if(   ((solution.get(i) == 1))    ) {
				
				
			}else {
				if(   ((solution.get(i) == 2))    ) {
					
					
				}else {
					if(   ((solution.get(i) == 3))    ) {
						
						
					}else {
						if(   ((solution.get(i) == 4))    ) {
							
							
						}
						else {
							return -2;
						}
					}
				}
			}
		}
		
		for(int i = 0; i < graph.length; i ++) {
			
			for(int j = i + 1; j < graph.length ; j ++) {
				
				if(graph[i][j] == 1 && solution.get(i) == solution.get(j)) {
					
					clashCount++;
				}
				
			}
			
		}
		
		return clashCount * 2;
		
	}
	

	
	
public static ArrayList<Integer> Q5_SmallChange(ArrayList<Integer> solution) {
	    
	ArrayList<Integer> empty = new ArrayList<Integer>();
	
	if(solution.size() == 0) {
		return null;
	}
	
	if(solution.equals(null)){
		
		return null;
	}
	
	
	
	
	for(int i = 0; i <solution.size(); i++) {
		
		
		if(   ((solution.get(i) == 1))    ) {
			
			
		}else {
			if(   ((solution.get(i) == 2))    ) {
				
				
			}else {
				if(   ((solution.get(i) == 3))    ) {
					
					
				}else {
					if(   ((solution.get(i) == 4))    ) {
						
						
					}
					else {
						return empty;
					}
				}
			}
		}
	}
	
	
	ArrayList<Integer> ArrangementNew = new ArrayList<>(solution); 
	    
	    Random rnd = new Random();
	    int randomElement = rnd.nextInt(ArrangementNew.size()); 
	    
	    int currentColor = ArrangementNew.get(randomElement); 
	    
	    Random rand = new Random();
	    int randomColour;
	    
	    do {
	        randomColour = rand.nextInt(4) + 1; 
	    } while (randomColour == currentColor); 
	    
	    
	    ArrangementNew.set(randomElement, randomColour);
	    
	    return ArrangementNew;
	}
	
		



	public static void main(String[] args) {
		// TODO Auto-generated method stub


		int[][] graph = {
			    {0, 1, 1},
			    {1, 0, 1},
			    {1, 1, 0}
			    
			};
		
//		int[][] M = [][];
		
//		int[][] M = null;
		
		int n = 7;
		
		//int[] S = {1,1,1,1,1,};
		
		ArrayList<Integer> solution = new ArrayList<Integer>();
		
		solution.add(1);
		solution.add(1);
		solution.add(1);
		
		ArrayList<Integer> sol = new ArrayList<Integer>();
		sol = null;
		
		
		//ArrayList<Integer> solution = new ArrayList<Integer>();
		
		
		
		int node = 0;
		
		
		
//		ArrayList<Integer> Arrangement = new ArrayList<Integer>();
//		
//		Arrangement.add(1);
//		Arrangement.add(1);
//		Arrangement.add(1);
//		Arrangement.add(1);
//		Arrangement.add(1);
//		Arrangement.add(1);
//		Arrangement.add(1);
//		Arrangement.add(1);

		
	

	//System.out.println("is it a valid matrix? " + " "+ Q1_ValidMatrix(graph));
	
	//System.out.println(Q2_InitialStartingPoint(n) + "    Initial starting arrangement");
	
	//System.out.println("clash count: " + " "+ Q3_ColourClashes(node,graph,solution));
	
	//System.out.println("fitness score: " + " "+ Q4_Fitness(graph, solution));
	
	//System.out.println(Q5_SmallChange(solution));

	
	
	}

}
