public class array 3{

    System.out.println("Array 2 Dimensi AxB");
            int[][] G = {{6,3,2},{4,3,2}};
            int[][] M = {{1,2,3},{2,3,1}};
            int[] rresult = new int[G.length]; 
            
            for (int i = 0; i < G.length; i++) {
                int ddd = 0;
                for (int j = 0; j < G[i].length; j++) {
                    ddd += G[i][j]*M[i][j];
                }
                rresult[i] = ddd;
            }
            for (int i = 0; i < G.length; i++) {
                for (int j = 0; j < G[i].length; j++) {
                    System.out.println("A "+G[i][j]+" B "+M[i][j]);
                    int gggg = G[i][j] * M[i][j];
                    System.out.println("Hasil perkalian tersebut : "+gggg);
                }
                System.out.println("Hasil pertambahan dari perkalian tersebut : "+rresult[i]);
                System.out.println("==============================================");
            }
            for (int i = 0; i < 2; i++) {
                System.out.print("["+rresult[i]+"]");
            }
}

