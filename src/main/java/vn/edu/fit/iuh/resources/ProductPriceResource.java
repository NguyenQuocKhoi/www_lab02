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
import vn.edu.fit.iuh.enums.ProductStatus;
import vn.edu.fit.iuh.models.Product;
import vn.edu.fit.iuh.models.ProductPrice;
import vn.edu.fit.iuh.services.ProductPriceService;


@Path("/productprices")
public class ProductPriceResource {

  private ProductPriceService productPriceService;

  public ProductPriceResource(){
    productPriceService = new ProductPriceService();
  }

  @POST
  @Produces("application/json")
  @Consumes("application/json")
  public Response insert(ProductPrice productPrice) {
    productPriceService.insert(productPrice);
    return Response.ok(productPrice).build();
  }

  @GET
  @Produces("application/json")
  public Response getAll() {
    List<ProductPrice> list = productPriceService.getAll();
    return Response.ok(list).build();
  }

  @GET
  @Path(("/{id}"))
  @Produces(value = "application/json")
  public Response getEmp(@PathParam("id") long id) {
    Optional<ProductPrice> pp = productPriceService.findById(id);
    if (pp.isPresent()) {
      return Response.ok(pp).build();
    }
    return Response.status(Status.BAD_REQUEST).build();
  }
}
