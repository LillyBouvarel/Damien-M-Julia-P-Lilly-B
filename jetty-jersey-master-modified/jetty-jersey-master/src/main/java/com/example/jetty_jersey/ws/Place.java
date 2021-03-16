package com.example.jetty_jersey.ws;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


@Path("/Place")
public class Place {

        public Coordonnees location;
        public String adress;
        public String event;
        public String pictures;

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/aircraft")
	public Place getPlace() {
            Place instance = new Place();
            int lat = 0;
            int lon = 0;
            Coordonnees c = new Coordonnees();
            c.lattitude = lat;
            c.longitude = lon;
            instance.location = c;
            instance.adress = "Test2";
            instance.event = "Test3";
            instance.pictures = "Test4";

		return instance;
	}

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/aircraft")
	public void retrievePlace(Place instance) {
		System.out.println(instance.adress);
	}
    
}

