window.onload = function () {
  console.log("in onLoad");
  document.getElementById("vgSubmitGet").addEventListener("click", getVg);
  document.getElementById("vgFormSubmit").addEventListener("click", postVg);
};

function getVg() {
  console.log("in getVg");
  let vgid = document.getElementById("vgIDInput").value;
  var xhr = new XMLHttpRequest();
  xhr.onreadystatechange = function () {
    console.log("in OSRC " + xhr.readyState);
    if (xhr.readyState == 4 && xhr.status == 200) {
      console.log(xhr.responseText);
      var vg = JSON.parse(xhr.responseText);
      loadVG(vg);
    }
  };
  xhr.open("GET", "http://localhost:8080/JSONDemo/vg?vgid=" + vgid, true);
  xhr.send();
}

function loadVG(vg) {
  console.log("in loadVg");
  document.getElementById("vgID").innerHTML = vg.vgID;
  document.getElementById("vgName").innerHTML = vg.vgName;
  document.getElementById("vgMetaScore").innerHTML = vg.vgMetaScore;
}

function jsonBuilder(){
    var elements= document.getElementById("vgForm").elements;
    var obj={};
    for(var i=0; i<elements.length-1;i++){
        var item=elements.item(i);
        obj[item.name]=item.value;
        console.log(obj);
    }
    var json=JSON.stringify(obj);
    console.log(json);
    return json;
}

function postVg(){
    console.log("in postVG");
    var xhr= new XMLHttpRequest();
    xhr.onreadystatechange= function(){
        console.log( "in ORSC "+xhr.readyState);
        if(xhr.readyState==4 && xhr.status==200){
            console.log(xhr.responseText);
        }
    }
    xhr.open("POST","http://localhost:8080/JSONDemo/vg",true);
    var payload=jsonBuilder();
    xhr.send(payload);
}
