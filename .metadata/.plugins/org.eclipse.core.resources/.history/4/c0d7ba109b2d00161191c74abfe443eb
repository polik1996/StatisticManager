package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the game database table.
 * 
 */
@Entity
@NamedQuery(name="Game.findAll", query="SELECT g FROM Game g")
public class Game implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;

	@Temporal(TemporalType.DATE)
	private Date date;

	private String score;

	//bi-directional many-to-one association to Team
	@ManyToOne
	@JoinColumn(name="team_1")
	private Team team1Bean;

	//bi-directional many-to-one association to Team
	@ManyToOne
	@JoinColumn(name="team_2")
	private Team team2Bean;

	//bi-directional many-to-one association to Team
	@ManyToOne
	@JoinColumn(name="winner_code")
	private Team team3;

	public Game() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getDate() {
		return this.date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getScore() {
		return this.score;
	}

	public void setScore(String score) {
		this.score = score;
	}

	public Team getTeam1Bean() {
		return this.team1Bean;
	}

	public void setTeam1Bean(Team team1Bean) {
		this.team1Bean = team1Bean;
	}

	public Team getTeam2Bean() {
		return this.team2Bean;
	}

	public void setTeam2Bean(Team team2Bean) {
		this.team2Bean = team2Bean;
	}

	public Team getTeam3() {
		return this.team3;
	}

	public void setTeam3(Team team3) {
		this.team3 = team3;
	}

}