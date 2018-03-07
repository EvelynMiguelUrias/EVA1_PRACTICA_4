/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_practica_4;

/**
 *
 * @author Evelyn
 */
/*
CREAR DOS MATRICES DE 5 * 5, LLENAR CON NUMEROS ALEATORIOS (DOUBLES) ENTRE 1 Y 10
CREAR UNA MATRIZ DE 5 * 5 DONDE ALMACENE LOS RESULTADOS
DE MULTIPLICAR CADA POSICION DE LAS MATRICES
*/
public class EVA1_PRACTICA_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //CREAMOS LOS DOS ARREGLOS 
        double aiMatriz1[][] = new double[5][5];
        double aiMatriz2[][] = new double[5][5];
        //DAMOS VALORES ALEATORIOS E IMPRIMIMOS LA PRIMER MATRIZ
        System.out.println("Matriz 1");
         for (int i = 0; i < aiMatriz1.length; i++) {
             for (int j = 0; j < aiMatriz1[i].length; j++) {
                 aiMatriz1[i][j] = (double)(Math.random() * 10);
                 
                System.out.print("[" + i +"][" + j + "] " +  aiMatriz1[i][j]); 
                
             }
             System.out.println(aiMatriz1[i]);
        }
         //DAMOS VALORES ALEATORIOS E IMPRIMOMOS LA SEGUNDA MATRIZ
         System.out.println("Matriz 2");
         for (int i = 0; i < aiMatriz2.length; i++) {
             for (int j = 0; j < aiMatriz2[i].length; j++) {
                 aiMatriz2[i][j] = (double)(Math.random() * 10);
                 
                 System.out.print("[" + i +"][" + j + "] "  +  aiMatriz2[i][j]);
             }
             System.out.println(aiMatriz2[i]);
        }
         //CREAMOS MATRIZ DONDE GUARDAREMOS LOS RESULTADOS DE LA MULTIPLICACION
        double aiMatrizRes[][] = new double[5][5];
        //REALIZAMOS LA MULTIPLICACION DE LAS MATRICES
        for (int i = 0; i < aiMatrizRes.length; i++) {
            for (int j = 0; j < aiMatrizRes[i].length; j++) {
                aiMatrizRes[i][j] = aiMatriz1[i][j] * aiMatriz2[i][j];
            }        
            }
        //IMPRIMIMOS LA MATRIZ DE LAS MULTIPLICACIONES
        System.out.println("Matriz multiplicacion");
        for (int i = 0; i < aiMatrizRes.length; i++) {
            for (int j = 0; j < aiMatrizRes[i].length; j++) {
                System.out.print("[ " + aiMatrizRes[i][j] + " ]");
            }
            System.out.println(" ");
        }
        }
        
        // TODO code application logic here
    }
    

