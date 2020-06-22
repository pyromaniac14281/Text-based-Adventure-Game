/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zork.directions;

import zork.interfaces.IDirections;
import zork.interfaces.IWords;
import zork.other.CheckStages;
import zork.other.Initialization;
import zork.other.Output;

/**
 *
 * @author arxa
 */
public class EastDirection implements IDirections
{
    public EastDirection(IWords w) 
    {
        w.addWord(getStringItem());
    }
    
    @Override
    public void checkDirections()
    {
        if (Initialization.currentRoom.getStagesArray()[1] == null)
        {
            Output.printNoExit();
            CheckStages.setPrintD(false);     
        }
        else
        {
            Initialization.currentRoom = Initialization.currentRoom.getStagesArray()[1];
            CheckStages.setPrintD(true);
        }    
    }

    @Override
    public String getStringItem()
    {
        return "east";
    }
   
}
