package br.com.ada.polotech.americanas.adapolotechamericanascadastrodecliente;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "HistoricoServelet", value = "/historico")
public class HistoricoServelet extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession(true);
        var usuarios = (List<Usuario>) session.getAttribute("historico_usuario");
        if(usuarios == null){
            usuarios = new ArrayList<>();
        }
        request.setAttribute("historico_usuario", usuarios);
        request.getRequestDispatcher("/historico.jsp").forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
