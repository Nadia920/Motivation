import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AddMethodsOfMotivationInvolvedComponent } from './addmethodsofmotivation.component';

describe('AddMethodsOfMotivationInvolvedComponent', () => {
  let component: AddMethodsOfMotivationInvolvedComponent;
  let fixture: ComponentFixture<AddMethodsOfMotivationInvolvedComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ AddMethodsOfMotivationInvolvedComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(AddMethodsOfMotivationInvolvedComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
