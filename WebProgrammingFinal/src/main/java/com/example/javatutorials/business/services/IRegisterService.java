package com.example.javatutorials.business.services;

import com.example.javatutorials.business.dto.RegisterDto;
import com.example.javatutorials.data.entity.RegisterEntity;
import java.util.List;
import java.util.Map;

public interface IRegisterService {

    // MODEL MAPPER
    public RegisterDto EntityToDto(RegisterEntity userRegisterEntity  );
    public RegisterEntity DtoToEntity(RegisterDto userRegisterDto);

    // CREATE
    public RegisterDto createRegister(RegisterDto userRegisterDto);

    // LIST
    public List<RegisterDto> getAllRegisters();


    // FIND ID
    public RegisterDto getFindByRegisterId(Long id);

    // DELETE
    public Map<String,Boolean>  deleteRegister(Long id);

    // UPDATE
    public RegisterDto updateRegister(Long id, RegisterDto userRegisterDto);
}
