package com.jcombat.profile;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

@Repository
public class StubProfileRepository implements ProfileRepository {
	
	private Map<String, Profile> profileData = new HashMap<String, Profile>();
	
	public StubProfileRepository() {
		Profile profile = new Profile("1", "A");
		profileData.put("1", profile);
		profile = new Profile("2", "B");
		profileData.put("2", profile);
		profile = new Profile("3", "C");
		profileData.put("3", profile);
	}
	
	@Override
	public List<Profile> getAllProfiles() {
		return new ArrayList<Profile>(profileData.values());
	}

	@Override
	public Profile getProfile(String userId) {
		return profileData.get(userId);
	}

}