/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.ArrayList;

/**
 *
 * @author user
 */
public class LogicOperation {
    
    //Implikacja
    public boolean imp(boolean a, boolean b){
        boolean ret = true;
        if(a==true && b==false) ret=false;
        return ret;
    }
    
    //Lista kombinacji
    public ArrayList<ArrayList<Boolean>> combinations(int args){
        ArrayList<ArrayList<Boolean>> ret = new ArrayList<ArrayList<Boolean>>();
        int valOfCombinations = (int) Math.pow(2, args);
        
        for(int i=0;i<valOfCombinations;i++){
            ArrayList<Boolean> position = new ArrayList<Boolean>(args);
            for(int k=0; k<args; k++) position.add(true);
            
            int val = i;
            for(int j=0; j<args;j++){
                boolean in = (val%2 == 1)? true : false;
                position.set(args-1-j, in);
                val/=2;
            }
            ret.add(position);
        }
        return ret;
    }
    
    //Wyœwietla kombinacje
    public void showCombinations(ArrayList<ArrayList<Boolean>> toShow){
        for(ArrayList<Boolean> e : toShow){
            for(boolean f:e){
                if(f) System.out.print("1 ");
                else System.out.print("0 ");
            }
            System.out.println("");
        }
    }
    
    //Wyœwietla kombinacje oraz odpowiadaj¹ce wyniki z metody calculate
    public void showCombinationsAndResult(ArrayList<ArrayList<Boolean>> toShow){
        for(ArrayList<Boolean> e : toShow){
            for(boolean f:e){
                if(f) System.out.print("1 ");
                else System.out.print("0 ");
            }
            System.out.println("  Result: " + calculate(e));
        }
    }
    
    //G³ówne obliczenia. RET = dzia³anie do wykonania
    public boolean calculate(ArrayList<Boolean> a){
        boolean p = a.get(0);
        boolean q = a.get(1);
        boolean r = a.get(2);
        boolean s = a.get(3);
        boolean t = a.get(4);
        
        //boolean ret = imp((imp((p&&q),!r) && imp((p||r),!q)) , (imp((p==q) && (!p&&r),imp((p||q),r))));
        //boolean ret = imp((imp(p,q) && r==s)&&(imp(imp(p,r),imp(q,s))) , (imp((p&&q),(q==r))||(imp(p==r,(q==(!s))))));
        //boolean ret = imp((imp(p,!q) && imp(r,!s)) || (imp((p==!q),imp(r,s))) , imp(imp((p&&q),(r||s)),imp((p&&r),!(!q&&r))));
        boolean ret = imp(imp(imp(imp(p,(q&&r)),((p==q)&&(imp(r,s)))),imp(((imp(p,q))&&(imp(p,r))),imp(p&&q,r&&t))), imp(imp(p,(q&&r)),imp((p==q && imp(r,s)),imp(imp(p,q)&&imp(p,r),imp(p&&q,r&&t)))));
        
        return ret;
    }
    
    public static void main(String[] args) {
        try{
            LogicOperation logic = new LogicOperation();
            logic.showCombinationsAndResult(logic.combinations(5)); //wywo³anie z argumentem liczby zmiennych
        }
        catch(IndexOutOfBoundsException e){
            System.out.println("Bad value of arguments in main method");
        }
    }
}
