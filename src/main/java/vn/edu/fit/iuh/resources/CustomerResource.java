package vn.edu.fit.iuh.resources;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.core.Response.Status;
import java.util.List;
import java.util.Optional;
import vn.edu.fit.iuh.models.Customer;
import vn.edu.fit.iuh.services.CustomerService;

@Path("/customers")
public class CustomerResource {

  private CustomerService customerService;

  public CustomerResource() {
    customerService = new CustomerService();
  }

  @GET
  @Path(("/id"))
  @Produces(value = "application/json")
  public Response getCust(@PathParam("id") long cid) {
    Optional<Customer> customer = customerService.findById(cid);
    if (customer.isPresent()) {
      return Response.ok(customer).build();
    }
    return Response.status(Status.BAD_REQUEST).build();
  }

  @POST
  @Produces("application/json")
  @Consumes("application/json")
  public Response insert(Customer customer) {
    customerService.insertCust(customer);
    return Response.ok(customer).build();
  }

  @GET
  @Produces("application/json")
  public Response getAll() {
    List<Customer> list = customerService.getAll();
    return Response.ok(list).build();
  }
}
