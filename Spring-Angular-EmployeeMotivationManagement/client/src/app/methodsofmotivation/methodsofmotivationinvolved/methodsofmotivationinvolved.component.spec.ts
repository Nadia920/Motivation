import { ComponentFixture, TestBed } from '@angular/core/testing';

import { MethodsofmotivationinvolvedComponent } from './methodsofmotivationinvolved.component';

describe('MethodsofmotivationinvolvedComponent', () => {
  let component: MethodsofmotivationinvolvedComponent;
  let fixture: ComponentFixture<MethodsofmotivationinvolvedComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ MethodsofmotivationinvolvedComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(MethodsofmotivationinvolvedComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
