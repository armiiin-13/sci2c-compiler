PROGRAM progOpcional ;

INTEGER, PARAMETER :: max_val = 10, min_val = 0;
INTEGER, PARAMETER :: bin_val = b`011`, oct_val = o`740`, hex_val = z`A34`;
REAL, PARAMETER :: pi = 3.1415, e = 2.71828;

INTEGER :: contador = 0, acumulador = 0, opcion = 2, resultado = 0;
INTEGER :: limite = 5, incremento = 1;
REAL :: total = 0.0, promedio = 0.0;
CHARACTER(10) :: mensaje1 = 'Hola', mensaje2 = 'Mundo';

INTERFACE

 SUBROUTINE ImprimirMensaje(texto)
 CHARACTER(10), INTENT(IN) texto;
 END SUBROUTINE ImprimirMensaje

 SUBROUTINE Actualizar(valor, acumulado)
 INTEGER, INTENT(IN) valor;
 INTEGER, INTENT(INOUT) acumulado;
 END SUBROUTINE Actualizar

 FUNCTION Sumar(a, b)
 INTEGER :: Sumar;
 INTEGER, INTENT(IN) a;
 INTEGER, INTENT(IN) b;
 END FUNCTION Sumar

END INTERFACE

! Asignaciones y llamada simple
contador = contador + 1;
total = total + 45.6;
CALL ImprimirMensaje('Inicio');

! IF de una sola sentencia
IF (contador > min_val) acumulador = acumulador + contador;

! IF THEN sin ELSE
IF ((contador >= 1) .AND. .TRUE.) THEN
 acumulador = acumulador + 1;
 resultado = Sumar(acumulador, contador);
ENDIF

! IF THEN ELSE con operadores logicos
IF ((resultado > 5) .OR. .FALSE.) THEN
 total = total + 10.0;
 CALL ImprimirMensaje('Mayor');
ELSE
 total = total + 1.0;
 CALL ImprimirMensaje('Menor');
ENDIF

! IF con NOT, EQV y NEQV
IF (.NOT. ((contador == 0) .EQV. .FALSE.)) THEN
 acumulador = acumulador + 2;
ELSE
 acumulador = acumulador - 2;
ENDIF

IF (((contador /= 3) .NEQV. .FALSE.) .AND. (acumulador >= 0)) THEN
 resultado = resultado + 1;
ENDIF

! DO WHILE
DO WHILE ((contador < limite) .AND. (acumulador >= 0))
 contador = contador + 1;
 acumulador = acumulador + contador;
 CALL Actualizar(contador, acumulador);
ENDDO

! DO tipo FOR
DO contador = min_val, max_val, incremento
 resultado = resultado + contador;

 IF (contador == 3) THEN
  CALL ImprimirMensaje('Tres');
 ELSE
  total = total + 1.0;
 ENDIF

ENDDO

! SELECT CASE con casos simples, multiples, rangos y default
SELECT CASE (opcion)

 CASE (0)
  CALL ImprimirMensaje('Cero');
  resultado = resultado + 100;

 CASE (1, 2, 3)
  CALL ImprimirMensaje('UnoDosTres');
  resultado = resultado + 200;

 CASE (4 : 6)
  CALL ImprimirMensaje('Rango');
  resultado = resultado + 300;

 CASE (: 8)
  CALL ImprimirMensaje('HastaOcho');
  resultado = resultado + 400;

 CASE (9 :)
  CALL ImprimirMensaje('DesdeNueve');
  resultado = resultado + 500;

 CASE DEFAULT
  CALL ImprimirMensaje('Default');
  resultado = resultado - 1;

END SELECT

promedio = total / 2.0;

END PROGRAM progOpcional


SUBROUTINE ImprimirMensaje(texto)
 CHARACTER(10), INTENT(IN) texto;

 CALL MostrarEnPantalla(texto);

END SUBROUTINE ImprimirMensaje


SUBROUTINE Actualizar(valor, acumulado)
 INTEGER, INTENT(IN) valor;
 INTEGER, INTENT(INOUT) acumulado;

 acumulado = acumulado + valor;

 IF (acumulado > 50) THEN
  acumulado = acumulado - 10;
 ELSE
  acumulado = acumulado + 1;
ENDIF

END SUBROUTINE Actualizar


FUNCTION Sumar(a, b)
 INTEGER :: Sumar;
 INTEGER, INTENT(IN) a;
 INTEGER, INTENT(IN) b;

 INTEGER :: suma;

 suma = a + b;

 IF (suma >= 0) THEN
  suma = suma + 0;
 ELSE
  suma = 0 - suma;
ENDIF

 Sumar = suma;

END FUNCTION Sumar