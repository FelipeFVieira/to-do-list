package com.senai.springBootToDoList.model;

import java.util.List;

import com.senai.springBootToDoList.web.dto.UserDto;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;


@Entity
@Table(name = "users")
@Getter @Setter
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@NotBlank
	@NotNull
	@Column(name = "first_name", length = 100)
	private String name;
	
	@NotBlank
	@NotNull
	@Column(name = "last_name", length = 100)
	private String lastName;
	
	@NotBlank
	@NotNull
	@Column(name = "email", length = 150)
	private String email;
	
	@NotBlank
	@NotNull
	@Column(name = "password", length = 255)
	private String password;
	
	@OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
	private List<Task> tasks;
	
	public static User toUser(UserDto userDto){
        User user = new User();
        user.setEmail(userDto.getEmail());
        return user;
    }

//    public static PastelResponseDto toDto(Pastel pastel){
//        PastelResponseDto dto = new PastelResponseDto();
//        dto.setId(pastel.id);
//        dto.setSabor(pastel.sabor);
//        dto.setAcompanhamento(pastel.acompanhamento);
//        return dto;
//    }
//
//    public static List<PastelResponseDto> toListDto(List<Pastel> pasteis){
//        List<PastelResponseDto> dtos = new ArrayList<>();
//        for (Pastel pastel : pasteis){
//            dtos.add(pastel.toDto(pastel));
//        }
//        return dtos;
//    }
//	
	

}
