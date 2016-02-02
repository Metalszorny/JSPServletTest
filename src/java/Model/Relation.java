/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Model;

/**
 * Base class for Relation.
 */
public class Relation
{
    // <editor-fold defaultstate="collapsed" desc="Fields">

    // The relationId field of the Relation class.
    private int relationId;

    // The relationEmployee field of the Relation class.
    private int relationEmployee;

    // The relationWorkplace field of the Relation class.
    private int relationWorkplace;
    
    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Properties">
    
    /**
     * Gets the relationId.
     * @return The relationId.
     */
    public int getRelationId()
    {
        return relationId;
    }
    
    /**
     * Sets the relationId.
     * @param value The value for the relationId.
     */
    public void setRelationId(int value)
    {
        relationId = value;
    }
    
    /**
     * Gets the relationEmployee.
     * @return The relationEmployee.
     */
    public int getRelationEmployee()
    {
        return relationEmployee;
    }
    
    /**
     * Sets the relationEmployee.
     * @param value The value for the relationEmployee.
     */
    public void setRelationEmployee(int value)
    {
        relationEmployee = value;
    }
    
    /**
     * Gets the relationWorkplace.
     * @return The relationWorkplace.
     */
    public int getRelationWorkplace()
    {
        return relationWorkplace;
    }
    
    /**
     * Sets the relationWorkplace.
     * @param value The value for the relationWorkplace.
     */
    public void setRelationWorkplace(int value)
    {
        relationWorkplace = value;
    }

    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Constructors">

    /**
     * Initializes a new instance of the Relation class.
     */
    public Relation()
    { }

    /**
     * Initializes a new instance of the Relation class.
     * @param relationid The input value for the relationId field.
     * @param relationemployee The input value for the relationEmployee field.
     * @param relationworkplace The input value for the relationWorkplace field.
     */
    public Relation(int relationid, int relationemployee, int relationworkplace)
    {
        relationId = relationid;
        relationEmployee = relationemployee;
        relationWorkplace = relationworkplace;
    }

    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Methods">

    // </editor-fold>
}
