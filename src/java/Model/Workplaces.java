/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Model;

import java.util.ArrayList;
import java.util.List;

/**
 * Base class for Workplaces.
 */
public class Workplaces
{
    // <editor-fold defaultstate="collapsed" desc="Fields">
    
    // The list of workplace objects.
    private List<Workplace> workplaceList;

    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Properties">

    /**
     * Gets the workplaceList.
     * @return The workplaceList.
     */
    public List<Workplace> getItems()
    {
        return workplaceList;
    }
    
    /**
     * Sets the workplaceList.
     * @param value The value for the workplaceList.
     */
    public void setItems(List<Workplace> value)
    {
        workplaceList = value;
    }

    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Constructors">

    /**
     * Initializes a new instance of the Workplaces class.
     */
    public Workplaces()
    {
        workplaceList = new ArrayList<>();
    }

    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Methods">

    // </editor-fold>
}
