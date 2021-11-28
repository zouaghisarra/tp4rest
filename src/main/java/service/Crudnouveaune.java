package service;



import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import model.NouveauNe;
import repository.NoveauNeRep;

@Path("/services")
public class Crudnouveaune {
	NoveauNeRep rep= new NoveauNeRep();
	@GET
	@Path("/nouveaune")
	@Produces({MediaType.APPLICATION_JSON})
	public NouveauNe chercher(@QueryParam("id") String id) {
		return rep.find(id);
	}

}
