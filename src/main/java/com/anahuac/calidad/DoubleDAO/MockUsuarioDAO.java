package com.anahuac.calidad.DoubleDAO;

public class MockUsuarioDAO implements UsuarioDAO {

	@Override
	public int agregarUsuario(Usuario a) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean BorrarUsuario(int a) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean actualizarEmail(Usuario a) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Usuario buscarPorNombre(String nombre) {
		// TODO Auto-generated method stub
		return null;
	}

}
