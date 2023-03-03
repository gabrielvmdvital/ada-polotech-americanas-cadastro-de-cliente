package br.com.ada.polotech.americanas.adapolotechamericanascadastrodecliente;

import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import jakarta.servlet.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "CadatroCliente", value = "/cadastrar")
public class CadastroCliente extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String nome = request.getParameter("nome");
        String cpf = request.getParameter("cpf");
        var usuarios = recuperaUsuarios(request);
        Usuario usuario = new Usuario(nome, cpf);

        usuarios.add(usuario);

        request.setAttribute("usuario", usuario);
        request.getRequestDispatcher("/cadastrado.jsp").forward(request, response);
        //PrintWriter out = response.getWriter();
        // out.println("<html><body>O cliente: " + nome + ", CPF: " + cpf + " foi cadastrado com sucesso </body></html>");

    }

    private List<Usuario> recuperaUsuarios(HttpServletRequest request){

        HttpSession session = request.getSession(true);
        List<Usuario> usuarios = (List<Usuario>) session.getAttribute("historico_usuarios");
        if(usuarios == null){
            usuarios = new ArrayList<>();
            session.setAttribute("historico_usuarios", usuarios);
        }
        return usuarios;
    }
}