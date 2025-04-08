function Countdown()
{

let SecondsLeft = 10;
let MinutesLeft = 0;


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
                let url = "http://localhost:8080/NewCycle"
                FazPost(url,Cycle)







            }
        }

    }
    else
    {
        console.log("um erro ocorreu")
    }

    let interval = setInterval(CountdownReduce,1000)
}


function FazPost(URL,body)
{
        let url_server = URL
        let request = new XMLHttpRequest()
            request.open("Post",url_server,true)
            request.setRequestHeader("Content-type","application/json")
            request.send(JSON.stringify(body))

            request.onload = function ()
            {
                console.log(this.responseText)
            }
            return request.responseText
}

const Cycle = {
    Username: "Marcelo",
    CycleName: "matematica",
    CycleId: "0010",
    CycleConclusion: true,
}
