package edu.citytech.cst.webresource;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import edu.citytech.cst.model.PayCheck;

@RestController
@RequestMapping("/paycheck")
public class PayCheckResource {
	
	@RequestMapping("/weeklypay")
	public Map<String, Object> getPayCheckStatus(@RequestParam(value="hoursworked")int hoursworked
								,@RequestParam(value = "hourlywage") int hourlywage){
		
		int weeklypay = PayCheck.getWeeklyPay(hoursworked, hourlywage);
		
		Map<String, Object>map = new HashMap<>();
		
		map.put("hoursworked", hoursworked);
		map.put("hourlywage", hourlywage);
		map.put("weeklypay", weeklypay);
		
		return map;
	}

}
