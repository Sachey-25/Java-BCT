//Attribute Directives
import { Directive, ElementRef, HostListener, Input } from "@angular/core";

//How to use the directives
@Directive({
    selector:'[appHightlight]'
})
export class HighlightDirective {

    @Input() appHightlight=''
    
    @HostListener('mouseenter') onMouseEnter(){
        this.hightlight(this.appHightlight);
    }
    @HostListener('mouseleave') onMouseLeave(){
        this.hightlight('');
    }
    constructor(private el:ElementRef){
        el.nativeElement.style.backgroundColor= this.appHightlight;
               
    }
    private hightlight(color:string){
        this.el.nativeElement.style.backgroundColor=color
    }
}