package proyecto.yollicalli.model;

public class Direccion {
	
	private String calle;
	private String municipio_alcaldia;
	private String estado;
	private String ciudad;
	private String cp;
	private int id;
	private static int total=0;
	
	public Direccion(String calle, String municipio_alcaldia, String estado, String ciudad, String cp) {
		super();
		this.calle = calle;
		this.municipio_alcaldia = municipio_alcaldia;
		this.estado = estado;
		this.ciudad = ciudad;
		this.cp = cp;
		Direccion.total++;
		id=Direccion.total;
	}//Constructor
	
	public Direccion() {
		Direccion.total++;
		id=Direccion.total;
	}//constructor vacío
	
	public int getId() {
		return id;
	}//getId

	public String getCalle() {
		return calle;
	}//getCalle

	public void setCalle(String calle) {
		this.calle = calle;
	}//setCalle

	public String getMunicipio_alcaldia() {
		return municipio_alcaldia;
	}//getMunicipio_Alcaldia

	public void setMunicipio_alcaldia(String municipio_alcaldia) {
		this.municipio_alcaldia = municipio_alcaldia;
	}//setMunicipio_Alcaldia

	public String getEstado() {
		return estado;
	}//getEstado

	public void setEstado(String estado) {
		this.estado = estado;
	}//setEstado

	public String getCiudad() {
		return ciudad;
	}//getCiudad

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}//setCiudad

	public String getCp() {
		return cp;
	}//getCp

	public void setCp(String cp) {
		this.cp = cp;
	}//setCp

	@Override
	public String toString() {
		return "Direccion [calle=" + calle + ", municipio_alcaldia=" + municipio_alcaldia + ", estado=" + estado
				+ ", ciudad=" + ciudad + ", cp=" + cp + ", id=" + id + "]";
	}

}//class Direccion
