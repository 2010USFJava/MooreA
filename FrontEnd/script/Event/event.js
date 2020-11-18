function pow(event){
    element = event.currentTarget;
    element.style.backgroundColor="green";
    alert(element.id);
}

window.onload=function(){
    this.document.getElementById("A").addEventListener("click", pow,true);
    this.document.getElementById("B").addEventListener("click", pow,1);
    this.document.getElementById("C").addEventListener("click", pow,(5=="5"));
    this.document.getElementById("D").addEventListener("click", pow,false);
}