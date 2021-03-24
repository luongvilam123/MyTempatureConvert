package com.example.mytempatureconvert;

public class Convert {
    double DoF,DoC;
    public Convert(){
    }

    public void setDoC(double doC) {
        this.DoC = doC;
    }
    public void setDoF(double doF){
        this.DoF=doF;
    }

    public double getDoC() {
        return this.DoC;
    }
    public double getDoF(){
        return this.DoF;
    }
    public double ConvertCtoF(double doC){
        return this.DoF=doC*9/5+32;
    }
    public double ConvertFtoC(double doF){
        return this.DoC=(doF-32)*5/9;
    }
}
