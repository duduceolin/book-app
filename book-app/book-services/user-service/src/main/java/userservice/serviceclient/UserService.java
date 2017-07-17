package userservice.serviceclient;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.hateoas.PagedResources;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author: dudu
 * @date: 17 de jul de 2017 05:36:35
 **/

@FeignClient
public interface UserService {

	@RequestMapping(method = RequestMethod.GET, path = "/listUsers")
    PagedResources<UserDTO> findAll(@RequestParam("page") int page);
}
