import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AddtypesnonfinancialmotivationComponent } from './addtypesnonfinancialmotivation.component';

describe('AddtypesnonfinancialmotivationComponent', () => {
  let component: AddtypesnonfinancialmotivationComponent;
  let fixture: ComponentFixture<AddtypesnonfinancialmotivationComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ AddtypesnonfinancialmotivationComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(AddtypesnonfinancialmotivationComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
