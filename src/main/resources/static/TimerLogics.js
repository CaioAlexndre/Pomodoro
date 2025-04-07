function Countdown()
{

let SecondsLeft = 3;
let MinutesLeft = 2;


    if (SecondsLeft < 60 && MinutesLeft < 60)
    {

        function CountdownReduce ()
        {

            console.log(`Minutos: ${MinutesLeft} | Segundos: ${SecondsLeft}`);

        SecondsLeft--;
        document.getElementById("seconds").innerHTML = SecondsLeft


        if (SecondsLeft == 0 && MinutesLeft >= 1)
        {
            SecondsLeft = 59;

            console.log(MinutesLeft);
            MinutesLeft--;
            document.getElementById("minutes").innerHTML = MinutesLeft
        }

        if(MinutesLeft == 0 && SecondsLeft == 0)
        {
            clearInterval(interval);
            console.log("Tempo esgotado!");


            return true;
        }
        }

    }
    else
    {
        console.log("um erro ocorreu")
    }

    let interval = setInterval(CountdownReduce,1000)
}
