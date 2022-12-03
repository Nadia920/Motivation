import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ShowyourmotivationComponent } from './showyourmotivation.component';

describe('ShowyourmotivationComponent', () => {
  let component: ShowyourmotivationComponent;
  let fixture: ComponentFixture<ShowyourmotivationComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ShowyourmotivationComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(ShowyourmotivationComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
