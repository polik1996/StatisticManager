package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the "Player" database table.
 * 
 */
@Entity
@Table(name="\"Player\"")
@NamedQuery(name="Player.findAll", query="SELECT p FROM Player p")
public class Player implements Serializable, DataBaseModel {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;

	@Temporal(TemporalType.DATE)
	private Date age;

	private Integer asists;

	private Integer goals;

	private Integer matches;

	private Integer minutes;

	private String name;

	private Integer number;

	private String position;

	//bi-directional many-to-one association to Team
	@ManyToOne
	@JoinColumn(name="team_code")
	private Team team;

	public Player() {
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

	public Integer getAsists() {
		return this.asists;
	}

	public void setAsists(Integer asists) {
		this.asists = asists;
	}

	public Integer getGoals() {
		return this.goals;
	}

	public void setGoals(Integer goals) {
		this.goals = goals;
	}

	public Integer getMatches() {
		return this.matches;
	}

	public void setMatches(Integer matches) {
		this.matches = matches;
	}

	public Integer getMinutes() {
		return this.minutes;
	}

	public void setMinutes(Integer minutes) {
		this.minutes = minutes;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getNumber() {
		return this.number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getPosition() {
		return this.position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public Team getTeam() {
		return this.team;
	}

	public void setTeam(Team team) {
		this.team = team;
	}

	@Override
	public String[] getTableHeaders() {
		return new String[]{"id", "��'�", "�����", "���� ����������", "������", "����",
				"������", "������ �� ���", "�������", "������� �����"};
	}

	@Override
	public Object[] getTableRowData() {
		return new Object[]{id, name, team.getName(), age, matches, goals,
				asists, minutes, position, number};
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
		Player obj = (Player)mask;
		name = obj.getName();
		team = obj.getTeam();
		age = obj.getAge();
		matches = obj.getMatches();
		goals = obj.getGoals();
		asists = obj.getAsists();
		minutes = obj.getMinutes();
		position = obj.getPosition();
		number = obj.getNumber();
	}

}