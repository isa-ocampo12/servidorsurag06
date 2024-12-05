package com.example.Servidorsura6.servicios;

import com.example.Servidorsura6.modelos.Usuario;
import com.example.Servidorsura6.repositorios.IUsuarioRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioServicio {

    //Llamando al repositorio de usuario

    //Autowired sirve para traer la clase
    @Autowired
    private IUsuarioRepositorio iUsuarioRepositorio;

    //Se crean métodos para definir las operaciones a realizar en la BD

    //1. Registar o guardar un usuario.
    public Usuario guardarUsuario(Usuario datosUsuario)throws Exception{
        try{
            return this.iUsuarioRepositorio.save(datosUsuario);

        }catch (Exception error){
            throw new Exception(error.getMessage());
        }
    }
    //2. Buscar todos los usuarios.
    public  List<Usuario> buscarUsuarios()throws Exception{
        try {
            return this.iUsuarioRepositorio.findAll();

        }catch (Exception error){
            throw new Exception(error.getMessage());
        }
    }
    //3.
}
