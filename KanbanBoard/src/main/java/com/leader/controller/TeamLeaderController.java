package com.leader.controller;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.leader.entity.TeamLeader;
import com.leader.service.TeamLeaderService;




@RestController
@RequestMapping("/teamLeader")
public class TeamLeaderController {


		@Autowired
		TeamLeaderService teamLeaderService;


		@GetMapping("/")
		public String defaultMessage() {
			return "Welcome to Team Leader Page";
		}


		
		@PostMapping("/registerTeamLeader")
		public TeamLeader addTeamLeader(@RequestBody TeamLeader teamLeader) {
			try {
				return teamLeaderService.addTeamLeader(teamLeader);
			} catch (Exception e) {
				e.printStackTrace();
			}
			return teamLeader;
			
		}
		/*
		@GetMapping("/allTeamLeader")
		public List<TeamLeader> getAllTeamLeader(){
			return teamLeaderService.getAllTeamLeader();
		}

		@PutMapping("/updateTeamLeader")
		public TeamLeader updateTeamLeader(@RequestBody TeamLeader teamLeader) throws NullUserFound {
			return teamLeaderService.updateTeamLeader(teamLeader);
		}

		@DeleteMapping("/deleteTeamLeader")
		public String deleteTeamLeader(@RequestBody TeamLeader teamLeader) throws NullUserFound {
			return teamLeaderService.deleteTeamLeader(teamLeader);
		}

		@GetMapping("/loginTeamLeader/{email}/{password}")
		public TeamLeader loginTeamLeader(@PathVariable String email, @PathVariable String password) throws NullUserFound
		{
			return teamLeaderService.loginTeamLeader(email, password);
		}*/
}
