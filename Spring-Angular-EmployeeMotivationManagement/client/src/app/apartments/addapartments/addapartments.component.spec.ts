import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AddapartmentsComponent } from './addapartments.component';

describe('AddapartmentsComponent', () => {
  let component: AddapartmentsComponent;
  let fixture: ComponentFixture<AddapartmentsComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ AddapartmentsComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(AddapartmentsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
