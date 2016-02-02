/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Model;

/**
 * Base class for Employee.
 */
public class Employee
{
    // <editor-fold defaultstate="collapsed" desc="Fields">

    // The employeeId field of the Employee class.
    private int employeeId;

    // The employeeName field of the Employee class.
    private String employeeName;

    // The employeeEmail field of the Employee class.
    private String employeeEmail;

    // The employeeIsDeleted field of the Employee class.
    private boolean employeeIsDeleted;

    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Properties">
    
    /**
     * Gets the employeeId.
     * @return The employeeId.
     */
    public int getEmployeeId()
    {
        return employeeId;
    }
    
    /**
     * Sets the employeeId.
     * @param value The value for the employeeId.
     */
    public void setEmployeeId(int value)
    {
        employeeId = value;
    }
    
    /**
     * Gets the employeeName.
     * @return The employeeName.
     */
    public String getEmployeeName()
    {
        return employeeName;
    }
    
    /**
     * Sets the employeeName.
     * @param value The value for the employeeName.
     */
    public void setEmployeeName(String value)
    {
        employeeName = value;
    }
    
    /**
     * Gets the employeeEmail.
     * @return The employeeEmail.
     */
    public String getEmployeeEmail()
    {
        return employeeEmail;
    }
    
    /**
     * Sets the employeeEmail.
     * @param value The value for the employeeEmail.
     */
    public void setEmployeeEmail(String value)
    {
        employeeEmail = value;
    }
    
    /**
     * Gets the employeeIsDeleted.
     * @return The employeeIsDeleted.
     */
    public boolean getEmployeeIsDeleted()
    {
        return employeeIsDeleted;
    }
    
    /**
     * Sets the employeeIsDeleted.
     * @param value The value for the employeeIsDeleted.
     */
    public void setEmployeeIsDeleted(boolean value)
    {
        employeeIsDeleted = value;
    }

    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Constructors">

    /**
     * Initializes a new instance of the Employee class.
     */
    public Employee()
    { }

    /**
     * Initializes a new instance of the Employee class.
     * @param employeeid The input value of the employeeId field.
     * @param workplacename The input value of the employeeName field.
     * @param employeeemail The input value of the employeeEmail field.
     * @param workplaceisdeleted The input value of the employeeIsDeleted field.
     */
    public Employee(int employeeid, String workplacename, String employeeemail, boolean workplaceisdeleted)
    {
        employeeId = employeeid;
        employeeName = workplacename;
        employeeEmail = employeeemail;
        employeeIsDeleted = workplaceisdeleted;
    }

    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Methods">

    // </editor-fold>
}
