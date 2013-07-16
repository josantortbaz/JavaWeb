/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controlador.action;

import com.controlador.form.PrimerActionForm;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

/**
 *
 * @author josea
 */
public class SegundoAction extends org.apache.struts.action.Action {

    /* forward name="success" path="" */
    private static final String BIEN = "bien";
    private static final String MAL = "mal";

    /**
     * This is the action called from the Struts framework.
     *
     * @param mapping The ActionMapping used to select this instance.
     * @param form The optional ActionForm bean for this request.
     * @param request The HTTP Request we are processing.
     * @param response The HTTP Response we are processing.
     * @throws java.lang.Exception
     * @return
     */
    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        
        PrimerActionForm pf = (PrimerActionForm) form;
        String x = MAL;
        String m = pf.getMensaje() == null ? "" : pf.getMensaje();
        if (! m.equals("mensaje")) {
            x=BIEN;
        }
        return mapping.findForward(x);
    }
}
