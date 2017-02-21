$(document).ready(function() {
    $.ajax({
        url: "http://localhost:9001/user?id=1"
    }).then(function(data, status, jqxhr) {
       $('.firstname').append(data.firstname);
       $('.lastname').append(data.lastname);
       console.log(jqxhr);
    });
});