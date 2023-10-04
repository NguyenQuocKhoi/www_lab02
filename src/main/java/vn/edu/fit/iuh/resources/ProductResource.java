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
import vn.edu.fit.iuh.models.Product;
import vn.edu.fit.iuh.services.ProductService;
@Path("/products")
public class ProductResource {

  private ProductService productService;

  public ProductResource() {
    productService = new ProductService();
  }

  @GET
  @Path(("/{id}"))
  @Produces(value = "application/json")
  public Response getEmp(@PathParam("id") long id) {
    Optional<Product> product = productService.findById(id);
    if (product.isPresent()) {
      return Response.ok(product).build();
    }
    return Response.status(Status.BAD_REQUEST).build();
  }

  @GET
  @Produces("application/json")
  public Response getAll() {
    List<Product> list = productService.getAll();
    return Response.ok(list).build();
  }

  @POST
  @Produces("application/json")
  @Consumes("application/json")
  public Response insert(Product product) {
    productService.insert(product);
    return Response.ok(product).build();
  }

  @DELETE
  @Path("/{id}")
  public Response delete(@PathParam("id") long id) {
    if (productService.delete(id)) {
      return Response.ok().build();
    }
    return Response.status(Status.NOT_FOUND).build();
  }

}
