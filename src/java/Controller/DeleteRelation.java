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
 * Interaction logic for DeleteRelation.
 */
public class DeleteRelation extends HttpServlet
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
        request.setAttribute("Relation", businessLogicLayer.FindRelationById(Integer.parseInt(request.getParameter("id"))).getItems().get(0));
        
        // The form made a request.
        if (request.getParameter("DeleteRelationDeleteButton") != null)
        {
            Model.Relation relation = new Model.Relation();
            relation.setRelationId(Integer.parseInt(request.getParameter("relationId")));
            relation.setRelationEmployee(Integer.parseInt(request.getParameter("relationEmployee")));
            relation.setRelationWorkplace(Integer.parseInt(request.getParameter("relationWorkplace")));
            
            // The delete was successful
            if (businessLogicLayer.DeleteRelation(relation))
            {
                response.sendRedirect("Index");
            }
            else
            {
                RequestDispatcher redirect = request.getRequestDispatcher("/WEB-INF/DeleteRelation.jsp");
                redirect.forward(request, response);
            }
        }
        else
        {
            RequestDispatcher redirect = request.getRequestDispatcher("/WEB-INF/DeleteRelation.jsp");
            redirect.forward(request, response);
        }
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
