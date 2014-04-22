/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Search.Model;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 建厚
 */
public interface IModel {
    public void doHTTPServletLogic (HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException;
}
