package skill;

import dsa.iface.IIterator;
import dsa.impl.BSTMap;

public class SkillBase {

	private BSTMap<Integer, Skill> skills;

	public SkillBase(){
		 skills = new BSTMap<Integer, Skill>();
	}
	
	public int getNumSkill() {
		return skills.size();
	}
	
	public void addSkill(Skill skill) {
		skills.put(skill.getCode(), skill);
	}

	public Skill findSkill(int code) {
		return skills.get(code);
	}

	public Skill removeSkill(int code) {
		return skills.remove(code);
	}

	public String toString() {
		IIterator<Skill> iterator = skills.values();
		String toReturn = "";
		while(iterator.hasNext()) {
			toReturn += iterator.next().toString();
		}
		return toReturn;
	}

}
