import { ComponentFixture, TestBed } from '@angular/core/testing';

import { WorktatisticsComponent } from './worktatistics.component';

describe('WorkStatisticsComponent', () => {
  let component: WorktatisticsComponent;
  let fixture: ComponentFixture<WorktatisticsComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ WorktatisticsComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(WorktatisticsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
