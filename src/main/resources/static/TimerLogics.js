//polir essa funcao,adicionar.
    //bug 1: stop reinicia o timer.


    function Countdown()
    {

    let SecondsLeft = 10;
    let MinutesLeft = 0;

    document.getElementById("minutes").innerHTML = MinutesLeft
    document.getElementById("seconds").innerHTML =  ":"+SecondsLeft

        if (SecondsLeft < 60 && MinutesLeft < 60)
        {

            function CountdownReduce ()
            {



                document.getElementById("seconds").innerHTML = ":"+SecondsLeft
                SecondsLeft--;

                if(SecondsLeft<10)
                {
                    document.getElementById("seconds").innerHTML = ":0"+SecondsLeft
                }



            if (SecondsLeft == 0 && MinutesLeft >= 1)
            {
                SecondsLeft = 59;
                MinutesLeft--;
                document.getElementById("minutes").innerHTML = MinutesLeft
                    if(MinutesLeft<1)
                    {
                        document.getElementById("minutes").innerHTML = "00:"
                    }

                    if(MinutesLeft<=9)
                    {
                        document.getElementById("minutes").innerHTML = "0" +MinutesLeft
                    }
            }

            if(MinutesLeft == 0 && SecondsLeft == 0)
            {
                clearInterval(interval);
                let url = "http://localhost:8080/NewCycle"
                FazPost(url,Cycle)

            }



            window.CountdownStop = function ()
            {
                clearInterval(interval);
            };
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
