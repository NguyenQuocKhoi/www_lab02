package vn.edu.fit.iuh.resources;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.core.Response.Status;
import java.util.List;
import java.util.Optional;
import vn.edu.fit.iuh.models.Employee;
import vn.edu.fit.iuh.services.EmployeeService;


@Path("/employees")
public class EmployeeResource {

  private EmployeeService employeeService;

  public EmployeeResource() {
    employeeService = new EmployeeService();
  }

  @GET
  @Path(("/{id}"))
  @Produces(value = "application/json")
  public Response getEmp(@PathParam("id") long eid) {
    Optional<Employee> employee = employeeService.findById(eid);
    if (employee.isPresent()) {
      return Response.ok(employee).build();
    }
    return Response.status(Status.BAD_REQUEST).build();
  }

  @GET
  @Produces("application/json")
  public Response getAll() {
    List<Employee> list = employeeService.getAll();
    return Response.ok(list).build();
  }

  @POST
  @Produces("application/json")
  @Consumes("application/json")
  public Response insert(Employee employee) {
    employeeService.insertEmp(employee);
    return Response.ok(employee).build();
  }

  @DELETE
  @Path("/{id}")
  public Response delete(@PathParam("id") long id) {
    if (employeeService.delete(id)) {
      return Response.ok().build();
    }
    return Response.status(Status.NOT_FOUND).build();
  }
}
