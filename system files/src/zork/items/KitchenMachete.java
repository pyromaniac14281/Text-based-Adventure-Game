/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zork.items;

import zork.interfaces.IWords;
import zork.interfaces.ITakable;
import zork.interfaces.IExaminable;

/**
 *
 * @author Arxa
 */
public class KitchenMachete implements ITakable, IExaminable
{
    private static boolean takenStatus;
    private static boolean examineStatus;

    public KitchenMachete(IWords w) 
    {
        takenStatus = false;
        examineStatus = false;
        w.addWord(getStringItem());
    }

    
    //-------------ITakable-----------------\\
    @Override
    public boolean isTaken()
    {
        return takenStatus;
    }

    @Override
    public String getTakableStringItem()
    {
        return "machete";
    }
    @Override
    public boolean isStucked()
    {
        return false;
    }
    
    @Override
    public void setTakenStatus(boolean s)
    {
       takenStatus = s;
    }
    
    @Override
    public void printItsStucked()
    {
        System.out.println("\nYou can't take this.\n");
    }
    
    @Override
    public void printTakenOK()
    {
        System.out.printf("\nYou have added %s to your bag. \n",specialInfo());
    }
    
    @Override
    public String getBagStringItem()
    {
        return "Silver Machete";
    }
    
    @Override
    public boolean isWeapon()
    {
        return true;
    }
    
    @Override
    public boolean isKey()
    {
        return false;
    }
    
    @Override
    public int getCoinsAmount()
    {
        return 0;
    }
    
    //-------------IExaminable-----------------\\
    @Override
    public boolean isExamined()
    {
        return examineStatus;
    }
    @Override
    public String getExaminableStringItem()
    {
        return "machete";
    }
    @Override
    public void setExamineStatus(boolean e)
    {
        examineStatus = e;
    }
    @Override
    public void printExamination()
    {
        System.out.println("\nSeems that this weapon can make some serious damage.\n");
    }
    
    
    
    //-------------Static-----------------\\
    public static boolean getExamineStatus() 
    {
        return examineStatus;
    }

    public static boolean getTakenStatus() 
    {
        return takenStatus;
    }
    
    public static String specialInfo()
    {
        return "a Machete weapon";
    }
    
    public static String getStringItem()
    {
        return "Machete";
    }
}

