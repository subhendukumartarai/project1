class Source
{

    private static int minCost(int cost[][], int m, int n)
    {
        int minCost[][]=new int[m+1][n+1];
        /* Initialise the first column of the minimum cost (table) array */
        /* Initialise the first row of the table array */
        /* Construct the rest of the table array from the recursion relation */
        return minCost[m][n];
    }

    public static void main(String args[])
    {
        int cost[][]= {{1, 2, 3},
                {4, 8, 2},
                {1, 5, 3}};
        Scanner scan = new Scanner(System.in);
        int xCoordinate = scan.nextInt();
        int yCoordinate = scan.nextInt();
        System.out.println(minCost(cost,xCoordinate,yCoordinate));
    }
}
