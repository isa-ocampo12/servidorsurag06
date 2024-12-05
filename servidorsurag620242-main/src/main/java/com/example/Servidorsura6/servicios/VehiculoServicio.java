package com.example.Servidorsura6.servicios;

import com.example.Servidorsura6.modelos.Usuario;
import com.example.Servidorsura6.modelos.Vehiculo;
import com.example.Servidorsura6.repositorios.IVehiculoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VehiculoServicio {
    @Autowired
    IVehiculoRepositorio iVehiculoRepositorio;

    public Vehiculo guardarVehiculo(Vehiculo datosVehiculo)throws Exception{
        try{
            return iVehiculoRepositorio.save(datosVehiculo);

        }catch (Exception error){
            throw new Exception(error.getMessage());
        }
    }
    public List<Vehiculo> buscarVehiculos()throws Exception{
        try {
            return iVehiculoRepositorio.findAll();

        }catch (Exception error){
            throw new Exception(error.getMessage());
        }
    }
}
