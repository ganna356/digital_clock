function updateClock() {
    var now = new Date();
    var hours = now.getHours();
    var minutes = now.getMinutes();
    var seconds = now.getSeconds();
    var date = now.toDateString(); 

    hours = (hours < 10) ? "0" + hours : hours;
    minutes = (minutes < 10) ? "0" + minutes : minutes;
    seconds = (seconds < 10) ? "0" + seconds : seconds;

    document.getElementById("hour").textContent = hours;
    document.getElementById("minit").textContent = minutes;
    document.getElementById("secound").textContent = seconds;
    document.getElementById("date").textContent = date;
}

setInterval(updateClock, 1000);