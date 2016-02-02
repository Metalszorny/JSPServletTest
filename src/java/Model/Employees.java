/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Model;

import java.util.ArrayList;
import java.util.List;

/**
 * Base class for Employees.
 */
public class Employees
{
    // <editor-fold defaultstate="collapsed" desc="Fields">
    
    // The list of employee objects.
    private List<Employee> employeeList;

    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Properties">
    
    /**
     * Gets the employeeList.
     * @return The employeeList.
     */
    public List<Employee> getItems()
    {
        return employeeList;
    }
    
    /**
     * Sets the employeeList.
     * @param value The value for the employeeList.
     */
    public void setItems(List<Employee> value)
    {
        employeeList = value;
    }

    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Constructors">
    
    /*
     * Initializes a new instance of the Employees class.
     */
    public Employees()
    {
        employeeList = new ArrayList<>();
    }

    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Methods">

    // </editor-fold>
}
