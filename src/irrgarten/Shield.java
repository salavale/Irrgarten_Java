/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package irrgarten;

/**
 *
 * @author usuario
 */
public class Shield {
    private float protection;
    private int uses;
    
    public Shield(float p, int u){
        protection=p;
        uses=u;
    }
    
    public float protect(){
        if(uses>0){
            uses--;
            return protection;
        }else return 0;
    }
    
    public String toString (){
        return "S["+protection+", "+uses+"]";
    }
    
    public boolean discard(){
        return Dice.discardElement(uses);
    }
}
