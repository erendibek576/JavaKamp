package kodlamaio.Hrms.entities.concretes;







import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.sun.istack.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity

@Table(name = "job_position")
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler", "jobAdvertisements"})
public class JobPosition {
	
	
	        @Id
	        @GeneratedValue(strategy = GenerationType.IDENTITY)
	        @Column(name = "id")
            private int id;
	        
            @Column(name = "position_name")
            @NotBlank
            @NotNull
            private String position_name;
            
            @JsonIgnore
        	@OneToMany(mappedBy = "jobPosition")
            private List<JobAdvertisement> jobAdvertisements;
            
}
