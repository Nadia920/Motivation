import { ComponentFixture, TestBed } from '@angular/core/testing';

import { HrmanagersComponent } from './hrmanagers.component';

describe('HrmanagersComponent', () => {
  let component: HrmanagersComponent;
  let fixture: ComponentFixture<HrmanagersComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ HrmanagersComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(HrmanagersComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
