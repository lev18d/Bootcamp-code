/**
 * Created by itc_user on 5/30/2016.
 */
var x="than he want away";


for(t=0;t<=x.length;t++){
    if(x[t]==='a'){
        x = x.substr(0,t-1)+'e'+ x.substr(t+1,x.length);
    }


}
console.log(x)