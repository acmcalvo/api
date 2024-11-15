package med.voll.api.medico;


import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import med.voll.api.direccion.DatosDireccion;

public record DatosRegistroMedico(

        @NotBlank
        String nombre,

        @NotBlank
        String email,

        @NotBlank
        String telefono,

        @NotBlank
        String documento,

        @NotNull
        Especialidad especialidad,

@NotNull
        @Valid
        DatosDireccion direccion) {
}


