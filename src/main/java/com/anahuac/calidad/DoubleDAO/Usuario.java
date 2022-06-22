package com.anahuac.calidad.DoubleDAO;

public class Usuario {

	private int id;
	private String username;
	private String password;
	private String tipo;
	private String email;
	
	
	public Usuario(String username, String p, String t, String e) {
	
		this.username = username;
		this.password = p;
		this.tipo = t;
		this.email = e;
	}
	
	public int getId() {
		return id;
	}
	public String getUsername() {
		return username;
	}
	public String getPassword() {
		return password;
	}
	public String getTipo() {
		return tipo;
	}
	public String getEmail() {
		return email;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
}
