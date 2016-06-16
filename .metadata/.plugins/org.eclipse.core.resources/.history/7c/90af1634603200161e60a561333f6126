package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the "Coach" database table.
 * 
 */
@Entity
@Table(name="\"Coach\"")
@NamedQuery(name="Coach.findAll", query="SELECT c FROM Coach c")
public class Coach implements Serializable, DataBaseModel {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;

	@Temporal(TemporalType.DATE)
	private Date age;

	private String name;

	private String nationality;

	@Column(name="tactics_1")
	private String tactics1;

	@Column(name="tactics_2")
	private String tactics2;

	//bi-directional many-to-one association to Team
	@OneToMany(mappedBy="coach")
	private List<Team> teams;

	public Coach() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getAge() {
		return this.age;
	}

	public void setAge(Date age) {
		this.age = age;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNationality() {
		return this.nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public String getTactics1() {
		return this.tactics1;
	}

	public void setTactics1(String tactics1) {
		this.tactics1 = tactics1;
	}

	public String getTactics2() {
		return this.tactics2;
	}

	public void setTactics2(String tactics2) {
		this.tactics2 = tactics2;
	}

	public List<Team> getTeams() {
		return this.teams;
	}

	public void setTeams(List<Team> teams) {
		this.teams = teams;
	}

	public Team addTeam(Team team) {
		getTeams().add(team);
		team.setCoach(this);

		return team;
	}

	public Team removeTeam(Team team) {
		getTeams().remove(team);
		team.setCoach(null);

		return team;
	}

	@Override
	public String[] getTableHeaders() {
		return new String[]{"Ім'я", "Національність", "Дата народження", "Тактика 1", "Тактика 2", "id"};
	}

	@Override
	public Object[] getTableRowData() {
		return new Object[]{name, nationality, age, tactics1, tactics2, id};
	}

	@Override
	public int getObjectId() {
		return id;
	}

	@Override
	public void setObjectId(int id) {
		setId(id);
	}

	@Override
	public void updateWith(Object mask) {
		Coach obj = (Coach)mask;
		name = obj.getName();
		nationality = obj.getNationality();
		age = obj.getAge();
		tactics1 = obj.getTactics1();
		tactics2 = obj.getTactics2();
	}

}