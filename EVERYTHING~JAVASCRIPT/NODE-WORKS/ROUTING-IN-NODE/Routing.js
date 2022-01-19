// How to Route Different url `

// Create the Request
const http = require('http');
http.createServer( (request, resource) =>{
  // normalize url by removing querystring, optional
  // trailing slash, and making it lowercase
  
  var path = request.url.replace(/\/?(?:\?.*)?$/, '').toLowerCase();
    switch(path){
    case '':
      resource.writeHead(200, "Content-Type", "plain/html");
      resource.end("<h1>Homepage</>");
      break;
    case '/about':
      resource.writeHead(200, "Content-Type", "plain/html");
      resource.end("<h1>About</h1>");
      break;
    default:
      resource.writeHead(200, "Content-Type", "plain/html");
      resource.end("<h1>Not Found Page</h1>");
      break;
  }
}).listen(3001)
console.log('The Server Starts from port 3001, press Contorl-D to terminate the process')

