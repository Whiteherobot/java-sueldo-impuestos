# java-sueldo-impuestos

Tarea de Programación Orientada a Objetos (Unidad 2, abril de 2022), segunda
parte del ejercicio del empleado ([java-empleado-pago](https://github.com/Whiteherobot/java-empleado-pago)).
El programa pide los datos de un trabajador y calcula, paso a paso:

- El sueldo mensual (horas × valor por hora).
- Las horas extra, pagadas al doble.
- El sueldo anual, con y sin horas extra.
- Los ingresos con un bono del 2% del sueldo por cada año de antigüedad.
- El impuesto mensual según el tramo del sueldo:

| Sueldo mensual | Impuesto |
|---|---|
| menos de $500 | 0% |
| $500 a $1.000 | 5% |
| $1.000 a $2.000 | 12% |
| más de $2.000 | 25% |

## Ejecutar

Con JDK 11 o superior y Maven:

```bash
mvn compile
java -cp target/classes com.mycompany.empleado_02.Principal
```

```
Nombre del Empleado:
Ana Torres
¿Cuántas horas laboró durante el mes?:
160
¿Cuál es el valor por hora trabajada?:
5,50
El sueldo del trabajador mensual es de: $880
Indique el número de horas extras trabajadas:
10
El total de horas extras es de: $110
El sueldo del trabajador anual es de: $10560
El sueldo del trabajador anual incluidas las horas extras es de: $11880
Indique el año de ingreso:
2018
Los ingresos mensuales con antigüedad son: $1020
El impuesto mensual es: $44
```

## Notas

La entrega original no compilaba: imprimía un atributo `impuesto` que no existía
y nunca llamaba a `calcularImpuesto()`. Ese método además devolvía siempre 0
(`(int)0.12*horas` convierte el 0,12 a entero antes de multiplicar), calculaba
sobre las horas en lugar del sueldo y dejaba sin tramo los sueldos de $100 a
$500. En 2026 se corrigió todo eso, el valor por hora pasó a aceptar decimales,
el nombre acepta espacios y la antigüedad se calcula con el año actual. La
estructura del programa se mantiene como se entregó.

## Autor

Michael Lata ([@Whiteherobot](https://github.com/Whiteherobot))
