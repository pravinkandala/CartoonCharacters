package edu.niu.cs.z1761257.character;

/**
 * Created by Pravin on 2/16/16.
 */
public class Character {
    private String characterDescription;
    private int characterID;

    public Character( String newDescription, int newID ){

        characterDescription = newDescription;
        characterID = newID;

    }//end of Character class constructor

    public int getCharacterID(){
        return characterID;
    }//end of getCharacterID

    public void setCharacterID(int newID){
        characterID = newID;
    }//end of setCharacter

    public String getCharacterDescription(){
        return characterDescription;
    }//end of getCharacterDescription

    public void setCharacterDescription(String newDescription){
        characterDescription = newDescription;
    }//end of setCharacterDescription

}//end of main Class Character
