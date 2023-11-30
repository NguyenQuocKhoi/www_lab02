//package vn.edu.fit.iuh.modelfrontend;
//
//import jakarta.servlet.http.HttpServletRequest;
//import jakarta.servlet.http.HttpServletResponse;
//import java.time.LocalDate;
//import java.time.LocalDateTime;
//import java.time.format.DateTimeFormatter;
//import vn.edu.fit.iuh.models.ProductPrice;
//import vn.edu.fit.iuh.services.ProductPriceService;
//
//public class ProductPriceModel {
//private final ProductPriceService service = new ProductPriceService();
//  public void insert(HttpServletRequest request, HttpServletResponse response) {
//    String s_dob = request.getParameter("pdt");
//    String note = request.getParameter("note");
//    Double price = Double.parseDouble(request.getParameter("price"));
//
////    DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy-MM-dd");
////    LocalDateTime dob = LocalDate.parse(s_dob, df);
//
////    ProductPrice pp = new ProductPrice(s_dob, note, price);
////    service.insert();
//
//
//  }
//}
