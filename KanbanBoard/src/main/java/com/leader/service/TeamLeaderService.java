package com.leader.service;

import java.util.List;




import org.springframework.stereotype.Service;

import com.leader.entity.TeamLeader;
import com.leader.exception.NullEmailFoundException;
import com.leader.exception.NullUserFound;


@Service
public interface TeamLeaderService {

	public TeamLeader registerTeamLeader(TeamLeader teamLeader) throws NullUserFound, NullEmailFoundException;

	public List<TeamLeader> getAllTeamLeader();
	
	public TeamLeader addTeamLeader(TeamLeader teamLeader) throws Exception;

	public TeamLeader getTeamLeaderById(Integer id) throws NullUserFound;

	public TeamLeader updateTeamLeader(TeamLeader teamLeader) throws NullUserFound;

	public String deleteTeamLeader(TeamLeader teamLeader) throws NullUserFound;
	
	public TeamLeader loginTeamLeader(String email, String password) throws NullUserFound;
}
