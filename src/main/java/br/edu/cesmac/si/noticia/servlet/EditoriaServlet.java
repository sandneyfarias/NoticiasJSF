package br.edu.cesmac.si.noticia.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.edu.cesmac.si.noticia.domain.Editoria;
import br.edu.cesmac.si.noticia.repository.EditoriaJpa;

@WebServlet(urlPatterns = "/editorias/listar")
public class EditoriaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		EditoriaJpa editoriaJpa = new EditoriaJpa();

		List<Editoria> editorias = editoriaJpa.listar();
		req.setAttribute("editorias", editorias);
		
		RequestDispatcher rd = req.getRequestDispatcher("/editoria/editorias.jsp");
		rd.forward(req, res);
	}
}