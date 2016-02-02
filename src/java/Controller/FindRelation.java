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
 * Interaction logic for FindRelation.
 */
public class FindRelation extends HttpServlet
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
        if (request.getParameter("FindRelationFindButton") != null)
        {
            Model.Relations result = new Model.Relations();
            
            if ((request.getParameter("relationEmployee") != null && request.getParameter("relationEmployee") != "") && 
               (request.getParameter("relationWorkplace") != null && request.getParameter("relationWorkplace") != ""))
            {
                // The relationEmployee and relationWorkplace query fields were not empty so find the items. 
                result = businessLogicLayer.FindRelationByEmployeeAndWorkplace(request.getParameter("relationEmployee"), request.getParameter("relationWorkplace"));
            }
            else if ((request.getParameter("relationEmployee") != null && request.getParameter("relationEmployee") != "") && 
                    (request.getParameter("relationWorkplace") == null || request.getParameter("relationWorkplace") == ""))
            {
                // The relationWorkplace was empty, but the relationEmployee was not, so find the items based on the relationEmployee query field.
                result = businessLogicLayer.FindRelationByEmployee(request.getParameter("relationEmployee"));
            }
            else if ((request.getParameter("relationEmployee") == null || request.getParameter("relationEmployee") == "") && 
                    (request.getParameter("relationWorkplace") != null && request.getParameter("relationWorkplace") != ""))
            {
                // The relationEmployee was empty, but the relationWorkplace was not, so find the items based on the relationWorkplace query field.
                result = businessLogicLayer.FindRelationByWorkplace(request.getParameter("relationWorkplace"));
            }
            else
            {
                // The relationEmployee and relationWorkplace query fields were empty so list all items. 
                result = businessLogicLayer.ListRelations();
            }
            
            // Store the result.
            request.setAttribute("Relations", result);
        }
        
        RequestDispatcher redirect = request.getRequestDispatcher("/WEB-INF/FindRelation.jsp");
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
