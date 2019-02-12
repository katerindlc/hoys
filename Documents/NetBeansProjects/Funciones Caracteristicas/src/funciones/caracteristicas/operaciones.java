/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funciones.caracteristicas;

/**
 *
 * @author Usuario
 */
public class operaciones {

    String[] U;
    String[] A;
    String[] B;

    int[] fU;
    int[] fA;
    int[] fB;

    int nu;
    int na;
    int nb;

    public operaciones() {
    }

    public operaciones(String[] U) {
        this.U = U;
    }

    public void funCarU() {
        for (int i = 0; i < U.length; i++) {
            fU[i] = 1;

        }
    }

    public void funCarA() {
        for (int a = 0; a < A.length; a++) {
            for (int u = 0; u< U.length ; u++) {
                if (A[a].equals(U[u])){
                    fA[u]=1;
                    break;
                }
                
            }

        }
    }

    public void funCarB() {
         for (int b = 0; b < B.length; b++) {
            for (int u = 0; u< U.length ; u++) {
                if (B[b].equals(U[u])){
                    fB[u]=1;
                    break;
                }
        }
    }
    }
    public int [] interseccion(){
        int []fr=new int[U.length];
        for (int i = 0; i < U.length; i++) {
            fr[i]=fA[i]*fB[i];
            
        }
        return fr;
    }
    
            
//    public String convFcConj(int []r){
//        
//    
}
