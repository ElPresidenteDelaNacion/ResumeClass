package com.anahuac.calidad.tareasErik;

import java.util.Objects;

import com.anahuac.calidad.DBUnit.UsuarioDAOMySQL;
import com.anahuac.calidad.DoubleDAO.Usuario;
/**
 * Hello world!
 *
 */
public class App 
{
	
	
	
    public static void main( String[] args )
    {
    	
    	
    	Usuario usuario = new Usuario("nombre", "password","admin","correo@correo.com");
    	UsuarioDAOMySQL usuarioDAO = new UsuarioDAOMySQL();
    	//agregar
    	int id = usuarioDAO.agregarUsuario(usuario);
       usuario.setId(id);
        
       //modificar correo
       usuario.setEmail("nuevoEmail"); 
       boolean result = usuarioDAO.actualizarEmail(usuario);
       
       if(result)
    	   System.out.println("Correo actualizado");
       
       //buscar por nombre
       String n = "nombre";
       Usuario encontrado = usuarioDAO.buscarPorNombre(n);
       
       System.out.println("Usuario encontrado: " + encontrado.getId());
       
    }
}