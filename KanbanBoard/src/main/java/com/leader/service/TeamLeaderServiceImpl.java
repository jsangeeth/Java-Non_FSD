package com.leader.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.leader.entity.TeamLeader;
import com.leader.exception.NullEmailFoundException;
import com.leader.exception.NullUserFound;
import com.leader.repository.TeamLeaderRepository;

@Service
public class TeamLeaderServiceImpl implements TeamLeaderService {

	@Autowired
	TeamLeaderRepository teamLeaderRepository;

	@Override
	public TeamLeader registerTeamLeader(TeamLeader teamLeader) throws NullUserFound, NullEmailFoundException {

		if (teamLeader.getEmail() == null || teamLeader.getEmail() == "") {
			throw new NullEmailFoundException("Email id cannot be null");
		}

		else if (teamLeader.getFirstName().isEmpty() || teamLeader.getLastName().isEmpty()
				|| teamLeader.getEmail().isEmpty() || teamLeader.getPassword().isEmpty()) {
			throw new NullUserFound("Error: Null value is not accepted.");
		} else if (teamLeader.getFirstName().equals("string") || teamLeader.getLastName().equals("string")
				|| teamLeader.getPassword().equals("string") || teamLeader.getEmail().equals("string")) {
			throw new NullUserFound("Error: Null value is not accepted.");
		}
		return teamLeaderRepository.save(teamLeader);
	}

	@Override
	public List<TeamLeader> getAllTeamLeader() {
		return teamLeaderRepository.findAll();
	}

	@Override
	public TeamLeader getTeamLeaderById(Integer id) throws NullUserFound {
		if (id == 0) {
			throw new NullUserFound("Null value is not excepted");
		}

		return teamLeaderRepository.getTeamLeaderById(id);
	}

	@Override
	public TeamLeader updateTeamLeader(TeamLeader teamLeader) throws NullUserFound {
		TeamLeader tl = getTeamLeaderById(teamLeader.getid());

		if (tl == null) {
			throw new NullUserFound("No TeamLeader Exixts with same this id: " + teamLeader.getid());
		}

		return teamLeaderRepository.save(teamLeader);
	}

	@Override
	public String deleteTeamLeader(TeamLeader teamLeader) throws NullUserFound {
		TeamLeader tl = getTeamLeaderById(teamLeader.getid());
		System.out.println("teamLeader: " + teamLeader + "tl:" + tl);
		if (tl == null) {
			throw new NullUserFound("No TeamLeader Exixts with same this id: " + teamLeader.getid());
		}
		teamLeaderRepository.delete(tl);
		return "Parent Deleted Successfully";
	}

	@Override
	public TeamLeader loginTeamLeader(String email, String password) throws NullUserFound {
		if (email.equals("") || email.equals("string") || password.equals("") || password.equals("string")) {
			throw new NullUserFound("Email or Password Cannot be empty");
		}

		TeamLeader tl = teamLeaderRepository.findTeamLeaderByEmailPassword(email, password);

		if (tl == null) {
			throw new NullUserFound("Cant Login tutor Email and Password dont match");
		}

		return tl;
	}

	@Override
	public TeamLeader addTeamLeader(TeamLeader teamLeader) throws Exception {

		
		return teamLeaderRepository.save(teamLeader);
	}

}
