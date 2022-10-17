import { NgClass } from '@angular/common';
import { Component,OnInit,OnDestroy, Renderer2, ElementRef } from '@angular/core';
import { LogService } from './log.service';

@Component({
  selector: 'app-root',
  template: ` 
      <div 
      [style]=" 'width:200px; height:200px; background:red ' "></div>
      <div
      [style]="{
        width:'200px',
        height:'200px', 
        background:'green'
      }"></div>
      <!--event binding-->
    <button (click)="onSave()">save </button>
    <!--OnEdit, onUpdate, onDelete-->
    <div [ngClass]="currentClasses">Example</div>
    <div [ngStyle]="currentStyle">ClassStyle - ngStyle</div>
    
    <input [(ngModel)]="name" id="example" /><br/>
    <label for="Example">{{name}}</label>
    <p [appHightlight]=" 'red' " style="text-align: center;">Danger</p>
    <p [appHightlight]=" 'yellow'  " style="text-align: center;">Wanring</p>
    <p [appHightlight]=" 'black' "style="text-align: center;">dark</p>
    <p [appHightlight]=" 'green' " style="text-align: center;">Success</p>
    <button [appHightlight]=" 'green' " >Success </button>
    <div *ngIf="isShow">Active </div>
    <div *ngFor="let x of items; let i=index">{{i}}-{{x.name}}</div>
    <hr/>
    <div [ngSwitch]="item.name">
      <div *ngSwitchCase="'case 1'">Hi Sachin </div>
      <div *ngSwitchCase="'case 2'">Is this your lastname? </div>
      <div *ngSwitch="'Bangalore'">Do you belong to Bangalore? </div>
      <h2>This is rendered object </h2>
      <h2>This is rendered object </h2>
      <h2>This is rendered object </h2>
      <h2>This is rendered object </h2>
      <h2>This is rendered object </h2>
      <h2>This is rendered object </h2>     

    `,
  //templateUrl:'./app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit{
  constructor(
    private logService:LogService, 
    private renderer:Renderer2,
    private host:ElementRef){

    }

  isSpecial=true;
  currentClasses={};
  currentStyle={};
  name="Sachin";

  isShow=true;

   items=[
     {name:'Sachin'},
     {name:'Anil'},
     {name:'Bangalore'}
   ]
  item= {name :'case 1'}

  ngOnInit(){
    this.setcurrentClasses();
    this.setcurrentStyle();
    this.logService.logMessage("Your account created successfully!")
    this.renderer.setStyle(this.host.nativeElement,'color','brown');
  }
  setcurrentClasses(){
    this.currentClasses={
      saveable:true,
      modified:false,
      special:true
    }
  }
  setcurrentStyle(){
    this.currentStyle={
      'font-style':'italic',
      'font-wight':'bold',
      'font-family':'verdana',
      'color':'blue'
    }
  }

  fontSizepx=16;

  itemImageUrl='../assets/phone.jpg'
  isUnchanged=true;
  changed=true;

  onSave(){
    console.log("Click on Save");
  }
  //Text interpretation.
  title="Hello World..!"
  getMin(a:any,b:any){
    if(a<b){
      return a;
    }else
    return b;
  }
}

  // I wanted this component to be loaded after some milliseconds
//  intervalSub:any;
  //make use of implemented interface - OnInit
//   constructor(){}
//   ngOnInit(): void {
//     this.intervalSub=setInterval( () => {console.log("Hello from ngOnIt"),2000});
//   }
//   ngOnDestroy(){ // Clear the component.
//     if(this.intervalSub){
//       clearInterval(this.intervalSub);
//       console.log("data is being destroyed.")
//     }
//   }

