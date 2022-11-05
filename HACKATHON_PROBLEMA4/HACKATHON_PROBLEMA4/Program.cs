using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace HACKATHON_PROBLEMA4
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int aux = 1; // variable para ver  si desea que se repita el programa
            do
            {
                Console.Clear();
                try
                {
                    //declaración de variables
                    int amigos, porciones;
                    //indicacion de instrucciones
                    Console.WriteLine("Ingrese, en el siguiente orden, la cantidad de amigos que son y cuantas porciones quiere cada uno:");
                    Console.Write("Cantidad de amigos: ");
                    amigos = Convert.ToInt32(Console.ReadLine()); //ingresar cantidad de amigos
                    Console.Write("Cantidad de porciones: ");
                    porciones = Convert.ToInt32(Console.ReadLine()); //ingresar cantidad de porciones
                    Program obj = new Program(); // se crea este objeto para mandar a llamar el metodo
                    int pasteles = obj.CalcularPasteles(amigos, porciones); //

                    Console.WriteLine("Se necesitarán un total de: " + pasteles + " pasteles.");

                    //preguntar al usuario que quiere repetir el programa
                    Console.WriteLine("\n\nSi desea repetir con otros datos presionar 1, si desea salir preisone cualquier otra tecla: ");
                    int opcion = Convert.ToInt32(Console.ReadLine());

                    if (opcion != 1)
                    {
                        aux = 0;
                    }
                }
                catch
                {
                    //validacion de errores al ingresar datos
                    Console.WriteLine("Se ha cometido un error al ingresar los datos, ingresar de nuevo.");
                    Console.ReadKey();
                }
            }
            while (aux == 1);

            Console.Clear();
            Console.WriteLine("Gracias por usar el programa :) ");
            Console.ReadKey();
        }      
        //metodo que se declara para obtener la cantidad de pasteles, devuelve directamente el numero
        public int CalcularPasteles(int amigos, int porciones)
        {
            decimal pasteles;
            decimal mult = amigos * porciones;
            pasteles = Math.Ceiling(mult / 4); //se aproxima para arriba, de ser necesario

            return Convert.ToInt32(pasteles);
        }
    }
}
