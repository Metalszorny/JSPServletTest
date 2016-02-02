/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controller;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

/**
 * Interaction logic for DataAccessLayer.
 */
public class DataAccessLayer
{
    // <editor-fold defaultstate="collapsed" desc="Fields">

    // The database connectionString.
    private String url = "jdbc:mysql://localhost:3306/JSPServletTestDatabase";
    
    // The database username.
    String username = "root";
    
    // The database password.
    String password = "root";
    
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
            // Open a connection to the database.
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url, username, password);

            // List the items from the Workplaces table with the stored procedure.
            Model.Workplaces workplaces = new Model.Workplaces();
            CallableStatement cs = conn.prepareCall("{ call spListWorkplaces() }");

            // Execute.
            ResultSet rs = cs.executeQuery();
            
            // Store the items in a Workplace list.
            while (rs.next())
            {
                Model.Workplace workplace = new Model.Workplace();
                
                workplace.setWorkplaceId(rs.getInt("Id"));
                workplace.setWorkplaceName(rs.getString("Name"));
                workplace.setWorkplaceIsDeleted(rs.getBoolean("IsDeleted"));
                
                workplaces.getItems().add(workplace);
            }

            // Close the resultSet, the statement and the connection.
            rs.close();
            cs.close();
            conn.close();

            return workplaces;
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
            // Open a connection to the database.
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url, username, password);

            // List the items from the Employees table with the stored procedure.
            Model.Employees employees = new Model.Employees();
            CallableStatement cs = conn.prepareCall("{ call spListEmployees() }");

            // Execute.
            ResultSet rs = cs.executeQuery();
            
            // Store the items in a Employee list.
            while (rs.next())
            {
                Model.Employee employee = new Model.Employee();
                
                employee.setEmployeeId(rs.getInt("Id"));
                employee.setEmployeeName(rs.getString("Name"));
                employee.setEmployeeEmail(rs.getString("Email"));
                employee.setEmployeeIsDeleted(rs.getBoolean("IsDeleted"));

                employees.getItems().add(employee);
            }

            // Close the resultSet, the statement and the connection.
            rs.close();
            cs.close();
            conn.close();

            return employees;
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
            // Open a connection to the database.
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url, username, password);

            // List the items from the Relations table with the stored procedure.
            Model.Relations relations = new Model.Relations();
            CallableStatement cs = conn.prepareCall("{ call spListRelations() }");

            // Execute.
            ResultSet rs = cs.executeQuery();
            
            // Store the items in a Relation list.
            while (rs.next())
            {
                Model.Relation relation = new Model.Relation();
                
                relation.setRelationId(rs.getInt("Id"));
                relation.setRelationEmployee(rs.getInt("Employee"));
                relation.setRelationWorkplace(rs.getInt("Workplace"));

                relations.getItems().add(relation);
            }

            // Close the resultSet, the statement and the connection.
            rs.close();
            cs.close();
            conn.close();

            return relations;
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
            // Open a connection to the database.
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url, username, password);

            // Delete logically the item from the Workplaces table with the stored procedure.
            CallableStatement cs = conn.prepareCall("{ call spDeleteWorkplace(?) }");
            
            // Fill the values.
            cs.setInt(1, input.getWorkplaceId());
            
            // Execute.
            cs.execute();

            // Close the statement and the connection.
            cs.close();
            conn.close();

            return true;
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
            // Open a connection to the database.
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url, username, password);

            // Delete logically the item from the Employees table with the stored procedure.
            CallableStatement cs = conn.prepareCall("{ call spDeleteEmployee(?) }");
            
            // Fill the values.
            cs.setInt(1, input.getEmployeeId());
            
            // Execute.
            cs.execute();

            // Close the statement and the connection.
            cs.close();
            conn.close();

            return true;
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
            // Open a connection to the database.
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url, username, password);

            // Delete logically the item from the Relations table with the stored procedure.
            CallableStatement cs = conn.prepareCall("{ call spDeleteRelation(?) }");
            
            // Fill the values.
            cs.setInt(1, input.getRelationId());
            
            // Execute.
            cs.execute();

            // Close the statement and the connection.
            cs.close();
            conn.close();

            return true;
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
            // Open a connection to the database.
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url, username, password);

            // Add the item to the Workplaces table with the stored procedure.
            CallableStatement cs = conn.prepareCall("{ call spAddWorkplace(?, ?, ?) }");
            
            // Fill the values.
            cs.setInt(1, input.getWorkplaceId());
            cs.setString(2, input.getWorkplaceName());
            cs.setBoolean(3, input.getWorkplaceIsDeleted());
            
            // Execute.
            cs.execute();

            // Close the statement and the connection.
            cs.close();
            conn.close();

            return true;
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
            // Open a connection to the database.
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url, username, password);

            // Add the item to the Employees table with the stored procedure.
            CallableStatement cs = conn.prepareCall("{ call spAddEmployee(?, ?, ?, ?) }");
            
            // Fill the values.
            cs.setInt(1, input.getEmployeeId());
            cs.setString(2, input.getEmployeeName());
            cs.setString(3, input.getEmployeeEmail());
            cs.setBoolean(4, input.getEmployeeIsDeleted());
            
            // Execute.
            cs.execute();

            // Close the statement and the connection.
            cs.close();
            conn.close();

            return true;
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
            // Open a connection to the database.
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url, username, password);

            // Add the item to the Relations table with the stored procedure.
            CallableStatement cs = conn.prepareCall("{ call spAddRelation(?, ?, ?) }");
            
            // Fill the values.
            cs.setInt(1, input.getRelationId());
            cs.setInt(2, input.getRelationEmployee());
            cs.setInt(3, input.getRelationWorkplace());
            
            // Execute.
            cs.execute();

            // Close the statement and the connection.
            cs.close();
            conn.close();

            return true;
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
            // Open a connection to the database.
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url, username, password);

            // Edit the item in the Workplaces table with the stored procedure.
            CallableStatement cs = conn.prepareCall("{ call spEditWorkplace(?, ?) }");
            
            // Fill the values.
            cs.setInt(1, input.getWorkplaceId());
            cs.setString(2, input.getWorkplaceName());
            
            // Execute.
            cs.execute();

            // Close the statement and the connection.
            cs.close();
            conn.close();

            return true;
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
            // Open a connection to the database.
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url, username, password);

            // Edit the item in the Employees table with the stored procedure.
            CallableStatement cs = conn.prepareCall("{ call spEditEmployee(?, ?, ?) }");
            
            // Fill the values.
            cs.setInt(1, input.getEmployeeId());
            cs.setString(2, input.getEmployeeName());
            cs.setString(3, input.getEmployeeEmail());
            
            // Execute.
            cs.execute();

            // Close the statement and the connection.
            cs.close();
            conn.close();

            return true;
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
            // Open a connection to the database.
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url, username, password);

            // Edit the item in the Relations table with the stored procedure.
            CallableStatement cs = conn.prepareCall("{ call spEditRelation(?, ?, ?) }");
            
            // Fill the values.
            cs.setInt(1, input.getRelationEmployee());
            cs.setInt(2, input.getRelationWorkplace());
            cs.setInt(3, input.getRelationId());
            
            // Execute.
            cs.execute();

            // Close the statement and the connection.
            cs.close();
            conn.close();

            return true;
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
            // Open a connection to the database.
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url, username, password);

            // Find the items in the Workplaces table with the stored procedure.
            Model.Workplaces workplaces = new Model.Workplaces();
            CallableStatement cs = conn.prepareCall("{ call spFindWorkplaceById(?) }");
            
            // Fill the values.
            cs.setInt(1, input);
            
            // Execute.
            ResultSet rs = cs.executeQuery();
            
            // Store the items in a Workplace list.
            while (rs.next())
            {
                Model.Workplace workplace = new Model.Workplace();
                
                workplace.setWorkplaceId(rs.getInt("Id"));
                workplace.setWorkplaceName(rs.getString("Name"));
                workplace.setWorkplaceIsDeleted(rs.getBoolean("IsDeleted"));
                
                workplaces.getItems().add(workplace);
            }

            // Close the resultSet, the statement and the connection.
            rs.close();
            cs.close();
            conn.close();

            return workplaces;
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
            // Open a connection to the database.
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url, username, password);

            // Find the items in the Workplaces table with the stored procedure.
            Model.Workplaces workplaces = new Model.Workplaces();
            CallableStatement cs = conn.prepareCall("{ call spFindWorkplaceByName(?) }");
            
            // Fill the values.
            cs.setString(1, input);
            
            // Execute.
            ResultSet rs = cs.executeQuery();
            
            // Store the items in a Workplace list.
            while (rs.next())
            {
                Model.Workplace workplace = new Model.Workplace();
                
                workplace.setWorkplaceId(rs.getInt("Id"));
                workplace.setWorkplaceName(rs.getString("Name"));
                workplace.setWorkplaceIsDeleted(rs.getBoolean("IsDeleted"));
                
                workplaces.getItems().add(workplace);
            }

            // Close the resultSet, the statement and the connection.
            rs.close();
            cs.close();
            conn.close();

            return workplaces;
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
            // Open a connection to the database.
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url, username, password);

            // Find the items in the Employees table with the stored procedure.
            Model.Employees employees = new Model.Employees();
            CallableStatement cs = conn.prepareCall("{ call spFindEmployeeById(?) }");
            
            // Fill the values.
            cs.setInt(1, input);
            
            // Execute.
            ResultSet rs = cs.executeQuery();
            
            // Store the items in a Employee list.
            while (rs.next())
            {
                Model.Employee employee = new Model.Employee();
                
                employee.setEmployeeId(rs.getInt("Id"));
                employee.setEmployeeName(rs.getString("Name"));
                employee.setEmployeeEmail(rs.getString("Email"));
                employee.setEmployeeIsDeleted(rs.getBoolean("IsDeleted"));

                employees.getItems().add(employee);
            }

            // Close the resultSet, the statement and the connection.
            rs.close();
            cs.close();
            conn.close();

            return employees;
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
            // Open a connection to the database.
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url, username, password);

            // Find the items in the Employees table with the stored procedure.
            Model.Employees employees = new Model.Employees();
            CallableStatement cs = conn.prepareCall("{ call spFindEmployeeByName(?) }");
            
            // Fill the values.
            cs.setString(1, input);
            
            // Execute.
            ResultSet rs = cs.executeQuery();
            
            // Store the items in a Employee list.
            while (rs.next())
            {
                Model.Employee employee = new Model.Employee();
                
                employee.setEmployeeId(rs.getInt("Id"));
                employee.setEmployeeName(rs.getString("Name"));
                employee.setEmployeeEmail(rs.getString("Email"));
                employee.setEmployeeIsDeleted(rs.getBoolean("IsDeleted"));

                employees.getItems().add(employee);
            }

            // Close the resultSet, the statement and the connection.
            rs.close();
            cs.close();
            conn.close();

            return employees;
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
            // Open a connection to the database.
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url, username, password);

            // Find the items in the Employees table with the stored procedure.
            Model.Employees employees = new Model.Employees();
            CallableStatement cs = conn.prepareCall("{ call spFindEmployeeByEmail(?) }");
            
            // Fill the values.
            cs.setString(1, input);
            
            // Execute.
            ResultSet rs = cs.executeQuery();
            
            // Store the items in a Employee list.
            while (rs.next())
            {
                Model.Employee employee = new Model.Employee();
                
                employee.setEmployeeId(rs.getInt("Id"));
                employee.setEmployeeName(rs.getString("Name"));
                employee.setEmployeeEmail(rs.getString("Email"));
                employee.setEmployeeIsDeleted(rs.getBoolean("IsDeleted"));
                
                employees.getItems().add(employee);
            }

            // Close the resultSet, the statement and the connection.
            rs.close();
            cs.close();
            conn.close();

            return employees;
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
            // Open a connection to the database.
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url, username, password);

            // Find the items in the Employees table with the stored procedure.
            Model.Employees employees = new Model.Employees();
            CallableStatement cs = conn.prepareCall("{ call spFindEmployeeByNameAndEmail(?, ?) }");
            
            // Fill the values.
            cs.setString(1, name);
            cs.setString(2, email);
            
            // Execute.
            ResultSet rs = cs.executeQuery();
            
            // Store the items in a Workplace list.
            while (rs.next())
            {
                Model.Employee employee = new Model.Employee();
                
                employee.setEmployeeId(rs.getInt("Id"));
                employee.setEmployeeName(rs.getString("Name"));
                employee.setEmployeeEmail(rs.getString("Email"));
                employee.setEmployeeIsDeleted(rs.getBoolean("IsDeleted"));
                
                employees.getItems().add(employee);
            }

            // Close the resultSet, the statement and the connection.
            rs.close();
            cs.close();
            conn.close();

            return employees;
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
            // Open a connection to the database.
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url, username, password);

            // Find the items in the Relations table with the stored procedure.
            Model.Relations relations = new Model.Relations();
            CallableStatement cs = conn.prepareCall("{ call spFindRelationById(?) }");
            
            // Fill the values.
            cs.setInt(1, input);
            
            // Execute.
            ResultSet rs = cs.executeQuery();
            
            // Store the items in a Workplace list.
            while (rs.next())
            {
                Model.Relation relation = new Model.Relation();
                
                relation.setRelationId(rs.getInt("Id"));
                relation.setRelationEmployee(rs.getInt("Employee"));
                relation.setRelationWorkplace(rs.getInt("Workplace"));

                relations.getItems().add(relation);
            }

            // Close the resultSet, the statement and the connection.
            rs.close();
            cs.close();
            conn.close();

            return relations;
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
            // Open a connection to the database.
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url, username, password);

            // Find the items in the Employees table with the stored procedure.
            Model.Employees employees = new Model.Employees();
            CallableStatement cs = conn.prepareCall("{ call spFindEmployeeByName(?) }");
            
            // Fill the values.
            cs.setString(1, input);
            
            // Execute.
            ResultSet rs = cs.executeQuery();
            
            // Store the items in a Workplace list.
            while (rs.next())
            {
                Model.Employee employee = new Model.Employee();
                
                employee.setEmployeeId(rs.getInt("Id"));
                employee.setEmployeeName(rs.getString("Name"));
                employee.setEmployeeEmail(rs.getString("Email"));
                employee.setEmployeeIsDeleted(rs.getBoolean("IsDeleted"));
                
                employees.getItems().add(employee);
            }

            // There is at least one item that was found.
            int input2 = 0;
            if (employees.getItems().size() > 0)
            {
                // Because the previous search was on an Id, there should only be one item found.
                input2 = employees.getItems().get(0).getEmployeeId();
            }

            // Find the items in the Relations table with the stored procedure.
            Model.Relations relations = new Model.Relations();
            cs = conn.prepareCall("{ call spFindRelationByEmployee(?) }");
            
            // Fill the values.
            cs.setInt(1, input2);
            
            // Execute.
            rs = cs.executeQuery();
            
            // Store the items in a Workplace list.
            while (rs.next())
            {
                Model.Relation relation = new Model.Relation();
                
                relation.setRelationId(rs.getInt("Id"));
                relation.setRelationEmployee(rs.getInt("Employee"));
                relation.setRelationWorkplace(rs.getInt("Workplace"));

                relations.getItems().add(relation);
            }

            // Close the resultSet, the statement and the connection.
            rs.close();
            cs.close();
            conn.close();

            return relations;
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
            // Open a connection to the database.
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url, username, password);

            // Find the items in the Workplaces table with the stored procedure.
            Model.Workplaces workplaces = new Model.Workplaces();
            CallableStatement cs = conn.prepareCall("{ call spFindWorkplaceByName(?) }");
            
            // Fill the values.
            cs.setString(1, input);
            
            // Execute.
            ResultSet rs = cs.executeQuery();
            
            // Store the items in a Workplace list.
            while (rs.next())
            {
                Model.Workplace workplace = new Model.Workplace();
                
                workplace.setWorkplaceId(rs.getInt("Id"));
                workplace.setWorkplaceName(rs.getString("Name"));
                workplace.setWorkplaceIsDeleted(rs.getBoolean("IsDeleted"));
                
                workplaces.getItems().add(workplace);
            }

            // There is at least one item that was found.
            int input2 = 0;
            if (workplaces.getItems().size() > 0)
            {
                // Because the previous search was on an Id, there should only be one item found.
                input2 = workplaces.getItems().get(0).getWorkplaceId();
            }

            // Find the items in the Relations table with the stored procedure.
            Model.Relations relations = new Model.Relations();
            cs = conn.prepareCall("{ call spFindRelationByWorkplace(?) }");
            
            // Fill the values.
            cs.setInt(1, input2);
            
            // Execute.
            rs = cs.executeQuery();
            
            // Store the items in a Workplace list.
            while (rs.next())
            {
                Model.Relation relation = new Model.Relation();
                
                relation.setRelationId(rs.getInt("Id"));
                relation.setRelationEmployee(rs.getInt("Employee"));
                relation.setRelationWorkplace(rs.getInt("Workplace"));

                relations.getItems().add(relation);
            }

            // Close the resultSet, the statement and the connection.
            rs.close();
            cs.close();
            conn.close();

            return relations;
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
            // Open a connection to the database.
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url, username, password);

            // Find the items in the Employees table with the stored procedure.
            Model.Employees employees = new Model.Employees();
            CallableStatement cs = conn.prepareCall("{ call spFindEmployeeByName(?) }");
            
            // Fill the values.
            cs.setString(1, employee);
            
            // Execute.
            ResultSet rs = cs.executeQuery();
            
            // Store the items in a Workplace list.
            while (rs.next())
            {
                Model.Employee employee2 = new Model.Employee();
                
                employee2.setEmployeeId(rs.getInt("Id"));
                employee2.setEmployeeName(rs.getString("Name"));
                employee2.setEmployeeEmail(rs.getString("Email"));
                employee2.setEmployeeIsDeleted(rs.getBoolean("IsDeleted"));
                
                employees.getItems().add(employee2);
            }

            // Find the items in the Workplaces table with the stored procedure.
            Model.Workplaces workplaces = new Model.Workplaces();
            cs = conn.prepareCall("{ call spFindWorkplaceByName(?) }");
            
            // Fill the values.
            cs.setString(1, workplace);
            
            // Execute.
            rs = cs.executeQuery();
            
            // Store the items in a Workplace list.
            while (rs.next())
            {
                Model.Workplace workplace2 = new Model.Workplace();
                
                workplace2.setWorkplaceId(rs.getInt("Id"));
                workplace2.setWorkplaceName(rs.getString("Name"));
                workplace2.setWorkplaceIsDeleted(rs.getBoolean("IsDeleted"));
                
                workplaces.getItems().add(workplace2);
            }

            // There is at least one item that was found.
            int input2 = 0;
            int input3 = 0;
            if (employees.getItems().size() > 0)
            {
                // Because the previous search was on an Id, there should only be one item found.
                input2 = employees.getItems().get(0).getEmployeeId();
            }
            if (workplaces.getItems().size() > 0)
            {
                // Because the previous search was on an Id, there should only be one item found.
                input3 = workplaces.getItems().get(0).getWorkplaceId();
            }

            // Find the items in the Relations table with the stored procedure.
            Model.Relations relations = new Model.Relations();
            cs = conn.prepareCall("{ call spFindRelationByEmployeeAndWorkplace(?, ?) }");
            
            // Fill the values.
            cs.setInt(1, input2);
            cs.setInt(2, input3);
            
            // Execute.
            rs = cs.executeQuery();
            
            // Store the items in a Workplace list.
            while (rs.next())
            {
                Model.Relation relation = new Model.Relation();
                
                relation.setRelationId(rs.getInt("Id"));
                relation.setRelationEmployee(rs.getInt("Employee"));
                relation.setRelationWorkplace(rs.getInt("Workplace"));

                relations.getItems().add(relation);
            }

            // Close the resultSet, the statement and the connection.
            rs.close();
            cs.close();
            conn.close();

            return relations;
        }
        catch (Exception e)
        {
            return null;
        }
    }
    
    // </editor-fold>
    
    // </editor-fold>
}
