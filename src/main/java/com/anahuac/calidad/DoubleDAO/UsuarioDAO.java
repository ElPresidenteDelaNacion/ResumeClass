package com.anahuac.calidad.DoubleDAO;

public interface UsuarioDAO {

	public int agregarUsuario(Usuario a);
	public boolean BorrarUsuario(int id);
	public boolean actualizarEmail(Usuario a);
	public Usuario buscarPorNombre(String nombre);
	
}
