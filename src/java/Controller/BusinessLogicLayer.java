/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controller;

/**
 * Interaction logic for BusinessLogicLayer.
 */
public class BusinessLogicLayer
{
    // <editor-fold defaultstate="collapsed" desc="Fields">

    // Connection to DataAccessLayer.
    private DataAccessLayer dataAccessLayer = new DataAccessLayer();
    
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Methods">

    // <editor-fold defaultstate="collapsed" desc="List">

    /**
     * Lists the Workplaces.
     * @return The list of Workplaces or null.
     */
    public Model.Workplaces ListWorkplaces()
    {
        try
        {
            return dataAccessLayer.ListWorkplaces();
        }
        catch (Exception e)
        {
            return null;
        }
    }

    /**
     * Lists the Employees.
     * @return The list of Employees or null.
     */
    public Model.Employees ListEmployees()
    {
        try
        {
            return dataAccessLayer.ListEmployees();
        }
        catch (Exception e)
        {
            return null;
        }
    }

    /**
     * Lists the Relations.
     * @return The list of Relations or null.
     */
    public Model.Relations ListRelations()
    {
        try
        {
            return dataAccessLayer.ListRelations();
        }
        catch (Exception e)
        {
            return null;
        }
    }
    
    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Delete">

    /**
     * Deletes a Workplace.
     * @param input The Workplace to delete.
     * @return The outcome of the method.
     */
    public boolean DeleteWorkplace(Model.Workplace input)
    {
        try
        {
            return dataAccessLayer.DeleteWorkplace(input);
        }
        catch (Exception e)
        {
            return false;
        }
    }

    /**
     * Deletes an Employee.
     * @param input The Employee to delete.
     * @return The outcome of the method.
     */
    public boolean DeleteEmployee(Model.Employee input)
    {
        try
        {
            return dataAccessLayer.DeleteEmployee(input);
        }
        catch (Exception e)
        {
            return false;
        }
    }

    /**
     * Deletes a Relation.
     * @param input The Relation to delete.
     * @return The outcome of the method.
     */
    public boolean DeleteRelation(Model.Relation input)
    {
        try
        {
            return dataAccessLayer.DeleteRelation(input);
        }
        catch (Exception e)
        {
            return false;
        }
    }
    
    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Add">

    /**
     * Adds a Workplace.
     * @param input The Workplace to add.
     * @return The outcome of the method.
     */
    public boolean AddWorkplace(Model.Workplace input)
    {
        try
        {
            return dataAccessLayer.AddWorkplace(input);
        }
        catch (Exception e)
        {
            return false;
        }
    }

    /**
     * Adds an Employee.
     * @param input The Employee to add.
     * @return The outcome of the method.
     */
    public boolean AddEmployee(Model.Employee input)
    {
        try
        {
            return dataAccessLayer.AddEmployee(input);
        }
        catch (Exception e)
        {
            return false;
        }
    }

    /**
     * Adds a Relation.
     * @param input The Relation to add.
     * @return The outcome of the method.
     */
    public boolean AddRelation(Model.Relation input)
    {
        try
        {
            return dataAccessLayer.AddRelation(input);
        }
        catch (Exception e)
        {
            return false;
        }
    }
    
    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Modify">

    /**
     * Edits a Workplace.
     * @param input The Workplace to edit.
     * @return The outcome of the method.
     */
    public boolean ModifyWorkplace(Model.Workplace input)
    {
        try
        {
            return dataAccessLayer.ModifyWorkplace(input);
        }
        catch (Exception e)
        {
            return false;
        }
    }

    /**
     * Edits an Employee.
     * @param input The Employee to edit.
     * @return The outcome of the method.
     */
    public boolean ModifyEmployee(Model.Employee input)
    {
        try
        {
            return dataAccessLayer.ModifyEmployee(input);
        }
        catch (Exception e)
        {
            return false;
        }
    }

