/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package irrgarten;

/**
 *
 * @author usuario
 */
public class GameState {
    private String labyrinth;
    private String players;
    private String monsters;
    private int currentPlayer;
    private boolean winner;
    private String log;
    
    GameState(String labyrinth, String players, String monsters,
            int currentPlayer, boolean winner, String log){
    this.labyrinth=labyrinth;
    this.players=players;
    this.monsters=monsters;
    this.currentPlayer=currentPlayer;
    this.winner=winner;
    this.log=log; 
    }
    
    
}
