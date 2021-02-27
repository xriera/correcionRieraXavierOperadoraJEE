package ec.edu.ups.correcionrieraxavieroperadorajee.modelo;


public class ParametrosFactura {
	  private ClienteFactura cliente;
	  private RecargaFactura recarga;

	    public ClienteFactura getCliente() {
	        return cliente;
	    }

	    public void setCliente(ClienteFactura cliente) {
	        this.cliente = cliente;
	    }

	    public RecargaFactura getRecarga() {
	        return recarga;
	    }

	    public void setRecarga(RecargaFactura recarga) {
	        this.recarga = recarga;
	    }
}
