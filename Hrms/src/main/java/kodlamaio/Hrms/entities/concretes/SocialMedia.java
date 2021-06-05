package kodlamaio.Hrms.entities.concretes;


import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler", "circuliumVitaes"})
@Table(name = "school")
public class SocialMedia {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
    
    @Column(name = "social_media_name")
    private String social_media_name;
    
    @Column(name = "link_url")
    private String link_url;
    
    
    @JsonIgnore
	@OneToMany(mappedBy = "social_media")
	private List<CirculiumVitae> circuliumVitaes;
    
}
