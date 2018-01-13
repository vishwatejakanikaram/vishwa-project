package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.app.model.AxEmployee;
import com.app.service.IAxEmployeeService;

@Controller
public class AxEmployeeController {
	
	@Autowired
	private IAxEmployeeService service;
	
	
	/**
	 * 1. Show/Display AxEmployee Register
	 * page on entering URL in addressBar
	 * or hyper link click
	 */
	
	@RequestMapping("/axEmpReg")
	public String showRegPage(){
		return "AxEmployeeReg";
	}
	
	
	/**
	 * 2. On click Submit--save AxEmployee to DB
	 */
	@RequestMapping(value="/insertAxEmp", method=RequestMethod.POST)
	public String  saveAxEmployee(@ModelAttribute("axEmployee") AxEmployee axEmp,ModelMap map){
		int axEmpId=service.saveAxEmployee(axEmp);
		map.addAttribute("msg","saved with id:"+axEmpId);
		return "AxEmployeeReg";
	}
	
	/**
	 * 3. On click Hyper Link 'ViewAll' 
	 * Execute loadAll from DB , call this
	 * method using service in controller.
	 * It returns List. send this to UI
	 * Using ModelMap 
	 */
	
	@RequestMapping(value="/showAxEmp")
	public String showAllRec(ModelMap map){
		List<AxEmployee> axemplist = service.getAllAxEmployee();
		map.addAttribute("listobjAxEmp", axemplist);
		return "AxEmployeeData";
		
	}

	
	/**
	 * 4. On Click Delete Hyper Link,
	 * Read Req.Param(axEmpId) using
	 * @RequestParam annotation.
	 * Call serviceMethod and pass axEmpId.
	 * 
	 * At last Redirect to showAxEmp.
	 */
	
	@RequestMapping(value="/deleteAxEmp")
	public String deleteAxEmployee(@RequestParam("axEmpId") int aEid){
		service.deleteAxEmployeeById(aEid);
		return "redirect:showAxEmp";
	}
	
	/**
	 * 5. MultiDelete AxEmployee
	 */
	
	@RequestMapping(value="/axEmpMultDelete",method=RequestMethod.POST)
	public String  multiDeleteAxEmp(@RequestParam("multi")List<Integer> vals){
		//System.out.println(vals);
		for(Integer axEmpId:vals){
			service.deleteAxEmployeeById(axEmpId);
		}
		return "redirect:showAxEmp";
	}
	
	
	
	
}
