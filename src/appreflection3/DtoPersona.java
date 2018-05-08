package appreflection3;

import java.sql.Date;

public class DtoPersona
{
	private String nombre;
	private Integer cantidadHijos;
	private Boolean sexo;
	private Date fechaNacimiento;
	
	private String deporteFavorito;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getCantidadHijos() {
		return cantidadHijos;
	}

	public void setCantidadHijos(Integer cantidadHijos) {
		this.cantidadHijos = cantidadHijos;
	}

	public Boolean getSexo() {
		return sexo;
	}

	public void setSexo(Boolean sexo) {
		this.sexo = sexo;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getDeporteFavorito() {
		return deporteFavorito;
	}

	public void setDeporteFavorito(String deporteFavorito) {
		this.deporteFavorito = deporteFavorito;
	}
}