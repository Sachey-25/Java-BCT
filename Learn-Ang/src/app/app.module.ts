import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HelloWorldComponent } from './hello-world.component';
import { ParentComponent } from './parent/parent.component';
import { ChildComponent } from './child/child.component';
import { ChildoneComponent } from './childone/childone.component';
import { AppSizerComponent } from './app-sizer/app-sizer.component';
import { FormsModule } from '@angular/forms';
import { HighlightDirective } from './highlights.directives';
import { LogService } from './log.service';

@NgModule({
  declarations: [
    AppComponent,
    HelloWorldComponent,
    ParentComponent,
    ChildComponent,
    ChildoneComponent,
    AppSizerComponent,
    //we need to take class name;
    HighlightDirective

  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule
  ],
  providers: [LogService],
  bootstrap: [AppComponent]
})
export class AppModule { }
