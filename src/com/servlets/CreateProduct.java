package com.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.entity.Product;
import com.service.ProductService;

/**
 * Servlet implementation class CreateProduct
 */
@WebServlet("/CreateProduct")
public class CreateProduct extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CreateProduct() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Product create = new Product();
		
		create.setProductName(request.getParameter("productName"));
		create.setProductPrice(Double.parseDouble(request.getParameter("productPrice")));
		
		ProductService ps = new ProductService();
		boolean productCreated = ps.createProduct(create);
		
		if (productCreated = true) 
		{
			response.sendRedirect("addProductSuccess.jsp");
			System.out.println("Product created");
		}else {
			response.sendRedirect("addProductError.jsp");
			System.out.println("Product not created");
		}
	}

}
