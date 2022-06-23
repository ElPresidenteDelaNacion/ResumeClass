package com.anahuac.calidad.DoubleDAO;

public interface UsuarioDAO {

	public int agregarUsuario(Usuario a);
	public boolean borrarUsuario(int id);
	public boolean actualizarEmail(Usuario a);
	public Usuario buscarPorNombre(String nombre);
	
}
