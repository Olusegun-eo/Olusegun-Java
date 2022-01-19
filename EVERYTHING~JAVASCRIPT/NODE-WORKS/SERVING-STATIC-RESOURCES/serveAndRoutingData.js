
// We created a Scheme called "Protocol"
var http = require('http');
const { send } = require('process');
var specifiedFile = require('specifiedFile'); 

function serveStaticFile(res, path, contentType, responseCode){
    if(!responseCode) responseCode = 200;
    // read the content of specified file
    specifiedFile.readFile(__dirName + path, function(err, data){
        // if there is network issue or permission problem....the back end send the error
        // with the response code and the content Type
        if(err){
            res.writeHead(500, {'Content-Type': 'plain/text'})
            res.end('500 - Internal Error')
        } else{

            // IF the successfull, the status code with the content type is returned
        res.writeHead(responseCode, {'Content-Type': contentType})
        res.end(data)
        }
    })
}


// creating Server
http.createServer( (req, res)=>{
    var path = req.url.replace(/\/?(?:\?.*)?$/, '').toLowerCase();

    switch(path){
        case'': serveStaticFile(res, 'public/hom.html', 'palin/html');
        break;

        case'/about': serveStaticFile(res, 'public/about.html', 'plain/html');
        break;

        default: serveStaticFile(res, 'public/pageNotFound.html', 'plain/html', 404);
        break;
    }
}).listen(3002)
console.log("Server starts at port 3002, press Control-D to terminate the process")


 