
package org.arpit.java2blog.controller;
 
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.arpit.java2blog.bean.Country;
import org.arpit.java2blog.service.BoneService;
import org.arpit.java2blog.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
 
@RestController
public class BoneController {
 
 @Autowired
 private HttpServletRequest request;
 BoneService bone_service = new BoneService();
 
 @RequestMapping(value = "/rest/bone", method = RequestMethod.GET, headers = "Accept=application/json")
 public List getAllBone() {
  
  List listOfBone = bone_service.getAllBone();
  return listOfBone;
 }
}