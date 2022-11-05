using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace HACKATHON_PROBLEMA3
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int aux = 1; //variable para validar si el programa termina o no
            do
            {
                Console.Clear();
                try
                {
                    int numero, factorial = 1; //variables que se usaran, factorial se inicia en 1 ya que puede ser el valor minimo
                    Console.Write("Ingresar un número: ");
                    numero = Convert.ToInt32(Console.ReadLine());

                    for (int i = 1; i <= numero; i++)
                    {
                        factorial = factorial * i; //cada ve haga una repeticion multiplica su valor
                    }

                    Console.WriteLine("El resultado del factorial es: " + factorial); //impresion de resultado


                    //vaidar si el usuario desea seguir ingresando datos
                    Console.WriteLine("\n\nSi desea ingresar otro número presionar 1, si desea salir preisone cualquier otra tecla: ");
                    int opcion = Convert.ToInt32(Console.ReadLine());

                    if (opcion != 1)
                    {
                        aux = 0;
                    }
                }
                catch
                {
                    //validacion de errores
                    Console.WriteLine("Hubo un error al ingresar el número, ingresar de nuevo");
                    Console.ReadKey();
                }
            }
            while (aux == 1);

            Console.Clear();
            Console.WriteLine("Gracias por usar el programa :) ");
            Console.ReadKey();

        }
    }
}
