package org.test.ClienteTargetas;

import org.targetas.service.Targeta;
import org.targetas.service.TargetaService;
import org.targetas.service.TargetaServiceImplService;

/**
 * Hello world!
 *  wsimport -keep -verbose http://localhost:8085/TargetasOnline/TargetaService?wsdl
 */
public class App 
{
	
	
	private TargetaService targetaService;
	
	
    public static void main( String[] args )
    {
    	String nombre = args[0];
    	String numero = args[1];
    	
    	Targeta targeta = new Targeta();
    	targeta.setNombre(nombre);
    	targeta.setNumero(numero);
    	
    	App app = new App();
    	app.crearTargeta(targeta);
    }
    
    
    private  void crearTargeta(Targeta targeta) {
    	targetaService = new TargetaServiceImplService().getTargetaServiceImplPort();
        targetaService.creartargeta(targeta);
    }
}