    /**
     * Edits a Relation.
     * @param input The Relation to edit.
     * @return The outcome of the method.
     */
    public boolean ModifyRelation(Model.Relation input)
    {
        try
        {
            return dataAccessLayer.ModifyRelation(input);
        }
        catch (Exception e)
        {
            return false;
        }
    }
    
    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Find">

    /**
     * Finds a Workplace by id.
     * @param input The Workplace id to find.
     * @return The Workplace list or null.
     */
    public Model.Workplaces FindWorkplaceById(int input)
    {
        try
        {
            return dataAccessLayer.FindWorkplaceById(input);
        }
        catch (Exception e)
        {
            return null;
        }
    }
    
    /**
     * Finds a Workplace by name.
     * @param input The Workplace name to find.
     * @return The Workplace list or null.
     */
    public Model.Workplaces FindWorkplaceByName(String input)
    {
        try
        {
            return dataAccessLayer.FindWorkplaceByName(input);
        }
        catch (Exception e)
        {
            return null;
        }
    }
    
    /**
     * Finds an Employee by id.
     * @param input The Employee id to find.
     * @return The Employee list or null.
     */
    public Model.Employees FindEmployeeById(int input)
    {
        try
        {
            return dataAccessLayer.FindEmployeeById(input);
        }
        catch (Exception e)
        {
            return null;
        }
    }

    /**
     * Finds an Employee by name.
     * @param input The Employee name to find.
     * @return The Employee list or null.
     */
    public Model.Employees FindEmployeeByName(String input)
    {
        try
        {
            return dataAccessLayer.FindEmployeeByName(input);
        }
        catch (Exception e)
        {
            return null;
        }
    }

    /**
     * Finds an Employee by email.
     * @param input The Employee email to find.
     * @return The Employee list or null.
     */
    public Model.Employees FindEmployeeByEmail(String input)
    {
        try
        {
            return dataAccessLayer.FindEmployeeByEmail(input);
        }
        catch (Exception e)
        {
            return null;
        }
    }

    /**
     * Finds an Employee by name and email.
     * @param name The Employee name to find.
     * @param email The Employee email to find.
     * @return The Employee list or null.
     */
    public Model.Employees FindEmployeeByNameAndEmail(String name, String email)
    {
        try
        {
            return dataAccessLayer.FindEmployeeByNameAndEmail(name, email);
        }
        catch (Exception e)
        {
            return null;
        }
    }
    
    /**
     * Finds an Relation by id.
     * @param input The Relation id to find.
     * @return The Relation list or null.
     */
    public Model.Relations FindRelationById(int input)
    {
        try
        {
            return dataAccessLayer.FindRelationById(input);
        }
        catch (Exception e)
        {
            return null;
        }
    }

    /**
     * Finds an Relation by Employee.
     * @param input The Relation Employee to find.
     * @return The Relation list or null.
     */
    public Model.Relations FindRelationByEmployee(String input)
    {
        try
        {
            return dataAccessLayer.FindRelationByEmployee(input);
        }
        catch (Exception e)
        {
            return null;
        }
    }

    /**
     * Finds an Relation by Workplace.
     * @param input The Relation Workplace to find.
     * @return The Relation list or null.
     */
    public Model.Relations FindRelationByWorkplace(String input)
    {
        try
        {
            return dataAccessLayer.FindRelationByWorkplace(input);
        }
        catch (Exception e)
        {
            return null;
        }
    }

    /**
     * Finds an Relation by Employee and Workplace.
     * @param employee The Relation Employee to find.
     * @param workplace The Relation Workplace to find.
     * @return The Relation list or null.
     */
    public Model.Relations FindRelationByEmployeeAndWorkplace(String employee, String workplace)
    {
        try
        {
            return dataAccessLayer.FindRelationByEmployeeAndWorkplace(employee, workplace);
        }
        catch (Exception e)
        {
            return null;
        }
    }

    // </editor-fold>
    
    // </editor-fold>
}
