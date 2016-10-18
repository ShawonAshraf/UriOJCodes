using System;

namespace URI_1170
{
    class Program
    {
        static void Main(string[] args)
        {
            int testCase;
            float x;

            testCase = Int32.Parse(Console.ReadLine());
            for(int i =0; i < testCase; i++)
            {
                x = float.Parse(Console.ReadLine());
                int c = 0;

                while(x > 1)
                {
                    x /= 2;
                    c++;
                }

                Console.WriteLine("{0} dias", c);
            }
        }
    }
}
