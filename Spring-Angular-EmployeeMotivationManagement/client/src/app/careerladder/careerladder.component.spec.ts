import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CareerladderComponent } from './careerladder.component';

describe('CareerladderComponent', () => {
  let component: CareerladderComponent;
  let fixture: ComponentFixture<CareerladderComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ CareerladderComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(CareerladderComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
