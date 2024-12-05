package com.example.Servidorsura6.controladores;

import com.example.Servidorsura6.modelos.Usuario;
import com.example.Servidorsura6.modelos.Vehiculo;
import com.example.Servidorsura6.servicios.UsuarioServicio;
import com.example.Servidorsura6.servicios.VehiculoServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/vehiculo")
public class ControladorVehiculo {
    @Autowired
    VehiculoServicio vehiculoServicio;

    //Llamamos al que guarda --> el signo de ? significa "depende"
    public ResponseEntity<?> guardar(@RequestBody Vehiculo datos)throws Exception{
        try{
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(vehiculoServicio.guardarVehiculo(datos));

        }catch (Exception error){
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(error.getMessage());
        }
    }
}
