package br.com.ada.polotech.americanas.adapolotechamericanascadastrodecliente;

import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import jakarta.servlet.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "CadatroCliente", value = "/cadastrar")
public class cadastrocliente extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String nome = request.getParameter("nome");
        String cpf = request.getParameter("cpf");

        PrintWriter out = response.getWriter();
        out.println("<html><body>O cliente: " + nome + ", CPF: " + cpf + " foi cadastrado com sucesso </body></html>");

    }
}