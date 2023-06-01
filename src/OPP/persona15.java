package OPP;
/////pagina 15 tema 6
public class persona15 {
		public int getContraseña() {
		return contraseña;
	}
	public void setContraseña(int contraseña) {
		this.contraseña = contraseña;
	}
		public String nombre;
		public persona15(String nombre, int contraseña, String dirección) {
			super(); /// El padre de clase Objetc
			this.nombre = nombre;     /// This representa al hijo 
			this.contraseña = contraseña;
			this.dirección = dirección; /// si quitamos el this, generará una ambiguedad ya que las 
			                               /// dos direcciones seran iguales
			/// azul representa propiedades y el del igual representa asignacion
		}
		public String getNombre() {
			return nombre;
		}
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		public String getDirección() {
			return dirección;
		}
		public void setDirección(String dirección) {
			this.dirección = dirección;
		}
		private int contraseña;
		protected String dirección;

}
