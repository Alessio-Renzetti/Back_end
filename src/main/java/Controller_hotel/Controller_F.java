package Controller_hotel;

import java.security.Provider.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import Service_hotel.Service_F;

@Controller
@RequestMapping(value="flavio")

public class Controller_F {
	@Autowired private Service_F service_F;
}
