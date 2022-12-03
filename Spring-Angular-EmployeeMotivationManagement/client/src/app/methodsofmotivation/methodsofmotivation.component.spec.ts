import { ComponentFixture, TestBed } from '@angular/core/testing';

import { MethodsofmotivationComponent } from './methodsofmotivation.component';

describe('MethodsofmotivationComponent', () => {
  let component: MethodsofmotivationComponent;
  let fixture: ComponentFixture<MethodsofmotivationComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ MethodsofmotivationComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(MethodsofmotivationComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
