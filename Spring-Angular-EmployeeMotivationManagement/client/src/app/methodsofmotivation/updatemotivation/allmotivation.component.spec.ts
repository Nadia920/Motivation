import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AllmotivationComponent } from './allmotivation.component';

describe('AllmotivationComponent', () => {
  let component: AllmotivationComponent;
  let fixture: ComponentFixture<AllmotivationComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ AllmotivationComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(AllmotivationComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
