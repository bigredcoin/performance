package performance.web.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import performance.Group;
import performance.data.GroupRepository;

@RestController
@RequestMapping(path="/group", produces="application/json")
@CrossOrigin(origins="*")
public class GroupController {
	
	@Autowired
	private GroupRepository grouprepository;
	
	@GetMapping(path = "findAllGroups")
	public Object findAllGroups() {
		return grouprepository.findAll();		
	}
	
	@PostMapping(path = "addGroup")
	public void addGroup(Group group) {
		grouprepository.save(group);
	}
	
}
