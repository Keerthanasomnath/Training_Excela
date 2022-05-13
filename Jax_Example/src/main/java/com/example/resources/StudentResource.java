package com.example.resources;
import java.util.List;
import java.util.Optional;

import com.example.model.Student;
import com.example.services.StudentServices;

import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/student")
public class StudentResource {

	private static StudentServices service = new StudentServices();
	
	
    public StudentResource() {
		// TODO Auto-generated constructor stub
    	super();
    	//this.service=new StudentServices();
	}
    
//    @GET
//	@Produces(MediaType.APPLICATION_JSON)
//	public Student getMessage() {
//		Student ram=new Student(101,"Ramesh",98);
//		return ram;
//	}
	
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	public List<Student> getAllStudent() {
		
		return this.service.getAll();
	}
	
	@GET
	@Path("/{rollNumber}")
	@Produces(MediaType.APPLICATION_JSON)
	public Student findById(@PathParam("rollNumber") int id) {
		return this.service.findById(id).orElseThrow(()-> new RuntimeException("Id NotFound"));
	}
	
	@DELETE
	@Path("/{rollNumber}")
	@Produces(MediaType.APPLICATION_JSON)
	public boolean remove(@PathParam("rollNumber")int id) {
		return this.service.remove(id);
	}
	
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	public Student add(Student student) {
		boolean result =this.service.add(student);
		
		if(result) {
		return student;
		}
		else {
			return null;
		}
		
	}
	
}

	