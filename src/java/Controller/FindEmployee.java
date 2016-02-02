/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controller;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Interaction logic for FindEmployee.
 */
public class FindEmployee extends HttpServlet
{
    // <editor-fold defaultstate="collapsed" desc="Fields">
    
    // Connection to the BusinessLogicLayer.
    Controller.BusinessLogicLayer businessLogicLayer = new Controller.BusinessLogicLayer();
    
    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Methods">
    
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
    {
        // The form made a request.
        if (request.getParameter("FindEmployeeFindButton") != null)
        {
            Model.Employees result = new Model.Employees();
            
            if ((request.getParameter("employeeName") != null && request.getParameter("employeeName") != "") && 
               (request.getParameter("employeeEmail") != null && request.getParameter("employeeEmail") != ""))
            {
                // The employeeName and employeeEmail query fields were not empty so list find the items.
                result = businessLogicLayer.FindEmployeeByNameAndEmail(request.getParameter("employeeName"), request.getParameter("employeeEmail"));
            }
            else if ((request.getParameter("employeeName") != null && request.getParameter("employeeName") != "") && 
                    (request.getParameter("employeeEmail") == null || request.getParameter("employeeEmail") == ""))
            {
                // The employeeEmail was empty, but the employeeName was not, so find the items based on the employeeName query field.
                result = businessLogicLayer.FindEmployeeByName(request.getParameter("employeeName"));
            }
            else if ((request.getParameter("employeeName") == null || request.getParameter("employeeName") == "") && 
                    (request.getParameter("employeeEmail") != null && request.getParameter("employeeEmail") != ""))
            {
                // The employeeName was empty, but the employeeEmail was not, so find the items based on the employeeEmail query field.
                result = businessLogicLayer.FindEmployeeByEmail(request.getParameter("employeeEmail"));
            }
            else
            {
                // The employeeName and employeeEmail query fields were empty so list all items.
                result = businessLogicLayer.ListEmployees();
            }
            
            // Store the result.
            request.setAttribute("Employees", result);
        }
        
        RequestDispatcher redirect = request.getRequestDispatcher("/WEB-INF/FindEmployee.jsp");
        redirect.forward(request, response);
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
    {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
    {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo()
    {
        return "Short description";
    }

    // </editor-fold>

    // </editor-fold>
}
