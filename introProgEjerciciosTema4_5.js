/*
Por último, para el Switch, deberás crear la variable estacion, y distintos case para las cuatro estaciones del año. Dependiendo del valor de la variable estacion se deberá mandar un mensaje por consola informando de la estación en la que está. También habrá que poner un default para cuando el valor de la variable no sea una estación.
*/

var estacion = "verano";

switch (estacion) {
    case "primavera":
        console.log("Es primavera");
        break;
    case "verano":
        console.log("Es verano");
        break;
    case "otoño":
        console.log("Es otoño");
        break;
    case "invierno":
        console.log("Es invierno");
        break;
    default:
        console.log("La estación ingresada no es válida.");
}
