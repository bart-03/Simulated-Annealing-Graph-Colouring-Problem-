import java.util.ArrayList;
import java.util.Random;

public class GCProblem {


	
	public static ArrayList<Integer> Q6_Init (int[][] graph, int iter) {
	    
		if(isValidMatrix(graph) != 0 ) {
			return null;
		}
		
		if(iter < 1) {
			return null;
		}
		
		ArrayList<Integer> s = initialStartingPoint(graph.length);
	    
	    double initialTemperature = 100000;
	    double temperature = initialTemperature;

	    	    double coolingRate = Math.pow(0.01, 1.0 / iter);

	    for (int i = 0; i < iter; i++) {
	        int f = fitnessFunction(graph, s);
	        ArrayList<Integer> s1 = smallChangeOperator(s);
	        int f1 = fitnessFunction(graph, s1);

	        if (f1 > f) {
	            double p = Math.exp((f - f1) / temperature); 
	            double randomValue = Math.random();
	            if (p < randomValue) {
	                s = s1; 
	            }
	        } else {
	            s = s1; 
	        }

	       
	        temperature *= coolingRate;
	    }
	   
	    

	   
	    return s;
	}



private static ArrayList<Integer> initialStartingPoint(int N) {
	
	Random rnd = new Random();
	ArrayList<Integer> Arrangement = new ArrayList<Integer>(N);
		
	for(int i = 0; i < N; i++) {
		
		int clr = rnd.nextInt(4) + 1; 
		
		Arrangement.add(clr);
	}
	
	return Arrangement;
	
}

private static int fitnessFunction(int[][]M, ArrayList<Integer> Solution) {
	
	int clashCount = 0;
	
	for(int i = 0; i < M.length; i ++) {
		
		for(int j = i + 1; j < M.length ; j ++) {
			
			if(M[i][j] == 1 && Solution.get(i) == Solution.get(j)) {
				
				clashCount++;
			}
			
		}
		
	}
	
	return clashCount * 2;

	
}

private static ArrayList<Integer> smallChangeOperator(ArrayList<Integer> Arrangement) {
    ArrayList<Integer> ArrangementNew = new ArrayList<>(Arrangement); 
    
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

private static int isValidMatrix(int[][] M) {

	if(M == null) {
		return 1; 
	}
	
	if (M.length == 0) {
	    return 2; 
	} 
			
	int numRows = M.length;
    int numColumns = M[0].length; 
    for (int i = 1; i < numRows; i++) {
        if (M[i].length != numColumns) {
            return 3; 
        }
    }

	for(int i = 0; i < M.length; i++) {

		for(int j = i + 1; j < M.length; j++) {

			if(M[i][j] != M[j][i]) {

				return 4; 
			}
		};

	};

	for(int i = 0; i < M.length; i ++) {

		if(M[i][i] != 0) {
			return 5; 
		}

	};


	for(int i = 0; i < M.length; i++) {

		for(int j = 0; j < M.length; j++) {

			if(M[i][j] != 0 && M[i][j] != 1) {

				return 6; 
			}
		};

	};


	return 0; 



}




}


