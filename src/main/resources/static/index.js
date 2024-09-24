
let json;
let jObject;
let GML;
let txtCount = 0;
let gmldata;

function getFeatureClass(){
    const requestOptions = {
        method: "GET",
        redirect: "follow"
    };
    
    fetch("http://localhost:8080/types?fileName=999_FC_1_2_0_20240515.xml", requestOptions)
    .then((response) => response.text())
    .then((response) => json = (response))
    .catch((error) => console.error(error));
}

function createFcToJSON(){
    document.getElementById("json").innerHTML = json;
    var element = document.getElementById("json");
    var obj = JSON.parse(json);
    element.innerHTML = JSON.stringify(obj, null, '  ');    
}

function createShortForm(){    
    
    $('#sform').append($("<lable>Message series identifier</lable>").css("font-weight","bold","font-size","small"));
    $('#sform').append($("<br>"));
    $('#sform').append($("<input id='msi' value='NW-M-1319-24' type='text'>"));
    $('#sform').append($("<br>"));
    $('#sform').append($("<lable>General area</lable>").css("font-weight","bold","font-size","small", "white-space: pre-line"));
    $('#sform').append($("<br>"));
    $('#sform').append($("<input id='ga' value='Chaleur - Miscou - south' type='text'>"));
    $('#sform').append($("<br>"));
    $('#sform').append($("<lable>Locality</lable>").css("font-weight","bold","font-size","small"));
    $('#sform').append($("<br>"));
    $('#sform').append($("<input id='locality' value='Miscou Harbour' type='text'>"));
    $('#sform').append($("<br>"));
    $('#sform').append($("<lable>Chart number</lable>").css("font-weight","bold","font-size","small"));
    $('#sform').append($("<br>"));
    $('#sform').append($("<input id='cn' value='4913' type='text'>"));
    $('#sform').append($("<br>"));
    $('#sform').append($("<lable>Key subject</lable>").css("font-weight","bold","font-size","small"));
    $('#sform').append($("<br>"));
    $('#sform').append($("<textarea id='ks' value='Miscou Channel Light buoy EA5 LL 1269 Permanently disconnected' type='text'>"));
    $('#sform').append($("<br>"));
    $('#sform').append($("<lable>Geographical position</lable>").css("font-weight","bold","font-size","small"));
    $('#sform').append($("<br>"));
    $('#sform').append($("<textarea id='gp' value='47-54.325 N 064-37.977 W' type='text'>"));
    $('#sform').append($("<br>"));
    $('#sform').append($("<lable>Amplifying remarks</lable>").css("font-weight","bold","font-size","small"));
    $('#sform').append($("<br>"));
    $('#sform').append($("<input id='ar' value='' type='text'>"));
    $('#sform').append($("<br>"));
    $('#sform').append($("<lable>Cancellation details</lable>").css("font-weight","bold","font-size","small"));
    $('#sform').append($("<br>"));
    $('#sform').append($("<input id='cd' value='' type='text'>"));
    $('#sform').append($("<br>"));
}


function createForm(){
    jObject = JSON.parse(json)
    traverse_it(jObject);
    createCoorsInputElement();
}

function traverse_it(obj){
    for(var prop in obj){
        if(typeof obj[prop]=='object'){
            createHeading(prop);
            traverse_it(obj[prop]);            
        }else{
            if (prop == "text"){
                txtCount = txtCount + 1;
            }
            createFieldwithTextBox(prop);
        }
    }    
}

function createHeading(headName){
    var heading = $("<h6>" + headName + "</h6>").css("font-weight","bold", "white-space: pre-line");
    $('#form').append(heading);    
}

function createFieldwithTextBox(lableName){   
    var lable = $("<lable>" + lableName + "</lable>").css("font-weight","normal","font-size","small");
    if (lableName == "text"){
        var input = $("<input id='" + lableName + txtCount + "'value='1234' type='text'>");
    }else{        
        if (lableName.includes("Date") || lableName.includes("Time")){
            var input = $("<input id='" + lableName + "' value='2009-05-07T17:05:45.678Z' type='text'>");            
        }else{
            var input = $("<input id='" + lableName + "'value='1234' type='text'>");
        }       
    }    
    
    $('#form').append(lable);
    $('#form').append($("<br>"));
    $('#form').append(input);
    $('#form').append($("<br>"));    
}

function createCoorsInputElement(){
    var lable = $("<lable>Coors</lable>").css("font-weight","normal","font-size","small");
    var input = $("<input id='coors' value='-124.976297 49.680041' type='text'>");
    $('#form').append(lable);
    $('#form').append($("<br>"));
    $('#form').append(input);
    $('#form').append($("<br>"));
}


function fromToJSON(inputNodes){
    var jsonData = {};
    for (i=0; i< inputNodes.length; i++){
        jsonData[inputNodes[i].id] = inputNodes[i].value;
    }
    return jsonData;
}

async function createGML(){
    var inputNodes = document.getElementById('form').getElementsByTagName('input');
    var jsonData = fromToJSON(inputNodes);    

    const myHeaders = new Headers();
    myHeaders.append("Content-Type", "application/json");
    
    const raw = JSON.stringify(jsonData);
    
    const requestOptions = {
        method: "POST",
        headers: myHeaders,
        body: raw,
        redirect: "follow"
    };
    
    const response = await fetch("http://localhost:8080/gml", requestOptions);    
    gmldata = await response.text();
    console.log(gmldata);

    document.getElementById("gml").innerHTML = gmldata;
}

function getGMLdata(){
    return gmldata;
}
