import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AddmethodsofmotivationComponent } from './addmethodsofmotivation.component';

describe('AddmethodsofmotivationComponent', () => {
  let component: AddmethodsofmotivationComponent;
  let fixture: ComponentFixture<AddmethodsofmotivationComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ AddmethodsofmotivationComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(AddmethodsofmotivationComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
