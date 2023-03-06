package com.blog.payloads;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class CategoryDto {

	private Integer categoryId;
	
	@NotBlank
	@Size(min=4,message = "category title must be min of 4 characters")
	private String categoryTitle;
	
	@NotBlank
	@Size(min = 6, message = "category description must be min of 6 characters")
	private String categoryDescription;
}
