/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Model;

import java.util.ArrayList;
import java.util.List;

/**
 * Base class for Relations.
 */
public class Relations
{
    // <editor-fold defaultstate="collapsed" desc="Fields">
    
    // The list of Relation objects.
    private List<Relation> relationList;

    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Properties">

    /**
     * Gets the relationList.
     * @return The relationList.
     */
    public List<Relation> getItems()
    {
        return relationList;
    }
    
    /**
     * Sets the relationList.
     * @param value The value for the relationList.
     */
    public void setItems(List<Relation> value)
    {
        relationList = value;
    }

    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Constructors">

    /**
     * Initializes a new instance of the Relations class.
     */
    public Relations()
    {
        relationList = new ArrayList<>();
    }

    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Methods">

    // </editor-fold>
}
