# Simulated Annealing - Graph Colouring Problem

I developed a Simulated Anealing algorithm alongside other functions to solve a specified problem. The problem is the graph colouring problem. I adhered to the below specification given by my university.


"The Graph Colouring Problem involves assigning colours to the
boroughs on a map in such a way that no two neighbouring boroughs(those that are adjacent or share a border)
have the same colour. According to existing theories, this task can be accomplished using just four colours. If
we assign numbers to the boroughs on a map from 1 to N, and also the colours from 1 to 4, we can represent
the adjacency of boroughs using an N × N matrix. In the example within Figure 1, N is 32. However, for the
purposes of your code, assume that N can be of any value greater than 0. The matrix can be represented as
follows: If there are N nodes to represent, for a matrix M, a non-zero value of Mij (i
th row, j
th column of M) means
there is an edge between node i and j. As the graph is non-weighted, Mij is either 1 if borough i and borough j
are neighbours (adjacent to each other), and a 0 is placed where they are not.

When writing your program, note that a valid matrix entails the followings:
1) The matrix is square
2) The matrix is symmetrical (Mij = Mji)
3) The leading diagonal (i, i) contains zero values
4) The matrix is binary i.e. contain zeros and ones only

   
Solving the problem can be quite computationally expensive, and thus, a heuristic search algorithm can be used
to traverse the space of possible solutions using a fitness function to locate the best solution. The purpose of
this assignment is to write Java code that solves the functional requirements listed in Table 1, i.e. develop some
or potentially all of the parts of a heuristic search technique to solve the Graph Colouring Problem. ANY single
population algorithm can be used. The representation for the Graph Colouring Problem must be in a vector
format, where each index corresponds to a node (borough) in the graph, and the value at each index represents
the colour assigned to that node. Note that for the purpose of this assignment, the colours MUST be numbered
1, 2, 3 or 4.
The objective is to ensure that no two adjacent nodes (boroughs sharing a border) have the same colour. The
fitness function f for a solution can be calculated by iterating over all edges in the graph and incrementing a
conflicts (clashes) counter each time an edge connects two nodes of the same colour. The aim is to minimise
this function, ideally reaching zero, which means no adjacent nodes share the same colour."
