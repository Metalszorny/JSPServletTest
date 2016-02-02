/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Model;

/**
 * Base class for Workplace.
 */
public class Workplace
{
    // <editor-fold defaultstate="collapsed" desc="Fields">

    // The workplaceId field of the Workplace class.
    private int workplaceId;

    // The workplaceName field of the Workplace class.
    private String workplaceName;

    // The workplaceIsDeleted field of the Workplace class.
    private boolean workplaceIsDeleted;

    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Properties">
    
    /**
     * Gets the workplaceId.
     * @return The workplaceId.
     */
    public int getWorkplaceId()
    {
        return workplaceId;
    }
    
    /**
     * Sets the workplaceId.
     * @param value The value for the workplaceId.
     */
    public void setWorkplaceId(int value)
    {
        workplaceId = value;
    }

    /**
     * Gets the workplaceName.
     * @return The workplaceName.
     */
    public String getWorkplaceName()
    {
        return workplaceName;
    }
    
    /**
     * Sets the workplaceName.
     * @param value The value for the workplaceName.
     */
    public void setWorkplaceName(String value)
    {
        workplaceName = value;
    }

    /**
     * Gets the workplaceIsDeleted.
     * @return The workplaceIsDeleted.
     */
    public boolean getWorkplaceIsDeleted()
    {
        return workplaceIsDeleted;
    }
    
    /**
     * Sets the workplaceIsDeleted.
     * @param value The value for the workplaceIsDeleted.
     */
    public void setWorkplaceIsDeleted(boolean value)
    {
        workplaceIsDeleted = value;
    }

    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Constructors">

    /**
     * Initializes a new instance of the Workplace class.
     */
    public Workplace()
    { }

    /**
     * Initializes a new instance of the Workplace class.
     * @param workplaceid The input value for the workspadeId field.
     * @param workplacename The input value for the workspadeName field.
     * @param workplaceisdeleted The input value for the workspadeIsDeleted field.
     */
    public Workplace(int workplaceid, String workplacename, boolean workplaceisdeleted)
    {
        workplaceId = workplaceid;
        workplaceName = workplacename;
        workplaceIsDeleted = workplaceisdeleted;
    }

    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Methods">

    // </editor-fold>
}
